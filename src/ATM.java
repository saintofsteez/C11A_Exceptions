

public class ATM {
	private BankAccount bank;
	
	public ATM() {
		super();
		bank = new BankAccount (500);
	}
	
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
