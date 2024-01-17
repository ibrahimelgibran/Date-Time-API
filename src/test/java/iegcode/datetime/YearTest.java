package iegcode.datetime;

import org.junit.jupiter.api.Test;

import java.time.*;

public class YearTest {

    @Test
    void create() {
        Year year1 = Year.now();
        Year year2 = Year.of(2004);
        Year year3 = Year.parse("2006");

        System.out.println(year1);
        System.out.println(year2);
        System.out.println(year3);

        YearMonth yearMonth1 = YearMonth.now();
        YearMonth yearMonth2 = YearMonth.of(2004, Month.APRIL);
        YearMonth yearMonth3 = YearMonth.parse("2006-01");

        System.out.println(yearMonth1);
        System.out.println(yearMonth2);
        System.out.println(yearMonth3);

        MonthDay monthDay1 = MonthDay.now();
        MonthDay monthDay2 = MonthDay.of(Month.DECEMBER, 17);
        MonthDay monthDay3 = MonthDay.parse("--04-10");

        System.out.println(monthDay1);
        System.out.println(monthDay2);
        System.out.println(monthDay3);
    }

    @Test // konversi dari year ke localdate
    void name() {

        Year year = Year.now();
        System.out.println(year);

        LocalDate localDate = year.atMonth(Month.APRIL).atDay(17);
        System.out.println(localDate);

        MonthDay monthDay = MonthDay.from(localDate);
        System.out.println(monthDay);
    }

    @Test // mengambil dari year ke yearmonth
    void get() {

        Year year = Year.now();
        YearMonth yearMonth = YearMonth.now();
        MonthDay monthDay = MonthDay.now();

        System.out.println(year.getValue());
        System.out.println(yearMonth.getYear());
        System.out.println(yearMonth.getMonth());
        System.out.println(monthDay.getMonth());
        System.out.println(monthDay.getDayOfMonth());
    }



}
