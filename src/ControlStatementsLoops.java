import java.util.Scanner;

public class ControlStatementsLoops {

    //main method will actually run the application
    public static void main(String[] args) {
//  -----------Boolean Expressions---------
//        System.out.println(10 > 5);
//        System.out.println(5 == 5);
//        System.out.println(true == false);
//        System.out.println();
//        System.out.println(2 <= 2);
//
//
////-------Logical Operators
//        boolean isLoggedIn = false;
//        boolean isAdmin = true;
//
//        if (isLoggedIn && isAdmin) {
//            System.out.println("admin page");
//        }

//        System.out.println((true == true) || true == false);
////-------String Comparison---
//        //new keyword creates new object
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Continue? [y/N] ");
//        String userInput = sc.next();

        //Referencing the same object of "John"
//        String firstName = "John";
//        String lastName = "John";

        //dont do// == checks for object location//
//        boolean confirmation = userInput == "y";
        // == checks location of object .equal() looks for the value
//        System.out.println(userInput.equals("y"));

//-------Control Structure------
//    boolean lectureTime = true;
//
//    if(lectureTime) {
//        System.out.println("Learning something");
//    } else {
//        System.out.println("This will always run");
//    }

//    boolean learningJava = true;
//    boolean learningJavascript = true;
//    boolean learningHTML = true;
//
//    if(learningJava && learningJavascript && learningHTML) {
//        System.out.println("Learning JAVA, Javascript, HTML");
//    } if(learningJava) {
//        System.out.println("Learning JAVA");
//    } else if(learningJavascript) {
//        System.out.println("learning Javascript");
//    } else if(learningHTML) {
//        System.out.println("learning HTML");
//    } else {
//        System.out.println("Learning something else");
//    }


//        int caseSwitch = 1;
//
//        switch (caseSwitch) {
//            case 1:
//                System.out.println("Case 1");
//                // Fall through!
//                break;
//            case 2:
//                System.out.println("Case 2");
//                break;
//            default:
//                System.out.println("Default case");
//                break;
//        }
        // While Loop
//        int i = 11;
////        while (i <= 10) {
////            System.out.println("i is " + i);
////            i++;
////        }
//        do {
//            System.out.println("i is " + i);
//            i++;
//        } while (i < 10);

        for(int i = 0; i < 20; i++) {
//            System.out.println("i: " + i);
            if(i == 7) {
                System.out.println("Who - that's a lucky number");
                //continue keyword will skip the iteration at the index
                continue;
            }
            if(i == 9) {
                System.out.println("break the loop");
                break;
            }
            System.out.println("i = " + i);
        }


    }
}
