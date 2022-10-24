// Mitchell Kaszuba
// 10/21/22
// ParsideTriagnle
// makes Parkside's other triangle
import java.util.*;

public class parksideTriangle{
    public static void main(String[] args){
        int size, seed;
        Scanner in = new Scanner(System.in);
        
        // get size and seed from user
        System.out.print("Enter size: ");
        size = in.nextInt();
        System.out.print("Enter seed: ");
        seed = in.nextInt();
        System.out.println();
        
        // if seed isn't between 1 and 9
        if (seed < 0 || seed > 9)
            System.out.print("ERROR: seed has to be between 1 and 9!");
        else{
            // row: row # of the triangle
            // row increases by 1 until it reaches the end of the triangle
            for (int row = 1; row <= size; row++){
                // this for loop spaces out the numbers, it makes as many spacings as there are rows
                for (int spaces = 1; spaces < row; spaces++){
                    System.out.print("  ");
                }
                
                // colomn: # of the triangle's columns
                // inc: the number being printed
                // this for loop runs until column is the same size as the size variable
                
                // inc is increased by the # of the column
                // then, column is increased by 1 per loop
                for (int column = row, inc = seed; column <= size; inc += column, column++){
                    // this while loop loops the number back down to 1 if it is >= 10
                    // it does this by adding the second and first digit together until it is less than 10
                    while (inc >= 10){
                        inc = (inc % 10) + (inc / 10);
                    }
                    
                    // prints out inc (finally)
                    System.out.print(inc + " ");
                }
                
                // seed is then increased by (row + 1) to set the starting number for the next row
                seed += row + 1;
                System.out.println();
            }
        }
    }
}