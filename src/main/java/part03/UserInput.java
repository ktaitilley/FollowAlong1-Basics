package part03;
import java.util.Scanner;
// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=2365s
//        starts at about 39:25 — stop at about 47:00, after "that is how scanners work"
// Guide: GUIDE.md in this folder, steps 5–11
//
// Part 03, topic 2 — reading what the user types (Scanner)
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this file.
//    His class is called Main. Yours is called UserInput.
//    Leave the "package part03;" line and the "public class UserInput" line alone.
//    He types an import line ABOVE the class. Type yours on the empty line
//    under "package part03;".
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. That includes the import line.

public class UserInput {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        //creates a new scanner named scanner.
        System.out.println("what is your name?");
        // prints the question.
        String name = scanner.nextLine();
        //creates a string variable named name and assigns it to the next enter the scanner has.
        System.out.println("Hello " + name);
        //prints the name.

        System.out.println("How old are you?");
        //prints the question.
        int age = scanner.nextInt();
        //creates a int variable named age and assigns it to the next int value the scanner receives
        scanner.nextLine();
        //moves the scanner to the next enter so it doesnt skip input.
        System.out.println("You are "+age+" years old");
        // prints the age


        System.out.println("What is your favorite food?");
        //prints the question
        String food = scanner.nextLine();
        //creates a string variable named food and asssigned it to the next enter the scanner receives.
        System.out.println("You like "+food);
        //prints the food value.
    }




}
