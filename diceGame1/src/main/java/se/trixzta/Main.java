package se.trixzta;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the DICE GAME!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input name for player 1: ");
        String p1Name = scanner.nextLine();
        Player p1 = new Player(p1Name);

        System.out.println("Input name for player 2: ");
        String p2Name = scanner.nextLine();
        Player p2 = new Player(p2Name);

        int rounds =3;

        for (int i = 1; i < rounds; i++) {
            System.out.println("\nRound"+i);

            System.out.println(p1Name+"s turn to throw die");
            p1.rollDie();
            p1.displayScore();


            System.out.println(p2.name + "s turn to throw a die");
            p2.rollDie();
            p2.displayScore();

        }
        System.out.println("\n Game is finished");
        if (p1.score > p2.score) {
            System.out.println(p1.name + " got " + p1.score + " and " + p2.name +" got " +p2.score+ " and the winner is: " + p1.name);
        } else if (p2.score > p1.score) {
            System.out.println(p1.name + " got " + p1.score + " and " + p2.name + " got " + p2.score + " and the winner is: " + p2.name);
        } else {
            System.out.println(p1.name + " got " + p1.score + " and " + p2.name + " got " + p2.score + " and it's a tie ");
        }

        scanner.close();
    }
}