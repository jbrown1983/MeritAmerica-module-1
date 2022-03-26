package com.techelevator;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

class PaintCalculator {

    private static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {


        while (true) {
            System.out.println("[1] Add a wall");
            System.out.println("[2] Calculate paint required (and Exit)");
            System.out.print("Please choose >>> ");
            String userChoice = userInput.nextLine();

            System.out.println();

            if (userChoice.equals("1")) {


                System.out.println("What's the name of the new wall?");
                String name = userInput.nextLine();

                System.out.println("What color is the wall?");
                String color = userInput.nextLine();

                System.out.println("What kind of wall?");
                System.out.println("[1] Rectangle");
                System.out.println("[2] Square");
                System.out.println("[3] Triangle");
                String shapeChoice = userInput.nextLine();

                if (shapeChoice.equals("1")) {
                    System.out.println("Enter wall height >>> ");
                    int height = Integer.parseInt(userInput.nextLine());
                    System.out.println("Enter wall length >>> ");
                    int length = Integer.parseInt(userInput.nextLine());


                } else if (shapeChoice.equals("2")) {
                    System.out.println("Enter wall side length >>> ");
                    int sideLength = Integer.parseInt(userInput.nextLine());


                } else if (shapeChoice.equals("3")) {
                    System.out.println("Enter wall height >>> ");
                    int height = Integer.parseInt(userInput.nextLine());
                    System.out.println("Enter wall base >>> ");
                    int base = Integer.parseInt(userInput.nextLine());


                }

            } else if (userChoice.equals("2")) {

                Map<String, Integer> colorChoiceAreas = new TreeMap<>();

                int totalArea = 0;


                System.out.println("===============================");
                System.out.println("Total Area: " + totalArea + " square feet");

                for (Map.Entry<String, Integer> colorEntry : colorChoiceAreas
                        .entrySet()) {
                    double gallonsRequiredForColor =
                            (double) colorEntry.getValue() / 400;
                    System.out.println(colorEntry.getKey() + " Paint Required: "
                            + gallonsRequiredForColor + " gallons");
                }

                return;
            }
        }
    }
}
