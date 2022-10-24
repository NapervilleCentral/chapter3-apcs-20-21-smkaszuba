import java.util.*;

public class palinedromer{
    public static void main (String[] args){
        String input;
        int left = 0, right;
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        input = in.nextLine();
        input = input.replaceAll(" ", "");
        right = input.length() - 1; 
        while (Character.toLowerCase(input.charAt(left)) == Character.toLowerCase(input.charAt(right)) && left < right){
            left++;
            right--;
        }
        
        if (left < right)
            System.out.print("Not a palindrome");
        else
            System.out.print("It's a palindrome!");
    }
}