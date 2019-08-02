package decorator;

public class MeatPizzaDecorator extends PizzaDecorator {


    public MeatPizzaDecorator(Pizza pizzaOfYourChoice) {
        super(pizzaOfYourChoice);
    }

    @Override
    public String makePizza() {
        return super.makePizza() + " and ham";
    }
}
