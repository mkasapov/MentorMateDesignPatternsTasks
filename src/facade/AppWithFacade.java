package facade;

public class AppWithFacade {
    public static void main(String[] args) {

        Cooker cooker = new Cooker(true, 700);
        MoneyForPizzaMaking moneyForPizzaMaking = new MoneyForPizzaMaking(20, 50);
        Pizza pizza = new Pizza(PizzaType.MARGARITA, 10, 350, cooker);
        PizzaFacade pizzaFacade = new PizzaFacade(cooker, moneyForPizzaMaking, pizza);

        if (pizzaFacade.checkCooker() && pizzaFacade.checkMoney()) {
            System.out.println(pizzaFacade.getResult().toString());
            System.out.println(pizza.getPizzaType() + " will be delivered shortly");
        } else {
            System.out.println("NO delivery will be made");
        }
    }
}
