package com.pluralsight;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class FormatDates {
    public static void main(String[] args) {
        LocalDateTime today = LocalDateTime.now();
        LocalDate todaysDate = LocalDate.now();


        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("E, MM dd, yyyy HH:mm");
        String todayFormatted = today.format(formatter);

        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String dateformattted = todaysDate.format(dateFormatter);


        System.out.println(dateformattted);
        System.out.println(todaysDate);
        System.out.println(todayFormatted + today.getDayOfWeek());


    }
}
