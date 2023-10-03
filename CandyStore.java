package Assignment8;

/**
 * CandyStore: User can pick a number between 1-8 to buy  however many type of candy they want. Calculates total for candy bought and displays to user.
 * @author V Miranda-Calleja
 */

import java.util.Scanner;
public class CandyStore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // total for order
        double total = 0;
        
         //price for each item
        double miniCandyBars = 3.96;
        double bubbleGumPacks = 2.45;
        double popcornBalls = 1.07;
        double gummyMonsters = 2.10;

        
        //ask user to enter numebr between 1-8
        System.out.println("Enter a number 1-7 to procceed or 8 to exit: ");
        int number = input.nextInt();
        
        //enter while loop sentinel is 'number'
        while (number != 8) {
            //enter switch case, evaluate price and item associated with 'number'
            switch(number){
            
                case 1:
                    total += miniCandyBars;
                    System.out.println("Mini-Candy Bars added");
                    break;
                case 2:
                    total += bubbleGumPacks;
                    System.out.println("Bubble Gum packs added");
                     break;
                case 3:
                    total += popcornBalls;
                    System.out.println("Popcorn Balls added");
                    break;
                case 4:
                    total += gummyMonsters;
                    System.out.println("Gummy Monsters added");
                    break;
                    //5,6,7 empty
                default:
                    System.out.println("Nothing was added");
                    total += 0;
            }
            //exit switch case, still in while loop
            System.out.println("Enter another product number to proceed or 8 to exit: ");
            number = input.nextInt();
        }
        //exit while loop print total
        System.out.println("Your candy order is complete. You owe: $" + total);
    }
    
}
