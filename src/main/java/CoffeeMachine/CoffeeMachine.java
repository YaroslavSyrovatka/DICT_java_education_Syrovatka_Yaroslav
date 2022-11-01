package CoffeeMachine;

import java.util.Scanner;

public class CoffeeMachine {


    public void amountOfCoffee() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write how many cups of coffee you will need:\n" +
                ">");
        int userInput = scanner.nextInt();
        System.out.println("For " + userInput+ " cups of coffee you will need:");
        System.out.println(userInput * 200 + " ml of water");
        System.out.println(userInput * 50 + " ml of milk");
        System.out.println(userInput * 15 + " of coffee beans");
    }
}
