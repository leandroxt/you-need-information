package com.yni.app.helper;

import com.yni.app.dto.DateAmount;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

import static java.time.Month.FEBRUARY;
import static java.time.Month.JANUARY;

/**
 * Created by leandro on 10/02/17.
 */
public class DataKeeper {

    public static List<DateAmount> getData() {
        List<DateAmount> dateAmounts = new LinkedList<>();

        DateAmount dateAmount = new DateAmount();
        dateAmount.setDate(LocalDate.of(2017, JANUARY, 19));
        dateAmount.setAmount(new BigDecimal("557.91"));
        dateAmounts.add(dateAmount);

        dateAmount = new DateAmount();
        dateAmount.setDate(LocalDate.of(2017, JANUARY, 20));
        dateAmount.setAmount(new BigDecimal("558.21"));
        dateAmounts.add(dateAmount);

        dateAmount = new DateAmount();
        dateAmount.setDate(LocalDate.of(2017, JANUARY, 23));
        dateAmount.setAmount(new BigDecimal("558.52"));
        dateAmounts.add(dateAmount);

        dateAmount = new DateAmount();
        dateAmount.setDate(LocalDate.of(2017, JANUARY, 24));
        dateAmount.setAmount(new BigDecimal("616.99"));
        dateAmounts.add(dateAmount);

        dateAmount = new DateAmount();
        dateAmount.setDate(LocalDate.of(2017, JANUARY, 26));
        dateAmount.setAmount(new BigDecimal("617.10"));
        dateAmounts.add(dateAmount);

        dateAmount = new DateAmount();
        dateAmount.setDate(LocalDate.of(2017, JANUARY, 27));
        dateAmount.setAmount(new BigDecimal("617.37"));
        dateAmounts.add(dateAmount);

        dateAmount = new DateAmount();
        dateAmount.setDate(LocalDate.of(2017, FEBRUARY, 1));
        dateAmount.setAmount(new BigDecimal("618.40"));
        dateAmounts.add(dateAmount);

        dateAmount = new DateAmount();
        dateAmount.setDate(LocalDate.of(2017, FEBRUARY, 2));
        dateAmount.setAmount(new BigDecimal("618.74"));
        dateAmounts.add(dateAmount);

        dateAmount = new DateAmount();
        dateAmount.setDate(LocalDate.of(2017, FEBRUARY, 3));
        dateAmount.setAmount(new BigDecimal("677.31"));
        dateAmounts.add(dateAmount);

        dateAmount = new DateAmount();
        dateAmount.setDate(LocalDate.of(2017, FEBRUARY, 7));
        dateAmount.setAmount(new BigDecimal("677.68"));
        dateAmounts.add(dateAmount);

        dateAmount = new DateAmount();
        dateAmount.setDate(LocalDate.of(2017, FEBRUARY, 8));
        dateAmount.setAmount(new BigDecimal("678.51"));
        dateAmounts.add(dateAmount);

        dateAmount = new DateAmount();
        dateAmount.setDate(LocalDate.of(2017, FEBRUARY, 9));
        dateAmount.setAmount(new BigDecimal("678.87"));
        dateAmounts.add(dateAmount);

        dateAmount = new DateAmount();
        dateAmount.setDate(LocalDate.of(2017, FEBRUARY, 10));
        dateAmount.setAmount(new BigDecimal("679.32"));
        dateAmounts.add(dateAmount);

        return dateAmounts;
    }

}
