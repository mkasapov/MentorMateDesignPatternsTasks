package builder;

public class App {
    public static void main(String[] args) {

        Pizza firstPizza = new Pizza.PizzaBuilder("wheat", true)
                .meat("pork")
                .cheese("white")
                .numberOfSlices(22)
                .createPizza();
        //NO meat!
        Pizza secondPizza = new Pizza.PizzaBuilder("wheat", false)
                .cheese("white")
                .numberOfSlices(22)
                .createPizza();

        System.out.println(firstPizza);
        System.out.println(secondPizza);

    }
}
