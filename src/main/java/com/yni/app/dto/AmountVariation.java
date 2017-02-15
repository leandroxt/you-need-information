package com.yni.app.dto;

import java.math.BigDecimal;

/**
 * Created by leandro on 11/02/17.
 */
public class AmountVariation {

    private BigDecimal initialAmount;

    private BigDecimal incomeAmount;

    public AmountVariation() {
    }

    public BigDecimal getInitialAmount() {
        return initialAmount;
    }

    public void setInitialAmount(BigDecimal initialAmount) {
        this.initialAmount = initialAmount;
    }

    public BigDecimal getIncomeAmount() {
        return incomeAmount;
    }

    public void setIncomeAmount(BigDecimal incomeAmount) {
        this.incomeAmount = incomeAmount;
    }
}
