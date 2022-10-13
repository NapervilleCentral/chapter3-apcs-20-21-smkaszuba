 

public class PowerOf2
{
   public static void main(String[] args)
   {
      // The powers of 2 from 2^0 to 2^20
      //display and sum all of the squares 1, 2 , 4 , 8 ...
      int sum = 0;
     
     
      for( int x  = 0; 20>=x; x++){
          sum += Math.pow(2,x);
          System.out.println(Math.pow(2,x));
      }
      System.out.println("Sum is: " + sum);
   }
}

