package part02;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=1743s
//        rewatch 29:00–35:00 if you forget how to make a variable of each type
// Guide: GUIDE.md in this folder, steps 4–10
//
// SECTION C — Stretch. Do Stretch A, then Stretch B. The README says what each one should print.
//
// There is no main method here yet. Typing it is part of the stretch.

public class Stretch {
    public static void main(String[] args) {
        /*
        7
        7.0
        a + b
        a: 7
        77
        14!
        A
        true

         */
        int a = 7;
        double b = 7;
        System.out.println(a);
        System.out.println(b);
        System.out.println("a + b");
        System.out.println("a: " + a);
        System.out.println("" + a + a);
        System.out.println(a + a + "!");
        char c = 'A';
        System.out.println(c);
        boolean on = true;
        System.out.println(on);
        System.out.println();

        String name = "Ktai Tilley";
        int age = 23;
        double gpa = 3.0;
        boolean commuter = true;
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("GPA: " + gpa);
        System.out.println("Commuter: " + commuter);

        char nickname = 'K';
        int classes = 5;
        double works = 36.5;
        boolean havecar = true;
        String school = "Delaware State University";
        System.out.println(nickname + " takes "  + classes + " classes at " + school + " and works " + works + " hours a week. Has a car: " + havecar);

        String city = "Dover";
        long people = 4000000000l;
        char grade = 'B';
        float temp = 72.5f;
        System.out.println(city + " " + people + " " + grade + " " + temp);


    }
}
