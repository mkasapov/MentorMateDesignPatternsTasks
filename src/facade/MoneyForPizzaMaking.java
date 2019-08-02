package facade;

public class MoneyForPizzaMaking {

    private int countOfCoins;
    private int coinsNomination;

    public MoneyForPizzaMaking(int countOfCoins, int coinsNomination) {
        this.countOfCoins = countOfCoins;
        this.coinsNomination = coinsNomination;
    }

    public int getCountOfCoins() {
        return countOfCoins;
    }

    public void setCountOfCoins(int countOfCoins) {
        this.countOfCoins = countOfCoins;
    }

    public int getCoinsNomination() {
        return coinsNomination;
    }

    public void setCoinsNomination(int coinsNomination) {
        this.coinsNomination = coinsNomination;
    }
}
