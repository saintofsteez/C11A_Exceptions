import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class NegativeBalanceException extends Exception{
	private double negativeBalance;
	private String logFile = "logFile.txt";

	public NegativeBalanceException() {
		super("Error: negatice balance");
	}

	public NegativeBalanceException(double negativeBalance) //throws IOException 
	{
		super("Amount exceeds balance by " + negativeBalance);
		this.negativeBalance = negativeBalance;
		
		// Print same message to logfile.txt
		//PrintWriter out = new PrintWriter(new FileWriter(logFile));
		//out.println("Amount exceeds balance by " + negativeBalance);
	}

	@Override
	public String toString() {
		return "Balance of " + negativeBalance + " not allowed";
	}
	
	
}
