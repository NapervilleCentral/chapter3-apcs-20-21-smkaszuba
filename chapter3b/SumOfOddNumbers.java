import java.util.Scanner;

public class SumOfOddNumbers
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      // Get the inputs
      int a = in.nextInt();
      int b = in.nextInt();
      int totsum  = 0 ;
     
      for (int sum = a; sum >= a && b>= sum;  sum++){
         
          if (sum % 2 == 1){
              totsum +=sum;
            }
      }
      System.out.println("Sum of all odd numbers between a and b is:" + " " + totsum);

   }
}