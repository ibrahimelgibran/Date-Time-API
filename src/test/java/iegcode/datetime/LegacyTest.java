package iegcode.datetime;

import org.junit.jupiter.api.Test;

import java.sql.Time;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class LegacyTest {

    @Test // legacy ke new
    void fromLegacy() {
        Date date = new Date();
        System.out.println(date);
        Instant instant = date.toInstant();
        System.out.println(instant);

        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);
        Instant instant1 = calendar.toInstant();
        System.out.println(instant1);

        TimeZone timeZone = TimeZone.getDefault();
        System.out.println(timeZone);
        ZoneId zoneId = timeZone.toZoneId();
        System.out.println(zoneId);
    }

    @Test // bagimana jika kebalikkan new ke legacy
    void toLegacy() {

        ZonedDateTime zonedDateTime = ZonedDateTime.now();

        Date date = java.sql.Date.from(zonedDateTime.toInstant());

        Calendar calendar = GregorianCalendar.from(zonedDateTime);

        ZoneId zoneId = ZoneId.systemDefault();
        TimeZone timeZone = TimeZone.getTimeZone(zoneId);

        System.out.println(date);
        System.out.println("==========");
        System.out.println(calendar);
        System.out.println("==========");
        System.out.println(timeZone);
    }
}
