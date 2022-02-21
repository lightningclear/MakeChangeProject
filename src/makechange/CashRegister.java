package makechange;

import java.util.Scanner;

public class CashRegister {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int item = 0;
		int pay1 = 0;

		System.out.println("Enter the price of the item: ");
		item = (int) (kb.nextDouble() * 100);
		System.out.println("Enter money tendered: ");
		pay1 = (int) (kb.nextDouble() * 100);

		int changeRemain = pay1 - item;
		if (changeRemain < 0) {
			System.out.println("Customer has not provided enough: ");
		} else if (changeRemain == 0) {
			System.out.println("Exact Change Given: ");
		}

		changeRemain = returnChange(changeRemain, 2000, "Twenties");
		changeRemain = returnChange(changeRemain, 1000, "Tens");
		changeRemain = returnChange(changeRemain, 500, "Fives");
		changeRemain = returnChange(changeRemain, 100, "Dollars");
		changeRemain = returnChange(changeRemain, 25, "Quarters");
		changeRemain = returnChange(changeRemain, 10, "Dimes");
		changeRemain = returnChange(changeRemain, 5, "Nickles");
		changeRemain = returnChange(changeRemain, 1, "Pennies");

	}

	public static int returnChange(int changeRemainInput, int billSize, String billName) {
		int numberOfBills = changeRemainInput / billSize;
		System.out.println(numberOfBills + "\t" + billName);
		int changeRemainOutput = changeRemainInput % billSize;
		return changeRemainOutput;
	}

}
