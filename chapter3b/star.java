// Mitchell Kaszuba
// 10/22/22
// star
// makes a triangle of stars
public class star{ 
   public static void main(String[] args){
       // for loop is each row
       for (int n = 0; n < 10; n++){
           // this for loop prints spaces
           // for every row it increases the amount of spaces printed
           for (int spaces = 0; spaces < n; spaces++)
               System.out.print(" ");
           
           // This for loop prints stars
           // for every row it decreases the amount of stars printed
           for (int stars = 10; stars > n; stars--)
               System.out.print("*");
           System.out.println();
       }
   }
}
