package com.techelevator;

import java.util.Scanner;

public class TempConvert {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Please enter the temperature: ");

		int temp = input.nextInt();
		input.nextLine();

		System.out.print("Is the temperature in (C)elcius, or (F)arenheit? ");

		String fOrC = input.nextLine();

		System.out.println(temp + fOrC + " is " + doConversion(temp, fOrC) + (fOrC.toUpperCase().startsWith("F") ? "C" : "F"));
	}

	public static int doConversion(int temp, String fOrC) {


		if(fOrC.toUpperCase().startsWith("F")) {
			int resultTempC = (int)(( temp - 32) / 1.8);
			return resultTempC;
		} else {
			int resultTempF = ((int)(temp * 1.8 + 32));
			return resultTempF;
		}
	}
}
