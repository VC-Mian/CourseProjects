package assignment11;
/**
 * ArrayLists.java: prompts user for names to add to ArrayList. Prompts user to remove a name from ArrayList.
 * Displays size and names in ArrayList.
 * @author V. Miranda-Calleja
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Arraylists {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        //creation of arraylist
        ArrayList<String> names = new ArrayList<>();

        //prompts for 3 names
        for(int index = 0; index < 3; index++){
            System.out.println("Enter a name:");
            names.add(input.next());
        }
        
        //displays size
        System.out.printf("Number of Elements in ArrayList: %s%n" , names.size());
        
        //displays names
        System.out.println("Names in ArrayList: ");
        for(int i = 0; i < names.size(); i++) {
            System.out.printf(" %s%n", names.get(i));
        }
        System.out.println();
        
        //prompts for 2 names
        for(int i = 0; i < 2; i ++){
           System.out.println("Enter a name: ");
           names.add(input.next());
        }
        
        //displays size
        System.out.printf("Number of Elements in ArrayList: %s%n" , names.size());
        
        //displays names
        System.out.println("The names in the arraylist are: ");
        for (int i = 0; i < names.size(); i++){
            System.out.printf(" %s%n", names.get(i));
        }
        System.out.println();
        
        //removes name entered
        System.out.println("Enter a name to remove: ");
        names.remove(input.next());
        
        //displays size after removal
        System.out.printf("Number of Elements in ArrayList: %s%n" , names.size());
        
        //displays names after removal
        System.out.println("Names in ArrayList: ");
        for (int i = 0; i < names.size(); i++){
            System.out.printf(" %s%n", names.get(i));
        }
    }
}