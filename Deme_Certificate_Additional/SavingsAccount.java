package Deme_Certificate_Additional;

public class SavingsAccount {
	private double balance;
	private double interest;

	public SavingsAccount(double balance, double interest) {
		this.balance = balance;
		this.interest = interest;
	}

	public double computeTotal() {
		return balance + (balance * interest / 100);
	}

}
