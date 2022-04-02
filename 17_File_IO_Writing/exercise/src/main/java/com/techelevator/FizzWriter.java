package com.techelevator;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FizzWriter {

	public static void main(String[] args)
	{
		String filename;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the destination file: ");
		filename = sc.nextLine();

		sc.close();

		try {
			PrintWriter writer = new PrintWriter(filename);

			for(int n=1;n<=300;n++)
			{
				if(n%3 == 0 && n%5 == 0)
					writer.println("FizzBuzz");
				else if(n%3 == 0 || (n+"").contains("3"))
					writer.println("Fizz");
				else if(n%5 == 0 || (n+"").contains("5"))
					writer.println("Buzz");
				else
					writer.println(n);
			}

			writer.close();

		} catch (FileNotFoundException e) {
			System.out.println("ERROR: Invalid destination file.");
		}
	}

}