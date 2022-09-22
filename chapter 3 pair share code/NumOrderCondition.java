import java.util.Scanner;

public class NumOrderCondition
{
   public static void main(String[] args)
   {
   
      Scanner in = new Scanner(System.in);
      System.out
            .println("Enter S for strict ordering, L for lenient (S or L):");
      String answer = in.nextLine();


     
     
      System.out.print("Enter three numbers: ");
     
      int a, b, c;
      a = in.nextInt();
      b = in.nextInt();
      c = in.nextInt();
     
      System.out.print(a + " " + b + " " + c + "\t");
     
      // runs if nums in descending order
      if(answer.equals("S")){
          if (a > b && b > c){
              System.out.println("decreasing");
          }
          // runs if nums in ascending order
          else if (a < b && b < c){
              System.out.println("increasing");
          }
          else{
              System.out.println("neither");
          }
      }else if(answer.equals("L")){
          if(a <b && b==c){
              System.out.println("Increasing");
          }if(a ==b && b==c){
              System.out.println("Increasing");
              System.out.println("Decreasing");
          }if(a==b && b>c){
              System.out.println("Increasing");
          }
      }else{
          System.out.println("Error");
      }
     
    }  
}