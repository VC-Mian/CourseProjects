/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment1;

/**
 * mathOperations.java: asks user for two values then preforms addition, subtraction, multiplication, and division. Displays all answers of math operations.
 * @author V. Miranda-Calleja
 * 1/17/2022
 */
import java.util.Scanner;

public class mathOperations {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        // first number
        System.out.println("Enter the first number:");
        double firstNum = keyboard.nextDouble();
        
        // second number
        System.out.println("Enter the second number");
        double secondNum = keyboard.nextDouble();
        
        //math operations
        double sum = firstNum + secondNum;
        double subtract = firstNum - secondNum;
        double multiply = firstNum * secondNum;
        double divide = firstNum / secondNum;
        
        //results
        System.out.println("Addition: " + firstNum + " + " + secondNum + " = " + sum);
        System.out.println("Subtraction: " + firstNum + " - " + secondNum + " = " + subtract);
        System.out.println("Multiplication: " + firstNum + " * " + secondNum + " = " + multiply);
        System.out.printf("Division:  " + firstNum + " / " + secondNum + " = %.2f%n" , divide);
    }
    
}