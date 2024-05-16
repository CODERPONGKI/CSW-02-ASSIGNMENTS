
 //Consider a scenario where you are tasked with developing a simple banking application
//using Java, employing the concept of polymorphism.    Your application should consist of three
//classes: Account, SavingsAccount, and CurrentAccount. The Account class serves as the
//base class with private attributes    for account number and balance, along with abstract methods
//for deposit and withdrawal.       The SavingsAccount class, a subclass of Account, should include
//an additional attribute for interest rate and override the deposit method to calculate interest, as
//well as override the             withdrawal method to ensure a sufficient balance. Similarly, the
//CurrentAccount class,          also a subclass of Account, should incorporate an overdraft limit
//attribute and     override the withdrawal method to check the overdraft limit. Implement the
//classes as described, ensuring proper encapsulation and abstraction. Finally, create a
//BankingApplication               class (Main) to demonstrate the polymorphic behavior by creating
//instances of both SavingsAccount and CurrentAccount, testing deposit and withdrawal
//operations, and                             displaying account details.package assignment01;

public class     ass01q07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		abstract class Account {
		    private               String accountNumber;
		    private                 double balance;

		    // Constructor
		    public Account(String accountNumber, double balance) {
		        this.accountNumber =         accountNumber;
		        this.balance =       balance;
		    }

		    // Getter for accountNumber
		    public String          getAccountNumber() {
		        return                accountNumber;
		    }

		    // Setter for accountNumber
		    public void                     setAccountNumber(String accountNumber) {
		        this.accountNumber         = accountNumber;
		    }

		    // Getter for balance created
		    public double getBalance() {
		        return balance;
		    }

		    // Setter for balance
		    public void             setBalance(double balance) {
		        this.balance = balance;
		    }

		    // Abstract method for deposit
		    public abstract            void deposit(double amount);

		    // Abstract method for withdrawal
		    public abstract void withdraw(double amount);

		    // Method to display account details
		    public void displayDetails() {
		        System.out.println("Account Number-:>    " + accountNumber);
		        System.out.println("Balance       -:>  " + balance);
		    }
		}

	}

}
