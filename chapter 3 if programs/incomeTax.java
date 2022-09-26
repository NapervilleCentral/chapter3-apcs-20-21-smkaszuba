// Mitchell Kaszuba
// 9/26/22
// income tax
// calculates income tax from income
import java.util.*;

class incomeTax{
  public static void main(String[] args) {
    double income, tax;
    tax = 0;
    
    Scanner in = new Scanner(System.in);

    System.out.print("Enter income: ");
    income = in.nextFloat();

    // the algorithim for each step of the taxes is this:
    // tax = (income to be taxed in the current bracket) * (tax percent) + cumulative amount taxed in every previous tax bracket
    if (income <= 50000)
      tax = income * .01;
    else if (income <= 75000)
      tax = (income - 50000) * .02 + 500;
    else if (income <= 100000)
      tax = (income - 75000) * .03 + 1000;
    else if (income <= 250000)
      tax = (income - 100000) * .04 + 1750;
    else if (income <= 500000)
      tax = (income - 250000) * .05 + 7750;
    else
      tax = (income - 500000) * .06 + 20250;

    System.out.print("The tax is: " + tax);
  }
}