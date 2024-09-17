package AsciiLab.Code;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {

            System.out.println("(^_^.)");
            System.out.println("Welcome to the RPS Beatdown!!");
            System.out.println("Player 1 choose your weapon:");

            Scanner scanner = new Scanner(System.in);
            Hand turn1 = getHand(scanner);
            System.out.println(turn1);
            System.out.println("Player 2 choose your weapon:");
            Hand turn2 = getHand(scanner);
            System.out.println(turn2);

            if (turn1.equals(turn2)) {
                System.out.println("Both parties have dueled their last duel!");
            } else if (turn1.firstPlayerWins(turn2)) {
                System.out.println("Player 1 has destroyed player 2 in battle! ");
            } else {
                System.out.println("Player 2 has destroyed player 1 in battle! ");
            }
        }
    }

    private static Hand getHand(Scanner scanner) {
        String answer = scanner.nextLine();
        Hand turn;

        switch (answer.toLowerCase()) {
            case "rock":
                turn = new Rock();
                break;
            case "paper":
                turn = new Paper();
                break;
            case "scissors":
                turn = new Scissors();
                break;
            default:
                System.out.println("Error, picking rock");
                turn = new Rock();
        }

        return turn;
    }
}
