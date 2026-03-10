package org.example.arrays;

public class TestPattern {

    public static void main(String[] args) {

        for(int row = 1; row <= 4; row++){ // 1 time
            //System.out.println("Row number - " + row);
            for(int col=1 ; col <= row ; col++) {
              //  System.out.print("Column Number = " + col);
                System.out.print("*" + " ");
            }
            System.out.println();
        }

        System.out.println("===========================");
        // 1 outer loop  = Iterate inner for loop till condition met
        for(int row = 4; row >= 1 ; row--){
            for(int col=row  ; col >=1  ; col--) {
                //  System.out.print("Column Number = " + col);
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
