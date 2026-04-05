package bankAccountSystem;

class Account {
	int accountNumber;
	String accountHolderName;
	double balance;

	Account(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	Account(int accountNumber, String accountHolderName) {
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
	}

	Account(int accountNumber, String accountHolderName, double balance) {
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
	}

	void deposit(double amount) {
		balance += amount;
		System.out.println("Deposit Successfully");

	}

	void withdraw(double amount) {
		if (balance < amount) {
			System.out.println("insufficient balance");
		} else {
			balance -= amount;
			System.out.println("withdraw successfully");
		}

	}

	void display() {
		System.out.println("Account Number : " + accountNumber);
		System.out.println("Holder Name : " + accountHolderName);
		System.out.println("Balance : " + balance);
	}
}

class SavingAccount extends Account {

	double interestRate;

	SavingAccount(int accountNumber, String accountHolderName, double balance, double interestRate) {
		super(accountNumber, accountHolderName, balance);

		this.interestRate = interestRate;
	}

	void calculateInterest() {
		double interest = balance * interestRate / 100;
		System.out.println("Interest amount : " + interest);
	}
}

public class BankSystem {
	public static void main(String[] args) {
		SavingAccount s1 = new SavingAccount(112, "Rohit", 45999, 5);

		s1.deposit(2000);
		s1.withdraw(5000);
		s1.display();
		s1.calculateInterest();

	}
}
