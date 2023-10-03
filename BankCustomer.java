package assignment12;

/**
 * bankCustomer.java: Class contains customer name. Method to set amounts to Checking Account and Savings Account. 
 * Method to add total of both accounts and returns information to BankCenter when called.
 * @author V. Miranda-Calleja
 */
public class BankCustomer{
    private String name;
    private Account checkingAccount;
    private Account savingsAccount;
    
    //constructors
    public BankCustomer(){
    }
    
    public BankCustomer(String name){
        this.name = name;
    }
    
    //setters and getter
    public void setName(String name){
        this.name = name;
    }
    //method to set checkings amount
    public void setCheckingAccount(Account check){
        this.checkingAccount = check;
    }
    
    //method to set savings amount
    public void setSavingsAccount(Account save){
        this.savingsAccount = save;
    }
    
    public String getName(){
       return name;
    }
    
    public Account getCheckingAccount(){
        return checkingAccount;
    }
    
    public Account getSavingsAccount(){
        return savingsAccount;
    }
    
    //checking and savings total
    public double getBalance(){
        double total;
        
        total = this.checkingAccount.getBalance() + this.savingsAccount.getBalance();
        
        return total;
    }
    
    //method to be able to display all information in main
    @Override
    public String toString(){
        String info = "---------Account Balances---------\n";
        info += "Customer: " + this.name + "\n";
        info += "Checking Account Balance: " + this.checkingAccount.toString() + "\n";
        info += "Savings Account Balance: " + this.savingsAccount.toString() + "\n";
        info += "----------------------------------\nTotal Balance: $" + this.getBalance() + "\n";
        return info;
    }
}