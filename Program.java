import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		
		String option;
		String pin;
		double amount;
		double balance;
		
		
		BankAccount myMoney = new BankAccount(500.00);
		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome, User.");
		System.out.println("Please enter PIN.");
		pin = sc.next();
		
		if (pin.equals("9999")) {
			System.out.println(" ");
	System.out.println("Would you like to make a withdraw or deposit?");
	option = sc.next();
	myMoney.choice(option);
	
	if (option.equals("withdraw")) {
		System.out.println("Please enter the amount of money you wish to withdraw.");
		amount = sc.nextDouble();
		myMoney.withdraw(amount);
	}
	else {
		System.out.println("Please enter the amount of money you with to deposit.");
		amount = sc.nextDouble();
		myMoney.deposit(amount);
		
		}	
	}
		
		else {
			System.out.println("Error: Incorrect PIN");
			System.out.println("Please retry.");
		}
	
		
		
		
	}

}

class BankAccount {
	private double balance;
	public String o;
	public String PIN;
		
	
		
	public BankAccount(double startingBalance) {
		balance = startingBalance;
		
		
	}
	
	public void pinNumber(String pin) {
		PIN = pin;
	}
	
	public void choice(String option) {
		o = option;
		
	}
	
	public void withdraw(double amount) {
		
			if(amount > 0) {
				balance = balance - amount;
				System.out.println("Money dispensed. New balance: $" + balance);
				
				}
				else {
					System.out.println("Error: Amount must be greater than $0.");
				}
	}
	
	public void deposit(double amount) {
		
			if(amount > 0 ) {
				balance = balance + amount;
				System.out.println("Money deposited. New balance: $" + balance);
					
				}
				else {
					System.out.println("Error: Please deposit amount greater than $0");
				}	
	}
	
}
