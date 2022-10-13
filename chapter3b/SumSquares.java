public class SumSquares
{
   public static void main(String[] args)
   {
      int sum = 0;
      // The sum of all squares between 1 and 100
     
     
      for( int x  = 0; 100>=x; x++){
          sum += Math.pow(2,x);
          System.out.println(Math.pow(x,2));
      }

      // Output the result
      System.out.println("The sum is " + sum);
   }
}