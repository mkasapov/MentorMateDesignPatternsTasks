package decorator;

public class BasicPizza implements Pizza {
    @Override
    public String makePizza() {
        return "Dough and tomatoes";
    }
}
