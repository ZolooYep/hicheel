package Polymorphism_Account_2017_July;

public final class CheckingAccount extends Account {
	public CheckingAccount(double balance) {
		this.balance = balance;
	}
	double balance;
	public double getBalance() {
		return balance;
	}
}
