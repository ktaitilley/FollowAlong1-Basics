package part04;
import javax.swing.JOptionPane;
// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=3191s
//        rewatch 53:11–58:10 for JOptionPane, and 48:08–52:25 for the math
// Guide: GUIDE.md in this folder
//
// SECTION D — Challenge. A tip calculator with pop-up windows. The README lists the rules.
//
// There is no main method here yet. Typing it is part of the challenge.
/*
Ktai Tilley
calculator for tips
 */
public class Challenge {
    public static void main(String[] args) {
        int people = Integer.parseInt(JOptionPane.showInputDialog("How many people are there?"));
        double cost = Double.parseDouble(JOptionPane.showInputDialog("How much was the meal"));
        int tip = Integer.parseInt(JOptionPane.showInputDialog("What is your tip percent?"));
        double tipPercent = (double) tip /100;
        double tipAmount = cost * tipPercent;
        double total = tipAmount + cost;
        double amountEach = total/people;
        int dollarsShort = (int)(Math.round(total % people));
        JOptionPane.showMessageDialog(null, "Tip Amount: " + tipAmount +
                "\nTotal Amount: " + total+
                "\nEach person pays: " + amountEach +
                "\nIf everyone pays " + (int)amountEach +
                ", you are still $"+dollarsShort+" short.");




    }

}
