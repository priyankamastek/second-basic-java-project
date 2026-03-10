package org.example.objects;

public class TestStrings{

    public static void main(String[] args) {
        // String Class - Local variable
        // String class is a final class
        String name = "John Mathew"; // Use it a variable
        String string1 = new String("John Mathew"); // constructor method from String("")
        // toString() is a method of Object class and overridden (new implementation) given by string class
        System.out.println("Name = " + name.toString());
        System.out.println("String1 = " + string1.toString());

        // Customer Object
        Customer cObj1 = new Customer(); // no-parameter constructor method
        // if object attributes are not initialized,
        // the compiler adds a method that provide default values to the properties
        // Default value - int : 0, String : null, float : 0.0 , char : '' , boolean : false
        System.out.println(cObj1.toString());// cObj1.toString()

        Customer cObj2 = new Customer(); // no -parameter is called
        cObj2.customerId = 7676767L;
        cObj2.customerName = "Peter";
        cObj2.age = 34;
        cObj2.status = true;
        System.out.println(cObj2.toString()); // Which object is called the method is on the left

        // Object is created and initialized with constructor method
        Customer cObj3 = new Customer(4545L, "A", 23); // constructor method is called at this statement
        System.out.println(cObj3);

        Customer cObj4 = new Customer(54545L, "B",56, true);
        System.out.println(cObj4);




    }
}
