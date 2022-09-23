// Mitchell Kaszuba
// 9/23/22
// planet weight calculator
// calculate weight on other planets
import java.util.*;
  
class solarSystem {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String choice;
    double weight;
    
    System.out.print("Enter your weight: ");
    weight = in.nextFloat();

    // print menu
    System.out.print("\n  M - Mercury\n  V - Venus\n  O - Moon\n  A - Mars\n  J - Jupiter\n  S - Saturn \n  N - Neptune\n  U - Uranus\nSelect a planet: ");

    // get the choice and convert to upper case
    in.nextLine();
    choice = in.nextLine().toUpperCase();

    // multiply weight entered by ratio of gravity compared to earth
    switch (choice){
      case "M":
        weight *= 0.38;
        break;
      case "V":
        weight *= 0.91;
        break;
      case "O":
        weight *= 0.17;
        break;
      case "A":
        weight *= 0.38;
        break;
      case "J":
        weight *= 2.34;
        break;
      case "S":
        weight *= 1.06;
        break;
      case "U":
        weight *= 0.92;
        break;
      default:
        System.out.print("Error, invalid input!");
    }
    // display weight to user
    System.out.print("Your weight on that planet would be: " + weight + " pounds");
    
  }
}