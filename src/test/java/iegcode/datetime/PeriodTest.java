package iegcode.datetime;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Period;

public class PeriodTest {

    // period adalah durasi untuk tanggal hampir mirip dengan Duration

    @Test
    void create() {

        Period period1 = Period.ofDays(10);
        Period period2 = Period.ofWeeks(10);
        Period period3 = Period.ofMonths(10);
        Period period4 = Period.ofYears(10);
        Period period5 = Period.of(10, 10, 10);

        System.out.println(period1.getDays());
        System.out.println(period2);
        System.out.println(period3);
        System.out.println(period4.getYears());
        System.out.println(period5);
    }

    @Test // mengambil data
    void get() {
        Period period = Period.of(10, 10, 10);

        System.out.println(period.getYears());
        System.out.println(period.getMonths());
        System.out.println(period.getDays());
    }

    @Test // menghitung period
    void between() {

        Period period = Period.between(
                LocalDate.of(2004, 4, 17),
                LocalDate.now()
        );

        System.out.println(period.getYears());
        System.out.println(period.getMonths());
        System.out.println(period.getDays());
    }
}
