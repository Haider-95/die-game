package se.trixzta;

import java.util.Random;

public class Player {
    String name;
    int score;

    public Player(String name) {
        this.name = name;
        this.score = 0;
    }
    public void rollDie(){
        Random r = new Random();
        int roll = r.nextInt(6) + 1;
        System.out.println(name + " rolled die and got: " + roll);
        score += roll;
    }
    public void displayScore(){
        System.out.println(name + "'s score is " + score);
    }
}
