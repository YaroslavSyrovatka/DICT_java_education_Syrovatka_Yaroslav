package Hangman;

import java.util.*;
import java.util.regex.Pattern;

public class Hangmen {
    private List<String> words = Arrays.asList("python", "java", "javascript", "kotlin");

    private Scanner userAnswer = new Scanner(System.in);

    private Random rand = new Random();

    private String word = words.get(rand.nextInt(words.size()));

    private List<Character> userGuess = new ArrayList<>();

    private int wrongAnswer = 0;

    public void game() {
        while(true) {
            if (printResult()) {
                System.out.println("You guessed the word java!\n" +
                        "You survived!");
                userAnswer.close();
                break;
            }

            if (!getUserGuessGhar()) {
                wrongAnswer++;
                System.out.println("That letter doesn`t appear in the word");
            }

            if (wrongAnswer == 9) {
                System.out.println("You lost!");
                userAnswer.close();
                break;
            }


        }
    }

    public boolean printResult() {
        int correctCount = 0;
        for (int i = 0; i < word.length(); i++) {
            if (userGuess.contains(word.charAt(i))) {
                System.out.print(word.charAt(i));
                correctCount++;
            } else {
                System.out.print("-");
            }
        }
        System.out.println();
        return word.length() == correctCount;
    }

    public boolean getUserGuessGhar() {
        System.out.print("Input a letter:>");
        String latterGuess = userAnswer.nextLine();
        String regExp = "[a-z]";
        boolean correctWord = Pattern.matches(regExp,latterGuess);
        boolean checkCorrect = true;
        if (latterGuess.length() != 1) {
            System.out.println("You should input a single letter.");
        } else if (!correctWord){
            System.out.println("Please enter a lowercase English letter.");
        } else if (!word.contains(latterGuess)){
            checkCorrect = false;
        } else if (!userGuess.contains(latterGuess.charAt(0))){
            userGuess.add((latterGuess.charAt(0)));
        } else {
            System.out.println("You`ve already guessed this letter.");
        }

        return checkCorrect;
    }

    public List<String> getWords() {
        return words;
    }

    public void setWords(List<String> words) {
        this.words = words;
    }

    public Scanner getUserAnswer() {
        return userAnswer;
    }

    public void setUserAnswer(Scanner userAnswer) {
        this.userAnswer = userAnswer;
    }

    public Random getRand() {
        return rand;
    }

    public void setRand(Random rand) {
        this.rand = rand;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public List<Character> getUserGuess() {
        return userGuess;
    }

    public void setUserGuess(List<Character> userGuess) {
        this.userGuess = userGuess;
    }
}
