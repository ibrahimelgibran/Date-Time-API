package iegcode.datetime;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalTime;

public class LocalTimeTest {

    @Test
    void create() {

        LocalTime localTime1 = LocalTime.now(); // 494816 itu nano secondnya
        LocalTime localTime2 = LocalTime.of(10, 10, 10);
        LocalTime localTime3 = LocalTime.parse("10:10");

        System.out.println(localTime1);
        System.out.println(localTime2);
        System.out.println(localTime3);
    }

    // cara mengubah
    @Test
    void change() {

        LocalTime localTime1 = LocalTime.now();
        LocalTime localTime2 = localTime1.withHour(10);
        LocalTime localTime3 = localTime1.withHour(5).withMinute(10).withSecond(0);

        System.out.println(localTime1);
        System.out.println(localTime2);
        System.out.println(localTime3);
    }

    // manipulasi local time

    @Test
    void modify() {

        LocalTime localTime1 = LocalTime.now();
        LocalTime localTime2 = localTime1.plusHours(10);
        LocalTime localTime3 = localTime1.plusHours(5).withMinute(10).withSecond(5);

        System.out.println(localTime1);
        System.out.println(localTime2);
        System.out.println(localTime3);
    }

    @Test
    void get() {
        LocalTime localTime1 = LocalTime.now();

        System.out.println(localTime1.getHour());
        System.out.println(localTime1.getMinute());
        System.out.println(localTime1.getSecond());
        System.out.println(localTime1.getNano());
    }
}
