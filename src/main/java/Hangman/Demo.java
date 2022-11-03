package Hangman;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        Hangmen hangmen = new Hangmen();
        Menu menu = new Menu();
        menu.hangmanMenu(user, hangmen);
    }
}
