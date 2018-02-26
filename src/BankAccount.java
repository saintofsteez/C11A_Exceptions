import java.util.Scanner;

public class BankAccount {
	private double balance;
	public BankAccount(double balance) {
		super();
		this.balance = balance;
	}
	
	public void withdraw (double ammount) throws NegativeBalanceException {
		if (ammount > balance) {
			NegativeBalanceException error = new NegativeBalanceException(balance - ammount);
		} else {
			balance -= ammount;
		}
	}
	
	public void quickWithdraw(double ammount) throws NegativeBalanceException {
		if (ammount > balance) {
			NegativeBalanceException error = new NegativeBalanceException();
		} else {
			balance -= ammount;
		}
	}
}
