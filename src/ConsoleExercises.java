import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {


// 1.
        double pi = 3.14159;

        //%.2f will round for 2 integers  / %n to start a new line, no space
        System.out.printf("The value of pi is approximately %.2f%n" , pi);


        //Explore the Scanner Class.
// 1. Prompt a user to enter a integer and store that value in an int variable using the nextInt method.
//      What happens if you input something that is not an integer?

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
//        String userInput = scanner.next();
        int userInput = scanner.nextInt();

//        System.out.println("You entered: --> \"" + userInput + "\" <--");
        //**
        System.out.printf("Your new integer is: %d%n", userInput);

// 2. Prompt a user to enter 3 words, and store each of them in a separate variable. Then, display them back in the console, each on a newline.
        //What happens if you enter less than 3 words?
        //What happens if you enter more than 3 words?

        Scanner threeWords = new Scanner(System.in);
        System.out.print("Enter 3 words seperated by space");

        String userInput1 = threeWords.next();
        String userInput2 = threeWords.next();
        String userInput3 = threeWords.next();

//        System.out.print("You entered: --> \"" + userInput1 + "%n" + userInput2 + userInput3 + "\" <--");

        //**
        System.out.printf("The words you entered are: %n %s %n %s %n %s %n", userInput1, userInput2, userInput3);

//        System.out.printf("%s %n, %s %n, %s %n", userInput1, userInput2, userInput3);

// 3. Prompt a user to enter a sentence, then store that sentence in a String variable using the next method. Then, display that sentence back to the user.
//      //do you capture all the words?

        Scanner sentence = new Scanner(System.in);
        System.out.print("Enter a sentence: ");

        //nextLine() to display all the words
        String userInputSen = sentence.nextLine();
        System.out.printf("This is your sentence: %n %s%n", userInputSen);

        //4. Rewrite the above example using the nextLine method.

//***Calculate the perimeter and area of codeup classrooms
        //1. Prompt the user to enter values of length and width of a classroom at Codeup (or your room if virtual).
        //
        //Use the nextLine method each time you need to get user input. In this case, we need it twice, once to get the user input for the length and again to get the user input for the width. Parse the resulting strings to a numeric type.
        //
        //Assume that the rooms are perfect rectangles.
        //Assume that the user will enter valid numeric data for length and width.
        Scanner dimensions = new Scanner(System.in);
        System.out.print("Enter the length codeup classroom: ");
        double length = dimensions.nextInt();

        System.out.print("Enter the width codeup classroom: ");
        double width = dimensions.nextInt();

        double area = length * width;
        double perimeter = (length * 2) + (width * 2);

        System.out.printf("The area is: %n %s%n", area);
        System.out.printf("The perimeter is: %n %s%n", perimeter);

//        int PerLength = Integer.parseInt(length);
//        int PerWidth = Integer.parseInt(width);


        // 2. Display the area and perimeter of that classroom.

        //The area of a rectangle is equal to the length times the width, and the perimeter of a rectangle is equal to 2 times the length plus 2 times the width.
//        System.out.println("Classroom perimeter: --> \"" + (PerLength + PerLength + PerWidth + PerWidth) + "\" <--");
//
//        System.out.println("Classroom area: --> \"" + PerLength * PerWidth + "\" <--");



    }
}
