package observer;

public class ObserverApp {

    public static void main(String[] args) {
        //Create observers
        FirstEmployee first = new FirstEmployee();
        SecondEmployee second = new SecondEmployee();
        ThirdEmployee third = new ThirdEmployee();

        //Create concreteSubject
        Accountant accountant = new Accountant();

        accountant.attach(first);
        accountant.attach(second);
        accountant.notify(new ChristmasBonus(1000));

        System.out.println();

        accountant.detach(first);
        accountant.attach(third);
        accountant.notify(new ChristmasBonus(560));
    }
}
