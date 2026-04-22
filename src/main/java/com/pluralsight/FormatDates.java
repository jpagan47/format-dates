package com.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormatDates {
    public static void main(String[] args) {
        LocalDate todaysdate = LocalDate.now();
        System.out.println(todaysdate);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern()
    }
}
