package com.yni.app.dto;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by leandro on 11/02/17.
 */
public class HistoryVariation {

    private List<DateAmount> dateAmounts;

    private BigDecimal totalPercentageVariation;

    private AmountVariation amountVariation;

    public HistoryVariation() {
    }

    public List<DateAmount> getDateAmounts() {
        return dateAmounts;
    }

    public void setDateAmounts(List<DateAmount> dateAmounts) {
        this.dateAmounts = dateAmounts;
    }

    public BigDecimal getTotalPercentageVariation() {
        return totalPercentageVariation;
    }

    public void setTotalPercentageVariation(BigDecimal totalPercentageVariation) {
        this.totalPercentageVariation = totalPercentageVariation;
    }

    public AmountVariation getAmountVariation() {
        return amountVariation;
    }

    public void setAmountVariation(AmountVariation amountVariation) {
        this.amountVariation = amountVariation;
    }
}
