package org.example.arrays;

public class ArrayCalculations {


    public static int sumofArrayValues(int[] numbersArray){
        System.out.println(numbersArray.length);
        int sum = 0;
        // standard for loop or traditional for loop
        for(int index=0; index < numbersArray.length ; index+=2)
        {
            System.out.println("Index - " + index);
            //sum= sum +numbersArray[index]; // shorthand operator += sum = sum + 10 , sum+= 10
            sum+= numbersArray[index];
        }
        return sum;
    }

     // Enhanced for loop - Java 5 -  forEach loop considering all elements of an array or list or set or map
    /* index always start from 0, loop run till length of array; increment by 1
       it will fetch value of each index internally
       for( data-type variable : name of array){..}
    */

    public static int sumofArrayValuesWithEnhancedLoop(int[] numbersArray){
        System.out.println(numbersArray.length);
        int sum = 0;
        // Enhanced For Each Loop
        for(int valueInt : numbersArray){
            System.out.println("Value = "+ valueInt);
            if(valueInt > 20) {
                System.out.println("within If condition  = "+ valueInt);
                sum = sum + valueInt;
             }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] numberArray = {10, 20, 30, 40, 78}; // belongs to main()
        System.out.println("Sum of all values = " + sumofArrayValuesWithEnhancedLoop(numberArray));
    }

}
