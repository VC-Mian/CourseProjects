/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment1;

/**
 * totalForItem.java: Asks user for item description, quantity, and price of an item. Calculates the total price.
 * @author V. Miranda-Calleja
 * 1/17/2022
 */
import javax.swing.JOptionPane;
        
public class TotalForItem {
    public static void main(String[] args) {
        
        String itemDesc = JOptionPane.showInputDialog("Enter Item's Description");
        String numItem = JOptionPane.showInputDialog("Enter Item quantity");
        String price = JOptionPane.showInputDialog("Enter Item Price");
        
        //casting
        int quantity = Integer.parseInt(numItem);
        double priceOfItem = Double.parseDouble(price); 
        
        double total = quantity * priceOfItem; 
        
        JOptionPane.showMessageDialog(null, "Total for " + quantity + " " + itemDesc + "(s): $ " + total);
        
        
                
          
    }
}
