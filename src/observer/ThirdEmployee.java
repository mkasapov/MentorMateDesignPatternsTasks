package observer;

public class ThirdEmployee implements Observer {

    @Override
    public void update(ChristmasBonus christmasBonus) {
        System.out.println("ThirdEmployee Christmas Bonus :: " + christmasBonus.getChristmasBonus());
    }
}
