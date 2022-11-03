package Hangman;

import java.util.Scanner;

public class Menu {
    public void hangmanMenu(Scanner scanner, Hangmen hangmen) {
        System.out.println("Type \"play\" to play the game, \"exit\" to quit:");
        String scannerAnswer = scanner.nextLine();
        if (scannerAnswer.equals("play")) {
            hangmen.game();
        } else if (scannerAnswer.equals("exit")) {
            System.exit(0);
        } else {
            hangmanMenu(scanner, hangmen);
        }
    }
}
