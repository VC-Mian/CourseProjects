
package assignment_5;

/**
 *Registration.java: Class for RegistrationTest to get first name ,last name ,credits, fees, and bill.
 * @author V. Miranda-Calleja
 */
public class Registration {
    //define attributes
    public String fname, lname;
    private double otherFees, bill;
    private int numCredits;

    //setters/ getters
    public void setFirstName(String name){
        this.fname = name;
    }
    public void setLastName(String name) {
        this.lname = name;
    }
    public void setNumberOfCredits(int credits) {
        if ( credits > 0);
            this.numCredits = credits;
    }
    public void setAdditionalFees(double fees) {
        if (fees > 0);
        this.otherFees = fees;
    }

    //returns everything
    public String getFirstName(){
        return this.fname;
    }
    
    public String getLastName(){
        return this.lname;
    }
    
    public int getNumberOfCredits(){
        return this.numCredits;
    }
    
    public double getAdditionalFees(){
        return this.otherFees;
    }

    
    //define constructors
    public Registration(String fn, String ln, int credits, double fees){
        this.fname = fn;
        this.lname = ln;
        this.numCredits = credits;
        this.otherFees = fees;
    }
    
    //method to get bill
    public double getTotalBill(){
        return this.bill = ((double)numCredits * 70) + otherFees;
       
    }
    //returns students full name and total bill
     public String toString() {
        String info;
     
        info = this.fname + " " + this.lname;
        info = info + "\n Total Credits: " + this.numCredits;
        info = info + "\n Additional Fees: $" + this.otherFees;
        info = "Student: " + info + "\n Registration Bill: $ " + this.getTotalBill();
        
        return info;
    }
}
