package part02;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=1743s
//        rewatch 29:00–35:00 for every data type
//
// In-class exercise — we do this together in class. Not graded, but commit it.
// The README (In-class exercise) has the steps and the output to match.

public class  InClass {
    public static void main(String[] args) {

        // STEP 1 — we make the rover's variables together, here, and print them.
        String rover = "Sting";
        //crates a string variable named sting.
        int battery = 87;
        //creates a int variable and assigns it a value of 87.
        double speed = 1.5;
        //creates a double variable and assigns it a value of 1.5.
        char node = 'c';
        //creates a char variable and assigns it to 'c'.
        boolean lightson = true;
        //creates a boolean variable and assigns it to true  or false.
        System.out.println("Rover " + rover + " has "+battery+"% battery.");
        //prints text using variables.
        System.out.println("Speed: "+speed + " m/s, node "+node+", lights on: "+lightson);
        //prints text using variables
        battery = battery-12;
        //changes the int variable using arithmetic
        System.out.println("After driving, battery is "+battery+"%.");
        //prints text using variables.
        int fuel = 87;
        //creates a int variable and assigns it to 87.
        char grade = 'C';
        //creates a char variable and assigns it to 'c'.
        System.out.println(battery);
        //prints the value of the variable battery.



        // STEP 2 — fix the bugs. Each line below has ONE mistake.
        // Move ONE line at a time above the /* line, so Java sees it.
        // Read the red error. Fix it. Run it. Then do the next line.
        /*



        */
    }
}
