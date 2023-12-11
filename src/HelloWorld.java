import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
//        System.out.println("Hello, World!");
//        int id;
//        boolean isLoggedIn;
//        float bankAccountBalance;
//        id = 123;
//        isLoggedIn = false;
//        bankAccountBalance = 1000.23F;
//
//        //variable can be declared seperately using data type and value, or together at once
//        int theAnswer = 42;
//        String question = "What is your favorite color?";
//
//        //"final" keyword is used as the "const" keyword is in JS, variable name is typically in CAPS
//        final int SIDES_OF_A_DICE = 6;
//        final String API_KEY = "b75b703d8195f6f433ca";
//        final String GITHUB_API_BASE_URL = "https://api.github.com";

        //***Exercise***

        // 1. Create an int variable named myFavoriteNumber and assign your favorite number to it, then print it out to the console.
//        int myFavoriteNumber = 17;
//        System.out.println(myFavoriteNumber);

        // 2 Create a String variable named myString and assign a string value to it, then print the variable out to the console.
//        String myString = "Hello Java";
//        System.out.println(myString);

        // 3. Change your code to assign a character value to myString. What do you notice?
//        myString = "!";
//        myString = myString + "!";
//        System.out.println(myString);
        //it seems to only print the character that was assigned, will not print the prior string before it

        // 4. Change your code to assign the value 3.14159 to myString. What happens?
//        myString = 3.14159;
//        System.out.println(myString);
        //error - cannot convert float or int to a String type variable

        // 5. Declare an long variable named myNumber, but do not assign anything to it. Next try to print out myNumber to the console. What happens?
//        long myNumber;
//        System.out.println(myNumber);
        //Will not initialize. Variables are initialized when they are assigned a value.
        //Long used for long integers

        // 6. Change your code to assign the value 3.14 to myNumber. What do you notice?
//        double myNumber = 3.14;
//        System.out.println(myNumber);
        //need to assign the double keyword instead of long

        // 7. Change your code to assign the value 123L (Note the 'L' at the end) to myNumber.
//        myNumber =  123L;
//        System.out.println(myNumber);

        // 8. Change your code to assign the value 123 to myNumber.
        //
        //Why does assigning the value 3.14 to a variable declared as a long not compile, but assigning an integer value does?
//        myNumber = 123;
        //Long is used for long integers, and not for decimals like 3.14

        // 9. Change your code to declare myNumber as a float. Assign the value 3.14 to it. What happens? What are two ways we could fix this?
//        double myNumber = 3.14;
//        System.out.println(myNumber);
        //float will cover a smaller range of decimals

        // 10. Copy and paste the following code blocks one at a time and execute them
        //
//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);
////        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);

        // 11. Try to create a variable named class. What happens?
//        String class = "Hello";
        //Wont work

        // 12. Object is the most generic type in Java. You can assign any value to a variable of type Object. What do you think will happen when the following code is run?
        //
//        String theNumberThree = "three";
//        System.out.println(theNumberThree);
//        Object o = theNumberThree;
//        System.out.println(o);
//        int three = (int) o;
//        System.out.println(o);
        //Copy and paste the code above and then run it. Does the result match with your expectation?
        //
        //How is the above example different from the code block below?
//        int three = (int) "three";
//        System.out.println(three);

        // 13.
        //Rewrite the following expressions using the relevant shorthand assignment operators:

//        int x = 4;
////        x = x + 5;
//        x += 5;
////        int x = 3;
//        x += 3;
//        int y = 4;
////        y = y * x;
//        y *= x;
//        int x = 10;
//        int y = 2;
////        x = x / y;
//        x /= y;
////        y = y - x;
//        y -= x;

        //14. What happens if you assign a value to a numerical variable that is larger (or smaller) than the type can hold? What happens if you increment a numeric variable past the type's capacity?
        //
        //Hint: Integer.MAX_VALUE is a class constant (we'll learn more about these later) that holds the maximum value for the int type.
//        byte specialNumber = 25;
//        System.out.println(specialNumber);

        String name = "codeup";
//        // "%n" is to add a new line /  "%s" is to use the variable name
//        System.out.printf("Hello there, %s. Nice to see you. %n", name);

        String greeting = ("Salutations");
        System.out.printf("%s, %s %n", greeting, name);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter something: ");
        String userInput = scanner.next();

        System.out.println("You entered: --> \"" + userInput + "\" <--");

        //1, import scanner, 2. declare a new scanner 3. set variable to what users input is 4. then pass to the console

        // %s string
    }
}


