public class star
{
   public static void main(String[] args){
       String str = "**********";
       
       for (int n = 0; n < 10; n++){
           System.out.printf("%10s%n", str.substring(0, str.length() - n));
       }
   }
}
