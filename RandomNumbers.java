package assignment9;

/**
 * RandomNumbers: Generates 6 random numbers, finds average of 6 numbers, finds average of the first 3 random numbers, 
 * and finds the smallest of the 6 numbers. Displays the generated numbers, both average's and the smallest number.
 * @author V. Miranda-Calleja
 */

import java.security.SecureRandom;
public class RandomNumbers {
    
    private static SecureRandom rand = new SecureRandom();
    
    public static void main(String[] args) {
  
        //Generate random number from 1-20
        int num1 = rand.nextInt(21) + 1;
        int num2 = rand.nextInt(21) + 1;
        int num3 = rand.nextInt(21) + 1;
        int num4 = rand.nextInt(21) + 1;
        int num5 = rand.nextInt(21) + 1;
        int num6 = rand.nextInt(21) + 1;
  
        // Print random numbers
        System.out.println("Generated Integer: " + num1);
        System.out.println("Generated Integer: " + num2);
        System.out.println("Generated Integer: " + num3);
        System.out.println("Generated Integer: " + num4);
        System.out.println("Generated Integer: " + num5);
        System.out.println("Generated Integer: " + num6);
        
        //calling method for 6 numbers
        System.out.printf("Average of 6 numbers is %.2f \n" , CalcAverage(num1, num2, num3, num4, num5, num6));
        //calling method for 3 numbers
        System.out.printf("Average of the first 3 numbers is %.2f \n" , CalcAverage(num1, num2, num3));   
        //calling method for smallest number
        GetSmallest(num1, num2, num3, num4, num5, num6);
    }
    
    //Method to average 6 numbers
    public static double CalcAverage(int num1, int num2, int num3, int num4, int num5, int num6) {
        int sum = num1 + num2 + num3 + num4 + num5 + num6;
        double average = (double)sum / 6;
        return average;
    }
    
    //overloaded method to average first 3 random numbers
    public static double CalcAverage(int num1, int num2, int num3) {
       int sum = num1 + num2 + num3;
       double average = (double)sum / 3;
       return average;
    }
    //method to find smallest of the 6 numbers
    public static void GetSmallest(int num1, int num2, int num3, int num4, int num5, int num6) {
        int smallest;
        //compares and stores smallest in variables
        int smallest1 = Math.min(num1, num2);
        int smallest2 = Math.min(num3, num4);
        int smallest3 = Math.min(num5,num6);
        // compares smallest vairables to each other to determine most smallest
        if (smallest1 < smallest2){
            smallest =(Math.min(smallest1, smallest3));
            
        }else{
            smallest = (Math.min(smallest2, smallest3));
        }
        System.out.println("Smallest of the 6 numbers is " + smallest);
        
    }
}