package facade;

public class PizzaFacade {
    private Cooker cooker;
    private MoneyForPizzaMaking money;
    private Pizza pizza;
    private StringBuilder result;
    private boolean canItBeMade;

    public PizzaFacade(Cooker cooker, MoneyForPizzaMaking money, Pizza pizza) {
        this.cooker = cooker;
        this.money = money;
        this.pizza = pizza;
        this.result = new StringBuilder();
        this.canItBeMade = true;
    }

    public boolean checkMoney() {
        int moneyWeGot = this.money.getCoinsNomination() * this.money.getCountOfCoins();
        if (this.pizza.getNeededMoney() <= moneyWeGot && this.isCanItBeMade()) {
            this.result.append(", you have enough money");
        } else {
            this.canItBeMade = false;
        }
        return canItBeMade;
    }

    public boolean checkCooker() {
        if (this.pizza.getCooker().getPower() > 500 && this.pizza.getCooker().isOn()) {
            this.result.append("The cooker is ON and the power is enough");
        } else {
            this.canItBeMade = false;
        }
        return canItBeMade;
    }

    public StringBuilder getResult() {
        return result;
    }

    public void setResult(StringBuilder result) {
        this.result = result;
    }

    public boolean isCanItBeMade() {
        return canItBeMade;
    }

    public void setCanItBeMade(boolean canItBeMade) {
        this.canItBeMade = canItBeMade;
    }
}
