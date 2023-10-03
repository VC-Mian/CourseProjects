package assignment_5;

/**
 *RegistrationTest.java: The main file to get students info and display registration bill.
 * @author V. Miranda-Calleja
 */

public class RegistrationTest {
    public static void main(String[] args){
        //objects
        Registration student1 = new Registration("Jack", "Black", 12, 30);
        //display bill
        System.out.println(student1);
        
        Registration student2 = new Registration("Adam", "Sandler", 12, 30);
        System.out.println(student2);
        
        //add/subtract 3
        int student1Credit = student1.getNumberOfCredits()+3;
        int student2Credit = student2.getNumberOfCredits()-3;
        
        //update credits
        student1.setNumberOfCredits(student1Credit);
        student2.setNumberOfCredits(student2Credit);
        
        //display updated bill
        System.out.println("Updated Credits:");
        student1.getTotalBill();
        System.out.println(student1);
        student2.getTotalBill();
        System.out.println(student2);
    }            
}
