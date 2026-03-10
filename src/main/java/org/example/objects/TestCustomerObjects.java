package org.example.objects;

public class TestCustomerObjects {

    public static void main(String[] args) {
        // primitive variable
         int x = 10;
        System.out.println("X  = " + x);


        // Customer object
       Customer  custObject1 = new Customer();
        System.out.println("Customer object = " + custObject1);
//       // access the object attributes
//        custObject1.customerId = 176676L;
//        custObject1.customerName = "John Mathew";
//        custObject1.age = 34;
//        custObject1.status = true;



        Customer custObject2 = new Customer();
        System.out.println("Customer object = " + custObject2);
        int y = 20;
        System.out.println("y = " + y);
        // object variable or reference variable
        Customer custObject3 = null; // there is no object for custObject3
        System.out.println("Customer Object 3 = " + custObject3);
        custObject3 = new Customer();
        // NullPointerException - the object is not instantiated or created yet
        custObject3.customerId = 10000L;
        System.out.println("Customer Object 3 " + custObject3);
       // After the main will be method completed, all variables and Objects will be deleted from the memory
      // The process of deleting objects from memory by JVM is called Garbage collection
      // The manager who takes control of deleting objects from memory called as Garbage Collector

    }
}
