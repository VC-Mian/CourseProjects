package assignment11;
/**
 * AddBonus.java: Prompts user to enter a bonus, store number, department number. 
 * Displays total bonus.
 * @author V. Miranda-Calleja
 */
import java.util.Scanner;
public class AddBonus {
    
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    double sum = 0;
    
    double bonusTable[][] = new double[4][3]; //2d array
    
    //prompts for bonus ammount
    System.out.println("Enter Bonus Amount, or 0 to quit: ");
    double bonus = input.nextDouble();

    while(bonus > 0){
        //ask for store and dept number
        System.out.println("Enter store number 1-4:");
        int store = input.nextInt();

        System.out.println("Accessing store " + store + "...");

        System.out.println("Enter department number: \n1 Produce\n2 Meat\n3 Frozen ");
        int dept = input.nextInt();

        System.out.println("Accessing department " + dept + "...");

        //adds bonus to array 
        bonusTable [store - 1][dept - 1] = bonus;

        System.out.println("Bonus added to store " + store + ", Department " + dept + ".");

        System.out.println("Enter next Bonus Amount, or 0 to quit: ");
        bonus = input.nextDouble();

    }//end of while loop
    
    // adds sum of bonuses
    for(int i = 0; i < bonusTable.length; i++){
        for(int j = 0; j < bonusTable[i].length; j++){
            sum += bonusTable[i][j];
        }
    }
    //display's total
    System.out.printf("Total Bonus: $%.2f" , sum);
    }    
}
    
