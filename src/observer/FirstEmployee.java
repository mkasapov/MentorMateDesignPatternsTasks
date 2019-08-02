package observer;

public class FirstEmployee implements Observer {


    @Override
    public void update(ChristmasBonus christmasBonus) {
        System.out.println("FirstEmployee Christmas Bonus :: " + christmasBonus.getChristmasBonus());
    }
}
