import java.util.*;

class NumPairs {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int a, b, c, d;
    
    System.out.print("Enter four numbers: ");

    a = scan.nextInt();
    b = scan.nextInt();
    c = scan.nextInt();
    d = scan.nextInt();

    if (a == b && c == d || 
        a == c && b == d ||
        a == d && b == c) 
      System.out.print("There are 2 pairs");
    else
      System.out.print("No 2 pairs");
  }
}