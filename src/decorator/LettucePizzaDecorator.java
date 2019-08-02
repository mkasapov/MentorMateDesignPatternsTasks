package decorator;

public class LettucePizzaDecorator extends PizzaDecorator {
    public LettucePizzaDecorator(Pizza pizzaOfYourChoice) {
        super(pizzaOfYourChoice);
    }

    @Override
    public String makePizza() {
        return super.makePizza() + " and lettuce";
    }
}
