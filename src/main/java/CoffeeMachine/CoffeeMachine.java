package CoffeeMachine;

import java.util.Scanner;

public class CoffeeMachine {
    private int money = 550;
    private int water = 400;
    private int milk = 540;
    private int beans = 120;
    private int cup = 9;

    private void printInfo(UserInputClass user) {
        System.out.println("The coffee machine has:\n" +
                water + " of water\n" +
                milk + " of milk\n" +
                beans + " of coffee beans\n" +
                cup + " of disposable cups\n" +
                money + " of money");

        menu(user);
    }


    public void menu(UserInputClass user) {
        System.out.print("Write action (buy, fill, take, remaining, exit):\n" +
                ">");
        switch (user.userInput()) {
            case "buy":
                System.out.print("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back – to\n" +
                        "main menu:\n>");
                switch (user.userInput()) {
                    case "1":
                        espresso(user);
                        break;
                    case "2":
                        latte(user);
                        break;
                    case "3":
                        cappuccino(user);
                        break;
                    case "back":
                        menu(user);
                        break;
                }
                break;
            case "fill":
                fill(user);
                break;
            case "take":
                take(user);
                break;
            case "remaining":
                printInfo(user);
                break;
            case "exit":
                System.exit(0);
                break;
        }
    }

    private void espresso(UserInputClass user) {
        if(water >= 250 && beans >= 16 && cup >= 1) {
            System.out.println("I have enough resources, making you a coffee!");
            water -= 250;
            beans -= 16;
            cup -= 1;
            money += 4;
            menu(user);
        } else if(water < 250){
            System.out.println("Sorry, not enough water!");
            menu(user);
        } else if (beans < 16) {
            System.out.println("Sorry, not enough beans!");
            menu(user);
        } else {
            System.out.println("Sorry, not enough cups!");
            menu(user);
        }
    }

    private void latte(UserInputClass user) {
        if(water >= 350 && milk >= 75 && beans >= 20 && cup >= 1) {
            System.out.println("I have enough resources, making you a coffee!");
            water -= 350;
            milk -= 75;
            beans -= 20;
            cup -= 1;
            money += 7;
            menu(user);
        } else if(water < 350){
            System.out.println("Sorry, not enough water!");
            menu(user);
        } else if (milk < 75) {
            System.out.println("Sorry, not enough milk!");
            menu(user);
        } else if (beans < 20) {
            System.out.println("Sorry, not enough beans!");
            menu(user);
        } else {
            System.out.println("Sorry, not enough cups!");
            menu(user);
        }
    }

    private void cappuccino(UserInputClass user) {
        if(water >= 200 && milk >= 100 && beans >= 12 && cup >= 1) {
            System.out.println("I have enough resources, making you a coffee!");
            water -= 200;
            milk -= 100;
            beans -= 12;
            cup -= 1;
            money += 6;
            menu(user);
        } else if(water < 200){
            System.out.println("Sorry, not enough water!");
            menu(user);
        } else if (milk < 100) {
            System.out.println("Sorry, not enough milk!");
            menu(user);
        } else if (beans < 12) {
            System.out.println("Sorry, not enough beans!");
            menu(user);
        } else {
            System.out.println("Sorry, not enough cups!");
            menu(user);
        }
    }

    private void fill(UserInputClass user) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Write how many ml of water you want to add:\n>");
        water += userInput.nextInt();
        System.out.print("Write how many ml of milk you want to add:\n>");
        milk += userInput.nextInt();
        System.out.print("Write how many grams of coffee beans you want to add:\n>");
        beans += userInput.nextInt();
        System.out.print("Write how many disposable coffee cups you want to add:\n>");
        cup += userInput.nextInt();
        menu(user);
    }

    private void take(UserInputClass user) {
        System.out.println("I gave you " + money);
        money = 0;
        menu(user);
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
