package com.techelevator;

import java.util.Scanner;

/*
 Write a command line program which prompts the user for the total bill, and the amount tendered. It should then
 display the change required.

 $ java MakeChange
 Please enter the amount of the bill: 23.65
 Please enter the amount tendered: 100.00
 The change required is 76.35
 */
public class MakeChange {

		public static void main(String[] args) {
			Scanner keyboard = new Scanner(System.in);

			double billAmount = 0;
			double moneyGiven = 0;
			double changeRequired = 0;


			String input= "";

			System.out.println("Please Enter Bill Total");
			input = keyboard.nextLine();
			billAmount = Double.parseDouble(input);

			System.out.println("Please Enter Total Amount Tendered");
			input = keyboard.nextLine();
			moneyGiven = Double.parseDouble(input);


			changeRequired = (moneyGiven - billAmount);
			System.out.printf(" Total Required Change Back %.2f\n", changeRequired);
	}

}
