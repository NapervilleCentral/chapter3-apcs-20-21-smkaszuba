// Mitchell Kaszuba
// 9/23/22
// planet weight calculator
// calculate weight on other planets
import java.util.*;
  
class solarSystem {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String choice, planet;
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
        planet = "Mercury";
        weight *= 0.38;
        break;
      case "V":
        planet = "Venus";
        weight *= 0.91;
        break;
      case "O":
        planet = "the Moon";
        weight *= 0.17;
        break;
      case "A":
        planet = "Mars";
        weight *= 0.38;
        break;
      case "J":
        planet = "Jupiter";
        weight *= 2.34;
        break;
      case "S":
        planet = "Saturn";
        weight *= 1.06;
        break;
      case "N":
        planet = "Neptune";
        weight *= 1.1;
        break;
      case "U":
        planet = "Uranus";
        weight *= 0.92;
        break;
      default:
        System.out.print("Error, invalid input!");
        planet = "Error";
        weight = 0;
    }
    // display weight to user
    System.out.print("Your weight on " + planet + " would be: " + weight + " pounds");
    
  }
}