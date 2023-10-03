package assignment12;

/**
 *BankCenter.java: Receives inputs for name, checking Account and savings account. Displays balance then,
 * asks user for a withdraw for checking account and deposit to savings account. Displays updated balances.
 * @author V. Miranda-Calleja
 */
import java.util.Scanner;
public class BankCenter {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        //object for BankCustomer
        BankCustomer customer = new BankCustomer("Bob");
        
        //objects for Account
        Account checkingAccount = new Account(100.00);
        Account savingsAccount = new Account(200.00);
        
        //sets amounts to accounts using methods from BankCustomer class
        customer.setCheckingAccount(checkingAccount);
        customer.setSavingsAccount(savingsAccount);
        
        //prints out balances and total of both accounts
        System.out.println(customer);
        
        System.out.println("Enter amount to withdraw from checkings account: ");
        double withdrawAmount = input.nextDouble();
        //mwithdraw's from checkingAccount using BankCustomer object
        checkingAccount.withdraw(withdrawAmount);
        
        System.out.println("Enter amount to deposit to Savings Account: ");
        double depositAmount = input.nextDouble();
        //deposit to savingsAccount using BankCustomer object
        savingsAccount.deposit(depositAmount);
        
        //prints updated balances and total of both accounts
        System.out.println("UPDATED Account Balances");
        System.out.println(customer);
        
    }
}
