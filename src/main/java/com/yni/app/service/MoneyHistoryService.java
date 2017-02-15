package com.yni.app.service;

import com.yni.app.dto.AmountVariation;
import com.yni.app.dto.DateAmount;
import com.yni.app.dto.HistoryVariation;
import com.yni.app.helper.DataKeeper;
import com.yni.app.helper.DateHelper;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;

import static java.math.BigDecimal.ROUND_HALF_UP;
import static java.math.BigDecimal.ZERO;

/**
 * Created by leandro on 10/02/17.
 */
@Service
public class MoneyHistoryService {

    private static final BigDecimal ONE_HUNDRED = new BigDecimal("100.00");

    public HistoryVariation getPercentageHistoryVariation() {
        List<DateAmount> dateAmounts = calculateVariation();

        HistoryVariation historyVariation = new HistoryVariation();
        historyVariation.setDateAmounts(dateAmounts);
        historyVariation.setTotalPercentageVariation(sumTotalVariation(dateAmounts));

        AmountVariation amountVariation = new AmountVariation();
        amountVariation.setInitialAmount(dateAmounts.get(0).getAmount());
        amountVariation.setIncomeAmount(dateAmounts.get(dateAmounts.size() - 1).getAmount().subtract(dateAmounts.get(0).getAmount()));

        historyVariation.setAmountVariation(amountVariation);

        return historyVariation;
    }

    private List<DateAmount> calculateVariation() {
        List<DateAmount> dateValues = DataKeeper.getData();

        BigDecimal variation = ZERO;
        for (int i = 0; i < dateValues.size(); i++) {
            DateAmount dateAmount = dateValues.get(i);
            dateAmount.setEpoch(DateHelper.getEpochZeroTime(dateAmount.getDate()));

            if (i > 0)
                variation = calculatePercentageVariation(dateAmount.getAmount(), dateValues.get(i - 1).getAmount());

            dateAmount.setPercentageVariation(variation);
        }

        return dateValues;
    }

    private BigDecimal calculatePercentageVariation(BigDecimal actualAmount, BigDecimal previousAmount) {
        //variation = ((actualAmount - previousAmount) / previousAmount) * 100
        BigDecimal difference = actualAmount.subtract(previousAmount);
        BigDecimal quotient = difference.divide(previousAmount, 5, ROUND_HALF_UP);
        BigDecimal product = quotient.multiply(ONE_HUNDRED);

        return product.setScale(3, ROUND_HALF_UP);
    }

    private BigDecimal sumTotalVariation(List<DateAmount> dateValues) {
        return dateValues.stream().map(DateAmount::getPercentageVariation).reduce(ZERO, BigDecimal::add);
    }
}
