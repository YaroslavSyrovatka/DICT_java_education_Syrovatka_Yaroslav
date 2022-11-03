package ChatBot;
import java.util.Scanner;

public class ChatBot {
    public void botName() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Hello! My name is Gustavo\nI was created in 2022.");
            System.out.println("Please, remind me your name.");
            String name = scanner.nextLine();
            System.out.println("What a great name you have, " + name + "!");
            System.out.println("Let me guess your age.\nEnter remainders of dividing your age by 3, 5 and 7.");
            int remainder3 = scanner.nextInt() % 3;
            int remainder5 = scanner.nextInt() % 5;
            int remainder7 = scanner.nextInt() % 7;
            int age = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105;
            System.out.println("Your age is " + age + "; that`s a good time to start programming!");
            System.out.println("Now I will prove to you that I can count to any number you want.");
            int number = scanner.nextInt();
            for (int i = 0; i <= number; i++) {
                System.out.println(i + "!");
            }
            System.out.println("Let`s test you knowledge." +
                    "\nWhat is the range of the byte type in java?" +
                    "\n1. -128 to 127." +
                    "\n2. 0 to 7." +
                    "\n3. 0 to 1." +
                    "\n4. -32768 to 32767.");
            while (true) {
                int answer = scanner.nextInt();
                if (answer == 1){
                    System.out.println("Great, you right!");
                    break;
                }
                System.out.println("Please, try again.");
            }
            System.out.println("Goodbye, have a nice day!");
        }
    }
}
