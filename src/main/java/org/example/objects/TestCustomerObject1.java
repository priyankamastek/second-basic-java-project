package org.example.objects;

public class TestCustomerObject1 {
    public static void main(String[] args) {
        Customer custObject1 = new Customer();
        System.out.println("custObject1 value = " + custObject1); // custObject1.toString()

        Customer custObject2 = null;
        custObject2 = custObject1; //  the memory address of custObject1 is copied into custObject2
        System.out.println("custObject2 value = " + custObject2);

        Customer custObject3 = new Customer();
        System.out.println("custObject3 value = " + custObject3);

        Customer custObject4 = custObject3;
        System.out.println("custObject4 value = " + custObject4);


        int x = 10;
        int y ;
        y = x; // x value is copied into y
        System.out.println("X = " + x);
        System.out.println("Y = " + y);
    }
}
