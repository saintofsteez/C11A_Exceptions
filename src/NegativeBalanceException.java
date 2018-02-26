/**
 * Joseph Woodard
 * Class for an exception in which the balance in the bank account is negative due to a overdraft, user is taking too much money out
 */

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class NegativeBalanceException extends Exception{
	private double negativeBalance;
	private String logFile = "logFile.txt";

	/**
	 * Default constructor, sets the error message to display
	 */
	public NegativeBalanceException() {
		super("Error: negatice balance");
	}

	/**
	 * Another constructor that takes in the parameter which is the negative balance, the balance that would result
	 * from the overdraft. Value should always be negative
	 * 
	 * @param negativeBalance, result of the balance - amount to withdraw
	 */
	public NegativeBalanceException(double negativeBalance) //throws IOException 
	{
		super("Amount exceeds balance by " + negativeBalance);
		this.negativeBalance = negativeBalance;
		
		// Print same message to logfile.txt
		PrintWriter out;
		try {
			out = new PrintWriter(new FileWriter(logFile));
			out.println("Amount exceeds balance by " + negativeBalance);
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public String toString() {
		return "Balance of " + negativeBalance + " not allowed";
	}
	
	
}
