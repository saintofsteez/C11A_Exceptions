/**
 * Bank Account class that is an onject that stores your balance in one's bank account
 * Has methods to withdraw funds from the bank account.
 * 
 * @author Joseph Woodard
 *
 */

public class BankAccount {
	private double balance;
	
	/**
	 * Constructor that initializes a bank account and set the balance to the parameter given
	 * 
	 * @param balance, the balance of the new bank account
	 */
	public BankAccount(double balance) {
		super();
		this.balance = balance;
	}
	
	/**
	 * Withdraw function that takes a parameter for the amount wanted to withdraw. If the balance resulting form the withdraw is negative
	 * then it will throw a NegativeBalanceException and print out an error containing the negative balance value
	 * 
	 * @param ammount, amount to withdraw
	 * @throws NegativeBalanceException, this exception is triggered when the amount wanted to withdraw is larger than the balance in the account
	 */
	public void withdraw (double ammount) throws NegativeBalanceException {
		if (ammount > balance) {
			throw new NegativeBalanceException(balance - ammount);
		} else {
			balance -= ammount;
		}
	}
	
	/**
	 * Quick withdraw function, takes a parameter for the amount wanted to withdraw. IF the balance resulting is negative it will throw an exception
	 * The exception for this method will not print out the resulting negative balance.
	 * 
	 * @param ammount, amount wanted to withdraw
	 * @throws NegativeBalanceException, this exception is triggered when the amount wanted to withdraw is larger than the balance in the account 
	 */
	public void quickWithdraw(double ammount) throws NegativeBalanceException {
		if (ammount > balance) {
			throw new NegativeBalanceException();
		} else {
			balance -= ammount;
		}
	}
}
