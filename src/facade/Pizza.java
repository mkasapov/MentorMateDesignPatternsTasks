package facade;

public class Pizza {

    private PizzaType pizzaType;
    private int numberOfSlices;
    private int neededMoney;
    private Cooker cooker;

    public Pizza(PizzaType pizzaType, int numberOfSlices, int neededMoney, Cooker cooker) {
        this.pizzaType = pizzaType;
        this.numberOfSlices = numberOfSlices;
        this.cooker = cooker;
        this.neededMoney = neededMoney;
    }

    public PizzaType getPizzaType() {
        return pizzaType;
    }

    public void setPizzaType(PizzaType pizzaType) {
        this.pizzaType = pizzaType;
    }

    public int getNumberOfSlices() {
        return numberOfSlices;
    }

    public void setNumberOfSlices(int numberOfSlices) {
        this.numberOfSlices = numberOfSlices;
    }

    public Cooker getCooker() {
        return cooker;
    }

    public void setCooker(Cooker cooker) {
        this.cooker = cooker;
    }

    public int getNeededMoney() {
        return neededMoney;
    }

    public void setNeededMoney(int neededMoney) {
        this.neededMoney = neededMoney;
    }
}
