import java.util.*;
/**
 * Write a description of class leapYear here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class leapYear
{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int userYear = scanner.nextInt();
        if (userYear >= 1582){
            if (userYear % 4 == 0){
                if(userYear % 100 == 0){
                    if(userYear % 400 == 0){
                        System.out.println("Leap Year!");
                    }else{
                        System.out.println("Not Leap Year");
                    }
                }else{
                    System.out.println("Leap Year!");
                }
            }else{
                System.out.println("Not Leap Year");
            }
        }else{
            System.out.println("Invalid Year");
        }
   
    }
}