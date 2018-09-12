package atm;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.Random;

@SuppressWarnings("unused")
public class AtmClientApp {

	public static void main(String args[]) {
		DecimalFormat paddedFormat = new DecimalFormat("00");

		Scanner input = new Scanner(System.in);
		System.out.println("Enter initial balance:");
		System.out.print("> ");
		double initialBalance = input.nextDouble();
		input.nextLine();

		Atm myAtm = new Atm(initialBalance);
		System.out.println("Your current balance is " + initialBalance);
		input.close();
	}
}
