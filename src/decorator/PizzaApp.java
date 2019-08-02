package decorator;

public class PizzaApp {
    public static void main(String[] args) {
        Pizza pizza = new LettucePizzaDecorator(new MeatPizzaDecorator(new BasicPizza()));

        System.out.println(pizza.makePizza());
    }
}
