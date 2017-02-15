package com.yni.app.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * Created by leandro on 10/02/17.
 */
public class DateAmount {

    @JsonIgnore
    private LocalDate date;

    private Long epoch;

    private BigDecimal amount;

    private BigDecimal percentageVariation;

    public DateAmount() {
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Long getEpoch() {
        return epoch;
    }

    public void setEpoch(Long epoch) {
        this.epoch = epoch;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getPercentageVariation() {
        return percentageVariation;
    }

    public void setPercentageVariation(BigDecimal percentageVariation) {
        this.percentageVariation = percentageVariation;
    }
}
