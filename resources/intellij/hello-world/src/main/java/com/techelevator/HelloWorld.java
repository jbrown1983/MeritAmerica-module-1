package com.techelevator;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class HelloWorld {

    public static void main(String[] args) {

        System.out.println("Hello!");
        System.out.println("Today is " + LocalDate.now());
        System.out.println("The current time is " + LocalTime.now());

    }

}
    int x = 7;
    int y = x % 2;
    boolean answer = y >= 3;
}
    /*


     */
int [] testScores
testScores = new int [10};
  // arrays resprest sequential collections of items. Theres a beginning and an end
  // all Valuse in the array must be the same data type
  // the size of the array must be defined when initializing the array. Once created the
  // side is fixed.

// writing both of these lines in one statement
int [] testScores = new int [10];

// Arrays aren't limited to integers. You can create arrays to hold any data type

string [] names = new String [5]; //an array of Strings
boolean[] switches = new boolean [10]; // an array  of boolean vales

// if you know the vales of your array, you can provide those values at the time of initalization

int [] testScores = new int [] {85, 96, 80, 89, 70, 93, 84, 66, 96 };
// With this code the complier counts the number of items provdied and uses that for the size of the array
//while you do need to define the size of the array when you ilitialize it, you don't need to know they size
// size as long as the size can fit inside of an integer, you can initialize and arrray using an integer variable:

int someRandomNumber = 42;
int [] testScores = new int [someRandomNumber];
//Thiis code creates an array and uses the value some Random Number hold as the time of the array's initalization

// to access a particular element in a array to read fom or assign it to a new value,
// you can use index notation. Enclose the index of the element you're trying ot access with a pair of []

int [] testScores = new int [10]

testScores[0] = 85; // upadte the value at the index 0 to 85
testScores[1] = 96; // update the value at the index 1 to 96
testScores[2] = 80; // ...
testScores[3] = 98; // ...
testScores[4] = 89; // ...
testScores[5] = 70;
testScores[6] = 93
testScores[7] = 84;
testScores[8] = 66;
testScores[9] = 96;

//Retrieving a valuse from an element in the array works like reading the value of a varible assuming you know the index

int [] testScores = new int [10];
// ... populate array

int aaronsScore = testScore [0];

// aaronsScore now holds a copy of the value stored at the index 0 in the testScores array


//Determing the length of an array
// imagine that you wanted to get the last element in an array

int[] testScores = new int [10];
// ... populate the array
int lastValue = testScores[9];

// you could do this but what if someone changes the array and 10 does have a value
//programmers strive to avoid hard-coding numeric valuse into their programs
//fortunetaely there's a formula that calculates the last index at runtime: length - 1
//most programming languages provide a way to access thhis calue fora given array.
//Each array has a propert, .length, that allows you to retrieve the size of the given arrary

int size = testScores.length;
// this syntax is often used when referencing the last value

int[] testScores = new int [10];
//... populate the array

int lastValue = testScores[testScores.length -1];
int secondToLastValue = testScores[testScores.length - 2];

//Remember how expressions are evaluated? the length - 1 expression evaluates first
// and evaluates to 9. That 9 is then used when the program runs to retrieve the
// actual last value from the array.

//One of the best things to learn with arrays is the conecept of loops
// Programs that you write can use any of the follwing control structers during execution

// A straight line/top-down- the program runs from top to bottom and every line executes
//Applying conditional logic- using if/else, the program conditional executes code base on a condition being true.
//Reptitive code flow-the program continually executes a block of code as long as a condition
//remains true/

//3 differnt types of loops used for programming
//for loop-used when you want code to repeat a defined number of times- for example one time for each element in an array
//while loop= used when you want to continually execute a block of code as long as a confition reminas ture
//do-while loop- used when you want to execute a block of code at least once and repeat it as long as condition remains true.
//the most common loop used is the for loop. though for many of the exercises you complete and perfom on the job any loop choices can be substituted.

//writing for a loop
// the for loop is define using the following syntax:

for (<initializer>; <condition>; <interator>){
<body>
}

//the loop consists of 3 important pieces;
//initializer- the statement(or set of statements) that sets the initial state. This is
//excuted on tiem before the loop begins

//condition-before running the body of the loop, the expression is evaluated.
// iterator- a statement 9or set of statements) that executes at the end of each pass through loop.

// the loop continues untill the condition evalutes to false

//if you wanted to print hello world 5 times using a for loops it would look like this

for (int i = 1; <=5; i++){
        System.out.pringIn("Hellow World!");
        }
// heres how the 3 parts match up
//initializer - int i = 1; -declares a local loop variable called i. Its initial vale is 1 and its
//use to track which iteration of loop you're on
//Condition- i <=5 -before running the body of the loops checks to make sure i is less that or equal ti 5
//Iterator- i++ after each iteration of the loop, increments the valuse of i by 1. this sy
//this syntax is equivalent to i-i + 1. The confition is then evaluated again and if it reminas true the body
//executes.

for(int i = 1; i <= 5; i++)
        {
            //body
        }

//tip there ar many different ways to increment a varible:

i = i + i;
i += 1;
i++;

//There is a short-hand syntax for decrementing a variable as well;

i = i - 1;
i -= 1;
i--i;

//if you wanted to create a for loop that iterates through your array of test scores, it might look like this;

int[] testScores = new int [10];
//... array is populated

for (int i = 0; i < testScores.length; i++) {
    int value = testScores [i];
}


//intializer - int i=0; -i tracks which index of the array youre looking at since
//arrays start at index 0, so do you
//condition- i <testScores.length -before running the body of the loop checks to make sure
// i is less than the lenght of the array to avoid an our of range exception
//iterator- i++ -after you look at an element at i, you want to look at the next one i+i.

//1- add up the sum of the scores within the array
//2. divide the sum by the number of scores your averaging

int[] testScores = new int[10]; //the array
//... the array is populated

int sum = 0; // the sume of lal the scores

for (int i = 0; i < testScores.length; i++){
        sum=sum+testScores[i]; //add each score to the sum
        }
    int average = sum / testScores.length;

// in this case you know how big the array is because you still see it. Realistically, you'll
// write this kind of code within methods where you didn't explicitly creat the array

private int getAverage(int[] testScores) {
    int sum = 0; // the sum of all the scores
        for(int i = 0; i < testScores.length; i++){
        sum=sum+testScores[i]; // add each score to the sum
        }
        int average = sim / testScore.length;

        return average;

        }

        int[] testScores = new int[10];
        //... array is populated
    boolean hasPerfectScore = False;

    for (int i = 0; i < testScores.lenght; i++) {
        if (testScores[i] == 100) {
            hasPerfectScore = ture;
            break;  //stop looking for a perfert score if you've found one
        }
        }
    system.out.println("Contains perfect score" + hasPerfectScore);

    //skipping a loop
    int[] testScores = new int[] {100, 94, 0, 87, 88, 0};

    int sum = 0;
    int scoreCount = 0;

    for (int i = 0; i < testScores.length; i++) {
        if (testScores[i] == 0) {
            contuine; // don't count zeroes for average
        }
        sum += testScore[i];
        scoreCount++;
        }

    // sum equal to 369, scoreCount equal to 4

// when this code is run only the non- zero scores are counted and added up. The lines after
// continue aren't run when the loop gets to the two zeros in the array.
