package CoffeeMachine;

import java.util.concurrent.atomic.AtomicLong;

public class CoffeeMachineDemo {
    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        UserInputClass userInputClass = new UserInputClass();
        coffeeMachine.menu(userInputClass);
    }
}
