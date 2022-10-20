import java.util.*;

public class palinedromer{
    public static void main (String[] args){
        String input;
        int l = 0, r;
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        input = in.nextLine();
        input = input.replaceAll(" ", "");
        r = input.length() - 1; 
        while (Character.toLowerCase(input.charAt(l)) == Character.toLowerCase(input.charAt(r)) && l < r){
            l++;
            r--;
        }
        
        if (l < r)
            System.out.print("Not a palindrome");
        else
            System.out.print("It's a palindrome!");
    }
}