package org.example.objects; // first statement
import java.util.Scanner;

public class TestCustomerProfle {
    public static void main(String[] args) {

        Customer customerObject1 = new Customer(5643L, "John Mathew", 34, true);
        System.out.println("Newly created customer object");
        System.out.println(customerObject1); // customerObject1.toString()

        // Scanner for inputs
        // to add import, ctrl + spacebar
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter if you want to update your profile Yes/ No or [Y/y]/[N/n]");
        String answer = sc.next();

        // Compare string values with equals() method, not == as it compares object address with value
        if(answer.equals("yes") || answer.equals("y")){
            System.out.println("answer = " + answer);
            customerObject1.updateProfile("Peter Mathew", 27);
            System.out.println("Updated customer object");
            System.out.println(customerObject1);
        }
        else {
            System.out.println("Some problem");
        }
    }
}
