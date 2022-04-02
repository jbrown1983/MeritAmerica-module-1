package com.techelevator;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FizzWriter {


	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter filename: ");
		String file = scanner.nextLine();

		File theFile = new File(file);

		if (!theFile.exists()) {
			System.out.println("Error: " + file + " not found.");
			return;
		}

		try {
			FileWriter writer = new FileWriter(theFile);
			for (int num = 1; num <= 300; num++) {
				if (num % 3 == 0 && num % 5 == 0) writer.write("FizzBuzz\r\n");
				else if (num % 3 == 0) writer.write("Fizz\r\n");
				else if (num % 5 == 0) writer.write("Fizz\r\n");
				else writer.write(String.format("%d\r\n", num));
			}
			writer.flush();
			writer.close();
			System.out.println(file + " overwritten successfully.");

		} catch (IOException e) {
			System.out.println("Error: " + file + " not found.");
		}

	}
}
