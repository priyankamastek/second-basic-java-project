package org.example.arrays;

public class TestArrays {


    public static void main(String[] args) {
     // Create an array of integers = 10, 34, 67, 45....use arrays data structure
     // Movie hall - Seat Numbers - 1, 2, 3
     // Events = Arrange A, B, C, D, E
     // Why arrangement - faster retrieval, Search data, sort data
     // Arrays are sequential data structures,
     // 6000 , array size is fixed .. you cannot change size of array at runtime
     // what values to store in an array - int values/ float values/ char values
     // syntax - <data-type>[] array-name
     // Example: int[]   // means it is an array int[] arr; int[] numbers = {10, 20, 30, 40, 50}
      int[] numberArray = {10, 20, 30, 40, 50, 60, 65};
      // length is the property of array
        System.out.println("The length of array " + numberArray.length);
     // Create an array of type strings to stores names of customers
     String[] customerArray = {"Jack", "jill", "peter", "andrew", "Jack", "jill"};
     System.out.println("Length of customer array - " + customerArray.length);
     // Print values from array - index number
        System.out.println("First Customer = " + customerArray[0]);
        System.out.println("Third Customer = " + customerArray[2]);
        System.out.println("Fourth  Customer = " + customerArray[3]);
        // if array index not present, then throws an array - ArrayIndexOutOfBoundsException
        System.out.println("Eleventh Customer = " + customerArray[6]);





    }

}
