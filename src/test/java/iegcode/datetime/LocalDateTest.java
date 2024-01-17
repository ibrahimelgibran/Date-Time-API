package iegcode.datetime;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateTest {

    @Test
    void create() {

        LocalDate localDate1 = LocalDate.now();
        LocalDate localDate2 = LocalDate.of(2004, Month.APRIL, 17);
        LocalDate localDate3 = LocalDate.parse("2004-04-17");

        System.out.println(localDate1);
        System.out.println(localDate2);
        System.out.println(localDate3);

    }

    @Test
    void with() {

        LocalDate localDate1 = LocalDate.now();
        LocalDate localDate2 = localDate1.withYear(2004);
        LocalDate localDate3 = localDate2.withYear(2006).withMonth(01).withDayOfMonth(29);

        System.out.println(localDate1);
        System.out.println(localDate2);
        System.out.println(localDate3);
    }

    @Test
    void modify() {

        LocalDate localDate1 = LocalDate.now();
        LocalDate localDate2 = localDate1.plusYears(4);
        LocalDate localDate3 = localDate1.minusMonths(9);

        System.out.println(localDate1);
        System.out.println(localDate2);
        System.out.println(localDate3);
    }

    @Test
    void get() {

        LocalDate localDate1 = LocalDate.now();

        System.out.println(localDate1.getYear());
        System.out.println(localDate1.getMonth());
        System.out.println(localDate1.getMonthValue());
        System.out.println(localDate1.getDayOfMonth());
        System.out.println(localDate1.getDayOfWeek());
        System.out.println(localDate1.getDayOfYear());
    }
}
