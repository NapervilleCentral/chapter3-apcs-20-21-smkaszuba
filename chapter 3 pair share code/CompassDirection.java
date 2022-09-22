import java.util.Scanner;
/**
   Prints the compas direction N,NE,E,SE,S,SW,W,NW
   Given an angle as input.
*/
public class CompassDirection
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      System.out.print("Enter the direction the compass is pointing " +
         " (in degrees from North (0..360): ");
      double degrees = in.nextDouble();

      System.out.print(degrees + " Degrees is ");
      
      // Calculate the direction and print the rest
      // of the line here
      // strings don't work because they compare memory addresses 
      
      if (degrees < 45 || degrees == 360)
          System.out.print("North");
      else if (degrees < 90)
          System.out.print("Northeast");
      else if (degrees < 135)
          System.out.print("East");
      else if (degrees < 180)
          System.out.print("Southeast");
      else if (degrees < 225)
          System.out.print("South");
      else if (degrees < 270)
          System.out.print("Southwest");
      else if (degrees < 315)
          System.out.print("West");
      else
          System.out.print("Northwest");
   }
}
