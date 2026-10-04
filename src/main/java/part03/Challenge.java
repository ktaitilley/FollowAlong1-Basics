package part03;
import java.util.Scanner;
// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=2365s
//        rewatch 39:25–47:00 for Scanner, and 43:34 for the nextInt trap
// Guide: GUIDE.md in this folder, steps 5–11
//
// SECTION D — Challenge. Mad Libs. The README lists the rules.
//
// There is no main method here yet. Typing it is part of the challenge.

/*
Author: KTai Tilley

 */



public class Challenge {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Name a hero:");
        String hero = scan.nextLine();
        System.out.println("Name a villain:");
        String villain = scan.nextLine();
        System.out.println("Name a city:");
        String city = scan.nextLine();
        System.out.println("Name a animal:");
        String animal = scan.nextLine();
        System.out.println(hero + " was walking around "+city+" with thier "+animal+".");
        System.out.println(villain + " came up and hit "+hero+" and took their " + animal + ".");
        String temp;
        temp = hero;
        hero = villain;
        villain = temp;
        System.out.println("Later on, the cops investigated and found out " + villain+" stole "+hero+"'s "+ animal+" at night in "+city+"." );
    }


}
