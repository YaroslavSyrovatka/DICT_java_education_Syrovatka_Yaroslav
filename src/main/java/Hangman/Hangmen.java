package Hangman;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Hangmen {
    private String[] words = new String[]{"python", "java", "javascript", "kotlin"};

    private final int randomIndex = new Random().nextInt(words.length);


    public void anons() {
        System.out.println("HANGMAN");
    }

    public String hint(String word) {
        String[] result = word.split("");
        for (int i = 2; i < result.length; i++) {
            result[i] = "-";
        }
        return String.join("", result);
    }


    public void guessWord() {
        Scanner in = new Scanner(System.in);
        String randomWords = words[randomIndex];
        System.out.print("Guess the word " + hint(randomWords) + ":> ");
        String userWord = in.next();
        in.close();
        if (userWord.equals(randomWords)) {
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
