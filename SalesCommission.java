package assignment11;
/**
 *SalesCommission: ask user for each employees sales number 
 * then calculates their pay period salary. 
 * displays sales, salary, and average salary.
 * @author V. Miranda-Calleja
 */
import java.util.Scanner;
public class SalesCommission {
    private static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        double sumOfSalaries = 0; 
        
        //ask user number of employees
        System.out.println("Enter number of Employees: ");
        int numEmployee = input.nextInt();
        
        //sales array
        int [] salesAmounts = new int[numEmployee];
        //get sales amount for each emp using array salesAmounts
        GetSales(salesAmounts);
        //displays sales, salary, average
        DisplaySalesAndSalary(salesAmounts, sumOfSalaries, numEmployee);
        
    }//end of main
    
    ////Ask for sales amount and stores it as an element in array for each employee
    public static void GetSales(int[] sales) {
        for(int index = 0; index < sales.length; index ++){
            System.out.println("Enter Amount of Sales for Employee " + (index + 1) + ": ");
            sales[index] = input.nextInt();
        }
    }
    //displays sales, salary for each employee and average salary
    public static void DisplaySalesAndSalary(int [] sales, double sum, int num) {
        for(int index = 0; index < sales.length; index ++){
            //display sales
            System.out.println("Employee " + (index + 1) + " number of sales: " + sales[index]);
            //salary formula
            double salary = 500 + sales[index] * 0.065;
            sum += salary;
            //display salary
            System.out.printf("Employee " + (index + 1) + " Salary : $%.2f%n", salary);   
        }
        //average formula
        double average = sum / num;
        //display average
        System.out.printf("Salary Average: $%.2f" , average);
    }
}

