package Hangman;

import java.util.Random;
import java.util.Scanner;

public class Hangmen {
    private String[] words = new String[]{"python", "java", "javascript", "kotlin"};

    private final int randomIndex = new Random().nextInt(words.length);


    public void anons() {
        System.out.println("HANGMAN");
    }

    public void guessWord() {
        Scanner in = new Scanner(System.in);
        System.out.print("Guess the word:> ");
        String userWord = in.next();
        in.close();
        if (userWord.equals(words[randomIndex])) {
            System.out.println("You survived!");
        } else {
            System.out.println("You lost!");
        }
    }

    public String[] getWords() {
        return words;
    }

    public void setWords(String[] words) {
        this.words = words;
    }


}
