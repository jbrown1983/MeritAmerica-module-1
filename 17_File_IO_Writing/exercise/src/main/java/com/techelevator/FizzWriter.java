package com.techelevator;


import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FizzWriter {

	public static void main(String[] args)
	{
		String filename;
		Scanner sc = new Scanner(System.in);

		// input the destination file
		System.out.println("Enter the destination file: ");
		filename = sc.nextLine();

		sc.close();

		try {
			// create a new file with given filename
			PrintWriter writer = new PrintWriter(filename);

			// loop from 1 to 300(inclusive)
			for(int n=1;n<=300;n++)
			{
				if(n%3 == 0 && n%5 == 0) // n is divisible by 3 and 5, output "FizzBuzz" to file
					writer.println("FizzBuzz");
				else if(n%3 == 0 || (n+"").contains("3")) // n is divisible by 3 or n contains 3, output "Fizz"
					writer.println("Fizz");
				else if(n%5 == 0 || (n+"").contains("5")) // n is divisible by 5 or n contains 5, output "Buzz"
					writer.println("Buzz");
				else // else output n
					writer.println(n);
			}

			writer.close(); // close the file


		} catch (FileNotFoundException e) {
			// invalid destination file, display error and exit
			System.out.println("ERROR: Invalid destination file.");
		}
	}

}