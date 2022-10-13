public class SumEvenNumbers
{
   public static void main(String[] args)
   {
      // The sum of all even numbers between 2 and 100
      int totsum  = 0 ;
     
      for (int sum = 0; sum <= 100; sum++){
         
          if (sum % 2 == 0){
              totsum +=sum;
            }
      }
      System.out.println("Sum of all even number is:" + " " + totsum);
     
      // Output the result

   }
}