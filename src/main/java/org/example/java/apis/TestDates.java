package org.example.java.apis;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class TestDates {

    public static void main(String[] args) {

        LocalDate date = null;
        System.out.println("Date = " + date);
        //date = new LocalDate();// not work
        date = LocalDate.now(); // Current Date
        System.out.println("Date = " + date);
        // January - 1
       // LocalDate orderDate = LocalDate.of(2026, 2, 12);
        LocalDate orderDate = LocalDate.of(2026, Month.FEBRUARY, 12);
        System.out.println("OrderDate = " + orderDate);
        System.out.println("Dy if Year = " + orderDate.getDayOfYear());
        System.out.println("Year = " + orderDate.getYear());
        System.out.println("Month = " + orderDate.getMonth());
        System.out.println("Day of Month = " + orderDate.getDayOfMonth());
        System.out.println("Day of Week = " + orderDate.getDayOfWeek());
        // Adding month to the OrderDate
        // Cannot update the actual object, any operation performed will return a new LocalDate
        // Immutable class - A class whose object properties cannot be updated
         LocalDate newOrderDate = orderDate.plusMonths(1);

        System.out.println("OrderDate = " + orderDate);
        System.out.println("Updated OrderDate by 1 Month  = " + newOrderDate);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedDate = orderDate.format(formatter);
        System.out.println("Formatted Date as String - " + formattedDate);

    }
}
