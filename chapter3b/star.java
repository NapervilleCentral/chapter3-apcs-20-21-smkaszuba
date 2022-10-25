public class star
{
    
   public static void main(String[] args){
       String str = "**********";
       
 
       for (int n = 0; n < 10; n++){
           for (int spaces = 10; spaces < 0; spaces--)
               System.out.print(" ");
           for (int stars = 0; stars < 10; stars++)
               System.out.print("*");
           System.out.println();
       }
   }
}
