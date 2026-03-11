package org.example.rewards;

import org.example.objects.Customer;
// RewradPoints r1 = new RewardPoints()
// RewardPoints r1 = new REewardPoints()

// some main() method -> create object of RewardPoints -> call applyRewardPoint()
public class RewardPoints {
     public int points; // attribute or property or instance-level variable

    // no-parameterized constructor
    public RewardPoints(){
        System.out.println("No Parameter constructor called for RewardPoints");
        this.points = 0; // if you don't provide value for properties, compiler will provide it
    }

    public RewardPoints(int points){
        this.points = points;
    }

    // Business method - Assign points to customers whose age is > 50
    public void applyRewardPoints(){
       Customer custObject1 = new Customer();// no paramterize constructor
        System.out.println(custObject1); // custObject1.toString()
        // initialize the customer object
        custObject1.customerId = 1000L;
        custObject1.customerName = "ABC";
        custObject1.age = 35;
        custObject1.status = true;
        System.out.println(custObject1);
     }

     public void calculatePoints(){
        int points = 100 ; // local variable
         this.points = points + this.points;
         System.out.println("Updated Points = " + this.points);
     }
}





