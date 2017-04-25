package org.dsaenz.oca.chapter3;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.Duration;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public final class LocalDateSample {
        public static void main(String[] args) {

                // Obtains an instance of LocalDate from a text string using a specific formatter.
                // The text is parsed using the formatter, returning a date.
                //
                // Parameters:
                // text - the text to parse, not null
                // formatter - the formatter to use, not null
                // Returns:
                // the parsed local date, not null
                // Throws:
                // DateTimeParseException - if the text cannot be parsed

                System.out.println(LocalDate.parse("2017-02-27"));
                System.out.println(LocalDate.parse("2017-02-27", DateTimeFormatter.ISO_LOCAL_DATE));
                System.out.println(LocalDate.parse("2017-02-27", DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));


                // public static LocalDateTime of(int year, int month, int dayOfMonth, int hour, int minute)
                // public static LocalDateTime of(int year, int month, int dayOfMonth, int hour, int minute, int second)
                // public static LocalDateTime of(int year, int month, int dayOfMonth, int hour, int minute, int second, int nanos)

                // public static LocalDateTime of(int year, Month month, int dayOfMonth, int hour, int minute)
                // public static LocalDateTime of(int year, Month month, int dayOfMonth, int hour, int minute, int second)
                // public static LocalDateTime of(int year, Month month, int dayOfMonth, int hour, int minute, int second, int nanos)

                // public static LocalDateTime of(LocalDate date, LocalTime time)

                Period.of(1, 1, 1); // years, months, days
                Period days = Period.ofYears(1).ofMonths(13).ofWeeks(366).ofDays(366);

                // tricky! it returns 26 seconds
                Duration seconds = Duration.ofDays(1).ofHours(26).ofMinutes(26).ofSeconds(26);
                Duration.ofMillis(26);
                Duration.ofNanos(26);

                System.out.println("*** now!");
                System.out.println(LocalDate.now());
                System.out.println(LocalTime.now());
                System.out.println(LocalDateTime.now());

                System.out.println("*** #of(...)");
                LocalDate date = LocalDate.of(2018, Month.DECEMBER, 13);
                LocalTime time = LocalTime.of(21, 15, 59);

                // plus/minus examples =>
                // tricky! returns a copy! LocalDate immutable

                date.plusYears(1).plusMonths(13).plusDays(32);

                time.plusHours(25).plusMinutes(61).plusSeconds(61).plusNanos(Integer.MAX_VALUE);

                System.out.println(date);
                System.out.println(date.plus(days));
                System.out.println(time);
                System.out.println(time.plus(seconds));

                LocalDateTime datetime = LocalDateTime.of(2018, Month.DECEMBER, 13, 21, 15, 59);
                System.out.println(datetime);
                System.out.println(LocalDateTime.of(date, time));

                DateTimeFormatter dtDate = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
                DateTimeFormatter dtTime = DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM);

                // System.out.println(datetime.format(dt));
                System.out.println(datetime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));
                System.out.println(datetime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
                System.out.println(datetime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT)));
                System.out.println(datetime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)));

                DateTimeFormatter df = DateTimeFormatter.ofPattern("yy MM dd ___ hh _ mm _ ss");
                System.out.println(datetime.format(df));


                // 12/13/18
                // Dec 13, 2018
                // 12/13/18 9:15 PM
                // Dec 13, 2018 9:15:59 PM

                System.out.println(datetime.format(dtTime));


                try {
                        // error: constructor LocalDate in class LocalDate cannot be applied to given types;
                        // LocalDate date2 = new LocalDate();

                        // Invalid value for SecondOfMinute (valid values 0 - 59): 61
                        // LocalTime.of(1,1,61);

                        // Invalid value for NanoOfSecond (valid values 0 - 999999999): 2147483647
                        LocalTime.of(1,1,59,Integer.MAX_VALUE);

                } catch(DateTimeException exception) {
                        System.out.println(exception.getMessage());
                }
        }
}
