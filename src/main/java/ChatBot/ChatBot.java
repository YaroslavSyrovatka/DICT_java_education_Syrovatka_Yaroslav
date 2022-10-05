package ChatBot;
import java.util.Scanner;

public class ChatBot {
    public void botName() {
        System.out.println("Hello! My name is Gustavo");
        System.out.println("I was created in 2022");
        System.out.println("Please, remind me your name.");
        String name = scannerString();
        System.out.println("What a great name you have, " + name + "!");
    }

    public String scannerString() {
        try (Scanner scanner = new Scanner(System.in)){
            return scanner.nextLine();
        }
    }
}
