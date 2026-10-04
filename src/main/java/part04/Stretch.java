package part04;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=2915s
//        rewatch 48:35–52:25 for + - * / % ++ -- and casting
// Guide: GUIDE.md in this folder, steps 1–6
//
// SECTION C — Stretch. Do Stretch A, then Stretch B. The README says what each one should print.
//
// There is no main method here yet. Typing it is part of the stretch.

public class Stretch {
    public static void main(String[] args) {
        /*
        2
        2
        2.5
        11
        9
        3.5
        6
         */
        int n = 10;
        System.out.println(n / 4);
        System.out.println(n % 4);
        System.out.println(n / 4.0);
        n++;
        System.out.println(n);
        n--;
        n--;
        System.out.println(n);
        System.out.println((double) 7 / 2);
        System.out.println(7 / 2 * 2);

        int friends = 4;
        double bill = 50.0;
        System.out.println("Each person pays $"+bill / friends);
        System.out.println();

        int seconds = 500;
        int minutes = seconds / 60;
        int secondsleft =seconds % 60;
        System.out.println(seconds+" seconds is "+minutes+" minutes and "+secondsleft+" seconds");
        System.out.println();

        int t1 = 90;
        int t2 = 85;
        int t3 = 78;
        int avg = (t1 + t2 + t3)/3;
        System.out.println("int average: "+avg);
        double average = (double)(t1 + t2 + t3)/3;
        System.out.println("double average: "+average);






    }

}
