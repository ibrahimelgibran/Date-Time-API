package iegcode.datetime;

import net.bytebuddy.asm.Advice;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateFormatterTest {

    @Test
    void parsing() {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd");

        LocalDate localDate = LocalDate.parse("2004 04 17", formatter);
        System.out.println(localDate);
    }

    @Test // mengubah dari tipedata temporal ke text
    void formatter() {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd");

        LocalDate localDate = LocalDate.parse("2004 04 17", formatter);
        String format = localDate.format(formatter);
        System.out.println(format);
    }

    @Test
    void defaultFormatter() {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd");

        LocalDate localDate = LocalDate.parse("2004 04 17", formatter);
        String format = localDate.format(DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(format);
    }

    @Test
    void i18n() {

        Locale locale = new Locale ("id","ID");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MMMM dd", locale);

        LocalDate localDate = LocalDate.now();
        String format = localDate.format(formatter);

        System.out.println(format);
     }
}
