import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;


/**
 * Calculate factorials of some small positive integers.
 * 
 * Input
 * 
 * An integer t, 1<=t<=100, denoting the number of testcases, followed by t 
 * lines, each containing a single integer n, 1<=n<=100.
 * 
 * Output
 * 
 * For each integer n given at input, display a line with the value of n!
 * 
 * @author Bruzer
 */
public class SmallFactorial {
	/** The static final representation of the new line string. */
	private static final String newLine = System.getProperty("line.separator");
	
	/**
	 * Compute the factorial of n, using BigIntegers and return the string value.
	 * @param n The number to compute factorial on.
	 * @return The String representation of n! (factorial).
	 */
	private static String factorial(int n) {
		BigInteger factorial = BigInteger.ONE;
		for (int a = 2; a <= n; ++a) {
			factorial = factorial.multiply(BigInteger.valueOf(a));
		}
		return factorial.toString();
	}
	/**
	 * The main method allows this class to be run on the command line.
	 * @param args The array of String arguments from the command line.
	 */
	public static void main(String [] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader bufferedReader = new BufferedReader(reader, 8192);
		
		int testCases = Integer.parseInt(bufferedReader.readLine());
		StringBuilder builder = new StringBuilder(testCases);
		for (int a = 0; a < testCases; ++a) {
			int n = Integer.parseInt(bufferedReader.readLine());
			builder.append(factorial(n)).append(newLine);
		}
		bufferedReader.close();
		reader.close();
		// Print results to output.
		System.out.print(builder);
		System.out.flush();
		System.exit(0);
	}
}
