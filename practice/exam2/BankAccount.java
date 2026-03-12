public class BankAccount {
	private double balance;
   
	public BankAccount (double balance) {
		this.balance = balance;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	// My error was doing -= instead of setting value to max of Math.max
	public void withdraw(double amount) {
		balance = Math.max(balance - amount, 0);
	}
	
	public double getBalance(){
		return balance;
	}
}