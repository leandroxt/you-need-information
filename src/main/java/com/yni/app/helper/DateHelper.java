package com.yni.app.helper;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by leandro on 10/02/17.
 */
public class DateHelper {

    public static String format(LocalDate date) {
        // Portuguese - Brazil format standard
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return date.format(formatter);
    }

    public static Long getEpochZeroTime(LocalDate localDate) {
        Date date = Date.from(localDate.atStartOfDay().atZone(ZoneId.of("Europe/London")).toInstant());
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.HOUR, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);

        return calendar.getTime().getTime();
    }
}
