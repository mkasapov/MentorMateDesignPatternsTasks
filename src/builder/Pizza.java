package builder;

public class Pizza {

    private final String dough;
    private final boolean homeDelivery;
    private final String meat;
    private final String cheese;
    private final int numberOfSlices;


    private Pizza(PizzaBuilder pizzaBuilder) {
        this.dough = pizzaBuilder.dough;
        this.homeDelivery = pizzaBuilder.homeDelivery;
        this.meat = pizzaBuilder.meat;
        this.cheese = pizzaBuilder.cheese;
        this.numberOfSlices = pizzaBuilder.numberOfSlices;

    }


    public String getDough() {
        return dough;
    }

    public String getMeat() {
        return meat;
    }

    public String getCheese() {
        return cheese;
    }

    public int getNumberOfSlices() {
        return numberOfSlices;
    }

    public boolean isHomeDelivery() {
        return homeDelivery;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        if (this.homeDelivery) {
            result.append("Your ordered ").append(this.numberOfSlices).append(" slices of ").append(this.dough).append(" pizza with: ").append(this.meat).append(" and ").append(this.cheese).append(" cheese!");
            result.append(System.lineSeparator());
            result.append("Expect your delivery soon!");
        } else {
            result.append("Your ordered ").append(this.numberOfSlices).append(" slices of ").append(this.dough).append(" pizza with: ").append(this.meat).append(" and ").append(this.cheese).append(" cheese!");
            result.append(System.lineSeparator());
            result.append("Your waiter will come in a minute!");
        }

        return result.toString();
    }

    public static class PizzaBuilder {
        private final String dough;
        private final boolean homeDelivery;
        private String meat = "chicken";
        private String cheese = "mozzarella";
        private int numberOfSlices = 6;


        public PizzaBuilder(String dough, boolean homeDelivery) {
            this.dough = dough;
            this.homeDelivery = homeDelivery;
        }

        public PizzaBuilder meat(String meat) {
            this.meat = meat;
            return this;
        }

        public PizzaBuilder cheese(String cheese) {
            this.cheese = cheese;
            return this;
        }

        public PizzaBuilder numberOfSlices(int numberOfSlices) {
            this.numberOfSlices = numberOfSlices;
            return this;
        }

        public Pizza createPizza() {
            return new Pizza(this);
        }


    }
}
