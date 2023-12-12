package flowcontrol;

import java.util.Scanner;

/**
 * This program receives two numbers, subtracts them and counts until it
 * reaches the result, i.e. <i>secondParameter - firstParameter</i>
 * <br/>
 * Thus, this will not work if this expression <b>results negative</b>.
 */
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please type the first parameter");
		int firstParameter = scan.nextInt();
		System.out.println("Please type the second parameter");
		int secondParameter = scan.nextInt();

		try {
			count(firstParameter, secondParameter);
		}catch (InvalidParameterException e) {
			e.printStackTrace();
		}

	}

	/**
	 * Receives two parameters and prints numbers from 1 to
	 * <i>secondParameter - firstParameter</i>
	 * @param firstParameter the first parameter
	 * @param secondParameter the second parameter
	 * @throws InvalidParameterException if the result will be negative,
	 * i.e. if the first parameter is bigger than the second
	 */
	private static void count(int firstParameter, int secondParameter)
		throws InvalidParameterException {
		if (firstParameter > secondParameter)
			throw new InvalidParameterException("First parameter cannot be bigger than " +
				"the second one");
		int count = secondParameter - firstParameter;
		for(int i = 0; i < count; i++)
			System.out.println("Printing number " + (i + 1));
	}

}
