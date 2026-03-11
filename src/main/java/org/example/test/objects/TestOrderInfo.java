package org.example.test.objects;

import org.example.objects.Order;

import java.time.LocalDate;
import java.time.Month;

public class TestOrderInfo {

    public static void main(String[] args) {
       //LocalDate OrderDate = tempDate
        // String products = products
        LocalDate tempDate = LocalDate.of(2026, Month.JANUARY, 23);
        String[] products = {"A", "B", "C"};
        Order order1 = new Order(5643L, tempDate, products, "John", 78.56);
        System.out.println("Order Id = " + order1.getOrderId());
        System.out.println("Order Date = " + order1.getOrderDate());
        for(String value : order1.getProducts()) {
            System.out.print("Products = " + value + " ");
        }
        System.out.println();
        System.out.println("Customer name " + order1.getCustomerName());

        // creating array with new keyword
        String[] tempProducts = new String[4];
        tempProducts[0] = "A";
        tempProducts[1] = "B";
        tempProducts[2] = "C";
        tempProducts[3] = "D";

      Order order2 = new Order(7865L,
                                  LocalDate.of(2026, Month.JANUARY, 25),
                                  new String[]{"A", "B", "C"},
                                  "Jill",
                                   56.56);



    }
}
