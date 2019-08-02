package decorator;

public abstract class PizzaDecorator implements Pizza {

    private Pizza pizzaOfYourChoice;

    public PizzaDecorator(Pizza pizzaOfYourChoice) {
        this.pizzaOfYourChoice = pizzaOfYourChoice;
    }

    @Override
    public String makePizza() {
        return pizzaOfYourChoice.makePizza();
    }
}
