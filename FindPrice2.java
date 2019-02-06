/*

Program: FindPrice1.java
Description:This program demonstrates a parallel array
*/
import java.util.Scanner;
public class FindPrice2 {
    public static void main(String[] args) {
        final int NUMBER_OF_ITEMS = 10;
        int[] validValues = {101, 108, 201, 213, 266,
                             304, 311, 409, 411, 412};
        double[] prices = {0.29, 1.23, 3.50, 0.69, 6.79,
                           3.19, 0.99, 0.89, 1.26, 8.00};
        String strItem;
        int itemOrdered;
        double itemPrice = 0.0;
        boolean validItem = false;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the item number you want to order: ");
        strItem = input.nextLine();
        itemOrdered = Integer.parseInt(strItem);
        for (int x = 0; x < NUMBER_OF_ITEMS; ++x) {
            if (itemOrdered == validValues[x]) {
                validItem = true;
                itemPrice = prices[x];
                x = NUMBER_OF_ITEMS; //A for loop with an early exit
            }
        }
        if (validItem)
            System.out.println("The price for item "
                               + itemOrdered
                               + " is $" + itemPrice);
        else
            System.out.println("Sorry - invalid item entered");
    }
}