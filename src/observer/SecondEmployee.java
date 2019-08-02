package observer;

public class SecondEmployee implements Observer {

    @Override
    public void update(ChristmasBonus christmasBonus) {
        System.out.println("SecondEmployee Christmas Bonus :: " + christmasBonus.getChristmasBonus());
    }
}
