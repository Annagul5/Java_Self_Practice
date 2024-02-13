package javaDay11;

public class PizzaClients {
    public static void main(String[] args) {
        Pizza pizza1 = new Pizza();
        pizza1.size="Small";
        pizza1.numberOfPepperoniTopping=1;
        pizza1.numberOfCheeseTopping=3;
        System.out.println(pizza1);
        Pizza pizza2 = new Pizza();
        pizza2.size="Medium";
        pizza2.numberOfPepperoniTopping=1;
        pizza2.numberOfCheeseTopping=2;
        System.out.println(pizza2);
        Pizza pizza3 = new Pizza();
        pizza3.size="Large";
        pizza3.numberOfPepperoniTopping=5;
        pizza3.numberOfCheeseTopping=7;
        System.out.println(pizza3);


    }
}
