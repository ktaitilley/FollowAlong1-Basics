package part02;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=1743s
//        rewatch 29:00–35:00 for every data type
// Guide: GUIDE.md in this folder, steps 4–10
//
// SECTION D — Challenge. A video game character card. The README lists the rules.
//
// There is no main method here yet. Typing it is part of the challenge.

public class Challenge {
    public static void main(String[] args) {
        String gamertag = "yusuke";
        int atk = 60;
        long hp = 10000000l;
        double stamina = 40.5;
        float mp = 167.14f;
        boolean alive = true;
        char rank = 'A';
        System.out.println("=== Character Card ===");
        System.out.println("Name: " + gamertag);
        System.out.println("Attack: " + atk);
        System.out.println("Health: " + hp);
        System.out.println("Magic Power: " + mp);
        System.out.println("Stamina: " + stamina);
        System.out.println("Alive: " + alive);
        System.out.println("Rank: " + rank);

    }

}
