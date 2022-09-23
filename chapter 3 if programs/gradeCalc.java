// Mitchell Kaszuba
// 9/22/22
// Grade calculator
// calculates Gpa grade from number grade
import java.util.*;

public class gradeCalc
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        // letterGrade: grade inputed
        // letter: letter entered
        // additive: + or -, if added
        String letterGrade, letter, additive;
        double numGrade;
        
        System.out.print("Enter a letter grade: ");
        letterGrade = in.nextLine();

        // get letter and the additive, if it exists
        letter = letterGrade.substring(0,1);
        additive = letterGrade.substring(1);

        // create a switch case to go through each possible letter, and print error if 
        // they didn't enter a valid letter
        switch (letter){
          case "A":
            numGrade = 4;
            break;
          case "B":
            numGrade = 3;
            break;
          case "C":
            numGrade = 2;
            break;
          case "D":
            numGrade = 1;
            break;
          case "F":
            numGrade = 0;
            break;
          default:
            numGrade = 0;
            System.out.println("Error in reading input!");
        }

      // if grade isn't F
      if (!letter.equals("F"))
        // if grade is + and isn't A+
        if (additive.equals("+") && !letter.equals("A"))
          numGrade += .3;
          // else if additive is -
        else if (additive.equals("-"))
          numGrade -= .3;

      // display result to user
      System.out.print("The grade in GPA format is: " + numGrade);
  }
}