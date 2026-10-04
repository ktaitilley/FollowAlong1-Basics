package part03;
import java.util.Scanner;
// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=2140s
//        rewatch 35:40–38:50 for swapping, 39:25–47:00 for Scanner
// Guide: GUIDE.md in this folder
//
// SECTION C — Stretch. Do Stretch A, then Stretch B. The README says what each one should print.
//
// There is no main method here yet. Typing it is part of the stretch.
// You will also need the Scanner import line, above the class.

public class Stretch {
    public static void main(String[] args) {
        /*

         */
        int a = 1;
        int b = 2;
        a = b;
        b = a;
        System.out.println(a + " " + b);
        int c = 1;
        int d = 2;
        int temp = c;
        c = d;
        d = temp;
        System.out.println(c + " " + d);

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scanner.nextLine();
        System.out.println("Hi, " + name+"!");

    }

}
