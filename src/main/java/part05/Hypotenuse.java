package part05;
import java.util.Scanner;
// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=3689s
//        the hypotenuse project starts at about 61:29 — stop at about 63:52
// Guide: GUIDE.md in this folder, steps 7–10
//
// Part 05 — a project that uses the Math class: find the long side of a triangle
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called Hypotenuse.
//    Leave the "package part05;" line and the "public class Hypotenuse" line alone.
//    The import line goes BETWEEN them (the guide shows where).
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does.

public class Hypotenuse {
    public static void main(String[] args) {

        double x;
        //creates a double variable named x.
        double y;
        //creates a doublel variable named y.
        double z;
        //creates a double variable named z.
        Scanner scanner = new Scanner(System.in);
        //creates a new scanner.

        System.out.println("Enter side x: ");
        //prints the statement.
        x = scanner.nextDouble();
        // assigns x the double input from the scanner.
        System.out.println("Enter side y: ");
        //prints the statement.
        y = scanner.nextDouble();
        //assigns y the double input from the scanner.
        z = Math.sqrt((x * x) + (y * y));
        //it takes the square root from the argument and assigns it to z.
        System.out.println("The hypotenuse is: " + z);
        //prints the statement.
        scanner.close();
        //closes the scanner so it doesnt take anymore input.


    }

}
