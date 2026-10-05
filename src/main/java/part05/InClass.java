package part05;
import java.util.Random;
// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=3518s
//        rewatch 58:38–68:28 for the Math class and Random
//
// In-class exercise — we do this together in class. Not graded, but commit it.
// The README (In-class exercise) has the steps and the output to match.

public class InClass {
    public static void main(String[] args) {

        // STEP 1 — we type the rover trip report together, here.
        Random random = new Random();
        double east = 3.0;
        double north = 4.0;
        double distance = Math.sqrt(east * east + north * north);
        double leg = Math.max(east, north);
        double battery = 12.6;
        System.out.println("Distance: "+ distance);
        System.out.println("Farther leg: "+leg);
        System.out.println("Battery used, rounded: "+Math.round(battery)+"%");
        System.out.println("Battery used, rounded up: "+Math.ceil(battery)+"%");
        System.out.println("Rocks Found: "+ (random.nextInt(5)+1));

        double root = Math.sqrt(16.0);
        double big = Math.max(3, 7);
        int whole = (int) Math.sqrt(25);



        // sTEP 2 — fix the bugs. Each line below has ONE mistake.
        // Move ONE line at a time above the /* line, so Java sees it.
        // Read the red error. Fix it. Run it. Then do the next line.
        /*



        */
    }
}
