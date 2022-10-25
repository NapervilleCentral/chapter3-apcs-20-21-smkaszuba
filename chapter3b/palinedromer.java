// Mitchell Kaszuba
// 10/22/22
// palindrome tester
// tests palindromes
import java.util.*;

public class palinedromer{
    public static void main (String[] args){
        String input;
        int left = 0, right;
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        input = in.nextLine();
        
        // remove all spaces from input
        input = input.replaceAll(" ", "");
        
        // left - start of string
        // right - end of string
        right = input.length() - 1; 
        // while the string at the start and the string at the end are the same
        // and left and right don't cross
        while (Character.toLowerCase(input.charAt(left)) == Character.toLowerCase(input.charAt(right)) && left < right){
            // shift the letter it checks at the start by 1
            left++;
            // shift the letter it checks at the end by 1
            right--;
        }
        
        // if one of the letters are different before it gets to the middle of the string
        if (left < right)
            System.out.print("Not a palindrome");
        // else its a palindrome
        else
            System.out.print("It's a palindrome!");
    }
}