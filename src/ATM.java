/**
 * ATM class, created a BankAccount with a beginning balance and then tries to withdraw from the balance
 * printing an error when the resulting balance is negative
 * 
 * @author Joseph Woodard
 *
 */

public class ATM {
	private BankAccount bank;
	
	/**
	 * Default Constructor, creates a bank account with a balance of 500
	 */
	public ATM() {
		super();
		bank = new BankAccount (500);
	}
	
	/**
	 * Hand transactions method tests the withdraw functions using large withdraw amounts, the result of trying to withdraw to much should print an error to the user
	 * 
	 */
	private void handleTransactions(){
		try {
			bank.withdraw(600);
		} catch(NegativeBalanceException e){
			System.out.println(e);
			System.out.println(e.getMessage());
		}
		try {
			bank.quickWithdraw(600);
		} catch (NegativeBalanceException e) {
			System.out.println(e);
			System.out.println(e.getMessage());
		}
	}

	public static void main(String[] args) throws NegativeBalanceException {
		ATM one = new ATM();
		one.handleTransactions();
	}
}
