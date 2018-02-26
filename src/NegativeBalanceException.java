
public class NegativeBalanceException extends Exception{
	private double negativeBalance;
	private String logFile = "logFile.txt";

	public NegativeBalanceException() {
		super("Error: negatice balance");
	}

	public NegativeBalanceException(double negativeBalance) {
		super("Amount exceeds balance by " + negativeBalance);
		this.negativeBalance = negativeBalance;
		// Print same message to logfile.txt
	}

	@Override
	public String toString() {
		return "Balance of " + negativeBalance + "not allowed";
	}
	
	
}
