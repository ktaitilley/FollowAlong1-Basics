package part04;
import javax.swing.JOptionPane;
//imports a screen java uses to display things.
// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=3191s
//        starts at about 53:11 — stop at about 58:10, at "in conclusion ladies and gentlemen"
// Guide: GUIDE.md in this folder, steps 7–11
//
// Part 04, topic 2 — pop-up windows with JOptionPane
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this file.
//    His class is called Main. Yours is called GUI.
//    Leave the "package part04;" line and the "public class GUI" line alone.
//    He types an import line ABOVE the class. Type yours on the empty line
//    under "package part04;".
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. That includes the import line.

public class GUI {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("What is your name?");
        //creates a string variable called name and a screen java uses to show the text.
        JOptionPane.showMessageDialog(null, "Hello "+name);
        // shows the text and input from the last screen.
        int age= Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        //creates a variable named age and assigns it to the int input on the screen.
        JOptionPane.showMessageDialog(null, "You are "+age+" years old");
        //shows the text and input from last screen

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
        //creates a variable named height and assigns it to the int input on the screen.
        JOptionPane.showMessageDialog(null, "You are " + height + " cm tall");
        //shows the text and input from last screen.

    }

}
