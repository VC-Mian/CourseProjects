package AssignmentTwo;

/**
 * PayrollCalculations: Generates a payroll based on sales employees total sales amount. Displays Gross Pay, Amount With held, and Net Pay.
 * @author V. Miranda-Calleja
 * 01/27/2022
 */

import java.util.Scanner;

public class PayrollCalculation {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        double basePay = 1000;
        
        //user input
        System.out.println("Enter your name: ");
        String name = keyboard.next();
        
        System.out.println("Enter Total amout of sales: ");
        double salesAmount = keyboard.nextDouble();
        
        //calculations
        double commission = salesAmount * 0.06;
        double grossPay = basePay + commission;
        double withHeld = grossPay * 0.15;
        double netPay = grossPay - withHeld;
        
        //display payroll
        System.out.println("Sales Employee's Name: " + name);
        System.out.printf("Gross Pay: $%.2f%n", grossPay);
        System.out.printf("WithHeld: $%.2f%n", withHeld);
        System.out.printf("Net Pay: $%.2f%n", netPay);        
    }
}
