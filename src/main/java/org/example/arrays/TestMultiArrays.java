package org.example.arrays;

public class TestMultiArrays {

    public static void main(String[] args) {
        // Array of Arrays
        String[][] memberArray  = {
                {"john", "Jill", "Peter"},
                {"35", "23", "45"},
                {"Active", "Inactive", "Active"}
        };

        System.out.println("Length of array1 " + memberArray[0].length);
        System.out.println("Length of array2 " + memberArray[1].length);
        System.out.println("Length of array3 " + memberArray[2].length);

        System.out.println("John Details - "+ memberArray[0][0]);
        System.out.println("John Details - "+ memberArray[1][0]);
        System.out.println("John Details - "+ memberArray[2][0]);

        System.out.println("Jill Details - "+ memberArray[0][1]);
        System.out.println("Jill Details - "+ memberArray[1][1]);
        System.out.println("Jill Details - "+ memberArray[2][1]);

        System.out.println("Peter Details - "+ memberArray[0][2]);
        System.out.println("Peter Details - "+ memberArray[1][2]);
        System.out.println("Peter Details - "+ memberArray[2][2]);

        // Use for loop to iterate over array of arrays
    }
}
