// Mitchell Kaszuba
// 9/23/22
// triangleFinder
// finds kind of triangle based off input
import java.util.*;

class triangleFinder {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    String choice;
    double s1, s2, s3, sq1, sq2, sq3, a1, a2, a3;
    
    System.out.print("Angle or Side Mode (A/S)? ");
    choice = in.nextLine().toUpperCase();
    
    switch (choice){
      case "A":
        System.out.print("Enter 3 angles: ");
        a1 = in.nextFloat();
        a2 = in.nextFloat();
        a3 = in.nextFloat();

        // check if any of the angles don't add up to 180 or
        // if any of the angles are 0
        if (a1 + a2 + a3 != 180 || a1 == 0 || a2 == 0 || a3 == 0)
          System.out.print("Error: impossible triangle!");        
        else{
          System.out.print("The triangle is a ");

          // check if any of the angles are 90
          if (a1 == 90 || a2 == 90 || a3 == 90)
            System.out.print(" right ");

          // if all the angles are the same
          else if (a1 == a2 && a2 == a3)
            System.out.print(" equilateral ");

          else if (a1 == a2 || a1 == a3 || a2 == a3)
            System.out.print(" isoscles ");

          System.out.print("triangle");
          
        }
        break;
        
      case "S":
        System.out.print("Enter 3 sides: ");
        s1 = in.nextFloat();
        s2 = in.nextFloat();
        s3 = in.nextFloat();

        // if any side is too big to be a triangle, print error
        if (s1 + s2 <= s3 || s1 + s3 <= s2 || s2 + s3 <= s1)
          System.out.print("Error: impossible triangle!");
        
        else{
          System.out.print("The triangle is");

          // also if 2 sides are equal but 1 isn't, then isoscles
          if (s1 == s2 || s1 == s3 || s2 == s3 )
            System.out.print(" isoscles ");

          // else if all sides are equal, its equiilateral
          else if (s1 == s2 && s2 == s3)
            System.out.print(" equilateral ");

          else
            System.out.print(" scalene ");
        }
        break;
      default:
        System.out.print("Error, invalid input!");
    }
  }
}