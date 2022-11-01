package CoffeeMachine;

import java.util.Scanner;

public class CoffeeMachine {
    private int water;
    private int milk;
    private int beans;
    private int cups;

    public void amountOfCoffee() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write how many ml of water the coffee machine has:\n" +
                ">");
        this.water = scanner.nextInt();
        System.out.print("Write how many ml of milk the coffee machine has:\n" +
                ">");
        this.milk = scanner.nextInt();
        System.out.print("Write how many grams of coffee beans the coffee machine has:\n" +
                ">");
        this.beans = scanner.nextInt();
        System.out.print("Write how many cups of coffee you will need:\n" +
                ">");
        this.cups = scanner.nextInt();

    }

    public void amountOfCups() {
        int coffeeCups = 0;

        while (true) {
            if (water >= 200 && milk >= 50 && beans >= 15) {
                water -= 200;
                milk -= 50;
                beans -= 15;
            } else {
                break;
            }
            coffeeCups++;
        }

        if (coffeeCups < cups) {
            System.out.println("No, I can make only " + cups + " cups of coffee");
        } else if (coffeeCups == cups) {
            System.out.println("Yes, I can make that amount of coffee.");
        } else {
            System.out.println("Yes, I can make that amount of coffee (and even " + (coffeeCups - cups) + " more than that)");
        }
    }


    public int getWater() {
        return water;
    }

    public void setWater(int water) {
        this.water = water;
    }

    public int getMilk() {
        return milk;
    }

    public void setMilk(int milk) {
        this.milk = milk;
    }

    public int getBeans() {
        return beans;
    }

    public void setBeans(int beans) {
        this.beans = beans;
    }
}
