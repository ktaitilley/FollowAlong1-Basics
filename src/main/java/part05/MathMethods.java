package part05;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=3518s
//        Math class starts at about 58:38 — stop at about 61:29, "here's a project"
// Guide: GUIDE.md in this folder, steps 1–6
//
// Part 05 — the Math class: max, min, abs, sqrt, round, ceil, floor
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called MathMethods.
//    Leave the "package part05;" line and the "public class MathMethods" line alone.
//    Type everything else yourself.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.

public class MathMethods {
    public static void main(String[] args) {
        double x = 3.14;
        //creates a double variable and assigns it to the value.
        double y = -10;
        //creates a double variable and assigns it to the value.
        double z = Math.max(x, y);
        //creates a double variable and assigns it to the max value in the argument.
        System.out.println(z);
        //prints the value of z.
        z = Math.min(x, y);
        //assigns the lowest value in the argument to z.
        System.out.println(z);
        //prints the value of z.
        z = Math.abs(y);
        //assigns the absolute value of y to z.
        System.out.println(z);
        //prints the value of z.
        z = Math.sqrt(y);
        //it assigns the square root of y to z.
        System.out.println(z);
        //prints the value of z.
        y = 3.16;
        //changes y value.
        z = Math.sqrt(y);
        //it assigns the square root of y to z.
        System.out.println(z);
        //prints the value of z.
        z = Math.round(x);
        // it rounds x to the nearest number and assigns it to z.
        System.out.println(z);
        //prints the value of z.
        z = Math.ceil(x);
        //rounds up to the highest number and assigns it to z.
        System.out.println(z);
        //prints the value of z.
        z = Math.floor(x);
        //rounds down to the lowest number and assigns it to z.
        System.out.println(z);
        //prints the value of z.
    }

}
