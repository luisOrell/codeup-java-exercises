import java.util.Scanner;
import java.util.Formatter;


public class ControlFlowExercises {
    public static void main(String[] args) {


        //A.  While loop
//        int i = 5;
//        //Create a while loop that runs so long as i is less than or equal to 15
//        while(i < 15) {
//            System.out.println(i);
//            i++;
//        }

        //B.  Do while loop.
        //Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.

//        int i = 0;
//        do {
//            System.out.println(i);
//            i += 2;
//        } while (i <= 100);

        // Alter your loop to count backwards by 5's from 100 to -10.
//        int i = 100;
//        do {
//            //System.out. starting in the first line of the Do loop to account for the 100
//            System.out.println(i);
//            i -= 5;
//        } while(i >= -10);

        //Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal:
        // 2
        // 4
        // 16
        // 256
        // 65536

//       long i = 2;
//        do {
//            System.out.println(i);
//            i *= i;
//        }
//        while(i <= 1_000_000);

        //C.
        //Refactor the previous two exercises to use a for loop instead.

//        for(int i = 0; i <= 100; i += 2) {
//        System.out.println(i);
//    }
//Create a while loop that runs so long as i is less than or equal to 15
//Each loop iteration, output the current value of i, then increment i by one.
//        for(int i = 5; i <= 15; i++) {
//            System.out.println(i);
//        }
//Alter your loop to count backwards by 5's from 100 to -10.
//        for(int i = 100; i >= -10; i -= 5) {
//            System.out.println(i);
//        }
//Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal
//    for(long i = 2; i <= 1_000_000; i *= i) {
//        System.out.println(i);
//    }

        //Fizzbuzz
        //
        //One of the most common interview questions for entry-level programmers is the FizzBuzz test. Developed by Imran Ghory, the test is designed to assess basic looping and conditional logic skills.
        //
        //Write a program that prints the numbers from 1 to 100.
        //For multiples of three: print “Fizz” instead of the number.
        //For the multiples of five: print “Buzz”.
        //For numbers which are multiples of both three and five: print “FizzBuzz”.

//        for(int i = 0; i < 100; i++) {
//            if(i % 3 == 0 && i % 5 == 0) {
//                System.out.println("FizzBuzz");
//            } else if(i % 3 == 0) {
//                System.out.println("Fizz");
//            } else if(i % 5 == 0) {
//                System.out.println("Buzz");
//            } else {
//                System.out.println(i);
//            }
//        }

        //        Display a table of powers.
//
//                Prompt the user to enter an integer.
//        Display a table of squares and cubes from 1 to the value entered.
//        Ask if the user wants to continue.
//        Assume that the user will enter valid data.
//        Only continue if the user agrees to.
//        Example Output
//
//        What number would you like to go up to? 5
//
//        Here is your table!
//
//                number | squared | cubed
//                ------ | ------- | -----
//                1      | 1       | 1
//                2      | 4       | 8
//                3      | 9       | 27
//                4      | 16      | 64
//                5      | 25      | 125

        Scanner scanner = new Scanner(System.in);

        boolean confirm;
        
//        do {
//            System.out.print("Enter a number ");
//            int userInput = scanner.nextInt();
//            System.out.println("Here is your table!");
//            System.out.println("number | squared | cubed");
//            System.out.println("------ | ------- | -----");
//
//            for (int i = 1; i <= userInput; i++) {
//                int squaredInt = i * i;
//                int cubedInt = i * i * i;
//                //characters used to format spaces based on input
//                System.out.printf("%-7s|%-9s|%-6s\n", i, squaredInt, cubedInt);
//            }
//            System.out.println("Cotinue y/N?");
//            //confirm variable used to check it user input equal to "y"
//            confirm = scanner.next().equalsIgnoreCase("y");
//
//
//        } while (confirm);
//        System.out.println("Cool, see you next time");


//4. Convert given number grades into letter grades.
//
//Prompt the user for a numerical grade from 0 to 100.
//
//Display the corresponding letter grade.
//
//Prompt the user to continue.
//
//Assume that the user will enter valid integers for the grades.
//
//The application should only continue if the user agrees to.
//
//Grade Ranges:
//
//A : 100 - 88
//B : 87 - 80
//C : 79 - 67
//D : 66 - 60
//F : 59 - 0

        do {
            System.out.println("Enter a grade from 0 - 100");
            int userInput1 = scanner.nextInt();
            //Scanner grades = new Scanner(System.in); note: not needed-using scanner from prior exercise
                if (userInput1 >= 88) {
                    System.out.println("A");

                } else if (userInput1 < 87 && userInput1 >= 80) {
                    System.out.println("B");

                } else if (userInput1 < 79 && userInput1 >= 67) {
                    System.out.println("C");

                } else if (userInput1 < 66 && userInput1 >= 60) {
                    System.out.println("D");

                } else {
                    System.out.println("F");

                }
                System.out.println("Continue? [y/N?]");
                confirm = scanner.next().equalsIgnoreCase("y");

        }while (confirm) ;
            System.out.println("Ok, goodbye");


    }
}
