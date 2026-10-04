package part04;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=2888s
//        rewatch 48:08–52:25 for + - * / % ++ and casting
//
// In-class exercise — we do this together in class. Not graded, but commit it.
// The README (In-class exercise) has the steps and the output to match.

public class InClass {
    public static void main(String[] args) {

        // STEP 1 — we do the pizza party math together, here.
        int f=7;
        int pizza = 8;
        int slices= 3;
        int slicesneeded= f * slices;
        System.out.println("Slices needed: "+slicesneeded);
        int wholepizza = slicesneeded/pizza;
        System.out.println("Whole pizzas: "+wholepizza);
        int slicesleft = slicesneeded%pizza;
        System.out.println("Slices left over: "+slicesleft);
        double exactpizza = (double) (slicesneeded/pizza);
        System.out.println("Exact Pizzas: "+exactpizza);
        f++;
        System.out.println("A friend shows up. Friends: "+f);

        int share = 10 / 4;
        System.out.println("Total: " + (5 + 3));
        System.out.println(slicesneeded / f);






        // STEP 2 — fix the bugs. Each line below has ONE mistake.
        // Move ONE line at a time above the /* line, so Java sees it.
        // Read the red error (or the wrong output). Fix it. Run it. Then do the next line.
        /*



        */
    }
}
