package part05;
import java.util.Random;
// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=3850s
//        random numbers start at about 64:10 — stop at about 68:28
// Guide: GUIDE.md in this folder, steps 11–16
//
// Part 05 — random numbers: nextInt, nextDouble, nextBoolean
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called RandomNumbers.
//    (Do NOT name it Random. Java already has a class called Random.)
//    Leave the "package part05;" line and the "public class RandomNumbers" line alone.
//    The import line goes BETWEEN them (the guide shows where).
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does.

public class RandomNumbers {
    public static void main(String[] args) {
        Random random = new Random();
        // creates a new random object.
        int x = random.nextInt(6)+1;
        //assigns a random int between 1 and 6 and assigns it to x.
        System.out.println(x);
        //prints the value of x.

        double y = random.nextDouble();
        //assigns a random int and assigns it to y.
        System.out.println(y);
        //prints the value of y.

        boolean z = random.nextBoolean();
        //gives a random true or false and assigns it to z.
        System.out.println(z);
        //prints the value of z.

    }

}
