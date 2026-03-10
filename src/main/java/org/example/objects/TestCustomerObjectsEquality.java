package org.example.objects;

public class TestCustomerObjectsEquality {

    public static void main(String[] args) {
       // Instantation of Customer Object
        Customer custObject1 = new Customer();

        // Initialization of attributes
        custObject1.customerId = 1234L;
        custObject1.customerName = "John";
        custObject1.age = 34;
        custObject1.status = true;

        // Displaying the values of Object attributes
        System.out.println("Address iof custObject1 = " + custObject1);
        System.out.println("Customer ID = " + custObject1.customerId);
        System.out.println("Customer Name = "+ custObject1.customerName);
        System.out.println("Customer Age = " + custObject1.age);
        System.out.println("Customer Status = " + custObject1.status);

        // Create another obejcts
        Customer custObject2 = new Customer();

        // Intialization of attributes
        custObject2.customerId = 12345L;
        custObject2.customerName = "John";
        custObject2.age = 34;
        custObject2.status = true;

        // Displaying the values of Object attributes
        System.out.println("Address iof custObject2 = " + custObject2);
        System.out.println("Customer ID = " + custObject2.customerId);
        System.out.println("Customer Name = "+ custObject2.customerName);
        System.out.println("Customer Age = " + custObject2.age);
        System.out.println("Customer Status = " + custObject2.status);

        // comparing two primitive values with == , values are compared
        int x = 10;
        int y = 10;
        if ( x == y )
            System.out.println("x and y are equal");
        else
            System.out.println("x and y are not equal");

               // To compare 2 objects with == , its address are compared not the values
        if (custObject1 == custObject2) {
            System.out.println("Both Objects are equal");
        }
        else {
                System.out.println("Objects are not equal");
              }

        // To compare 2 object with their attribute value
        if(custObject1.customerId == custObject2.customerId)
        {
            System.out.println("Both objects have same value for customerId");
         }
        else{
            System.out.println("Both objects have different  value for customerId");
        }


    }// main()
}// closing of classes
