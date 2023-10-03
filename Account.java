package assignment12;

/**
 *
 * @author
 */
public class Account {
    
    //declare instance variables 
    //Remove name instance variable
    private double balance;

    //create constructor with a balance parameter  
    public Account(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        }
    }

    //method to withdraw called withdraw 
    public void withdraw(double withdrawal) {
        if (withdrawal <= this.balance) {
            this.balance -= withdrawal;
        } else {
            System.out.println("Withdrawal amount exceeded account balance.");
        }
    }
    //method to deposit called deposit 
    public void deposit(double deposit) {
        if (deposit >= 0) {
            this.balance = balance + deposit;
        }
    }

    //method to get balance called getBalance 
    public double getBalance() {
        return balance;
    }
    
    @Override
    public String toString(){
        String amount = "$";
        amount += this.balance;
        return amount;
    }
   
}//end of class Account