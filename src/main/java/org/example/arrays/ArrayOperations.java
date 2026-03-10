package org.example.arrays;

public class ArrayOperations {
    public static void printArrayElements(){
     // Create an array of int numbers
     int[] numberArray = {10, 20, 30, 67, 54, 76};
     // Loops - Instructions will be repeated for the given number of times
        // for(initialization; condition ; increment or decrement){..}
        // index = index + 1 or index++
        // logic error - code can go into infinite loop

      for( int index = 0; index < numberArray.length ;  index++ ){
          System.out.println("Loop = "+ index);
          System.out.println("Array values -" + numberArray[index]);
      }
        System.out.println("Method completed");
    }

    /**
     * Searches a predefined integer array for the given value and prints the index
     * if the value is found. Always prints "Method completed" at the end.
     *
     * @param searchValue the integer value to search within the array
     * @return void (prints results to the console; no value is returned)
     */
    public static void searchArrayElements(int searchValue){
        // Create an array of int numbers
        int[] numberArray = {10, 20, 30, 67, 54, 76, 67};
        // int searchValue = 88;
       for( int index = 0; index < numberArray.length ;  index++ ){
           if(numberArray[index] == searchValue){
               System.out.println("Value fount at index = " + index);
               System.out.println("Search Value found in the Number Array values -" + numberArray[index]);
               break; // come out of for loop
           }
        }
        System.out.println("Method completed");
    }

    public static boolean searchArrayElementsUpdated(int searchValue){
        // Create an array of int numbers
        int[] numberArray = {10, 20, 30, 67, 54, 76, 67};
        // int searchValue = 88;
        boolean isFlag = false;
        for( int index = 0; index < numberArray.length ;  index++ ){
            if(numberArray[index] == searchValue){
               isFlag = true;
                break; // come out of for loop
            }
        }
        return isFlag; // either false or true
    }

    public static boolean searchArrayElementsUpdated1(int[] numberArray, int searchValue){
        // Create an array of int numbers
        boolean isFlag = false;
        for( int index = 0; index < numberArray.length ;  index++ ){
            if(numberArray[index] == searchValue){
                isFlag = true;
                break; // come out of for loop and continue execution after for loop
            }
        }
        return isFlag; // either false or true
    }


    public static void main(String[] args) {
        // method calling to test it with different values passed to it.
      //  printArrayElements();
        int[] inputNumberArray = {10, 20, 30, 67, 54, 76, 67};
        String[] inputStringArray = {"A", "B", "C"};
        System.out.println("Value Found = " +  searchArrayElementsUpdated1(inputNumberArray, 67));
        System.out.println("Value Found = " + searchArrayElementsUpdated1(inputNumberArray, 88));
    }

}
