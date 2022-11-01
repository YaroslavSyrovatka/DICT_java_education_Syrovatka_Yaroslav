package CoffeeMachine;

import java.util.Scanner;

public class CoffeeMachine {
    private int money = 550;
    private int water = 400;
    private int milk = 540;
    private int beans = 120;
    private int cup = 9;


    public void printInfo() {
        System.out.println("The coffee machine has:\n" +
                water + " of water\n" +
                milk + " of milk\n" +
                beans + " of coffee beans\n" +
                cup + " of disposable cups\n" +
                money + " of money");
    }

    public void menu() {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Write action (buy, fill, take):\n" +
                ">");
        String userChoose = userInput.next();
        switch (userChoose) {
            case "buy":
                System.out.print("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:\n>");
                String userChooseCoffee = userInput.next();
                switch (userChooseCoffee) {
                    case "1":
                        espresso();
                        break;
                    case "2":
                        latte();
                        break;
                    case "3":
                        cappuccino();
                        break;
                }
                break;
            case "fill":
                fill();
                break;
            case "take":
                take();
                break;
        }
    }

    public void espresso() {
        water -= 250;
        beans -= 16;
        cup -= 1;
        money += 4;

        printInfo();
    }

    public void latte() {
        water -= 350;
        milk -= 75;
        beans -= 20;
        cup -= 1;
        money += 7;

        printInfo();
    }

    public void cappuccino() {
        water -= 200;
        milk -= 100;
        beans -= 12;
        cup -= 1;
        money += 6;

        printInfo();
    }

    public void fill() {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Write how many ml of water you want to add:\n>");
        water += userInput.nextInt();
        System.out.print("Write how many ml of milk you want to add:\n>");
        milk += userInput.nextInt();
        System.out.print("Write how many grams of coffee beans you want to add:\n>");
        beans += userInput.nextInt();
        System.out.print("Write how many disposable coffee cups you want to add:\n>");
        cup += userInput.nextInt();

        printInfo();
    }

    public void take() {
        System.out.println("I gave you " + money);
        money = 0;

        printInfo();
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

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getCup() {
        return cup;
    }

    public void setCup(int cup) {
        this.cup = cup;
    }
}
