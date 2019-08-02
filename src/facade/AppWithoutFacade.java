package facade;

public class AppWithoutFacade {
    public static void main(String[] args) {

        //Find if cooker is powerful enough and money are enough, sout delivery message

        Cooker cooker = new Cooker(true, 700);
        MoneyForPizzaMaking money = new MoneyForPizzaMaking(20,50);
        Pizza pizza = new Pizza(PizzaType.MARGARITA,10, 350,cooker);
        StringBuilder result = new StringBuilder();
        boolean canItBeMade=true;
        if(pizza.getCooker().isOn()){
            result.append("Cooker is on");
        }else{
            canItBeMade = false;
        }
        if(pizza.getCooker().getPower()>500){
            result.append(", the power is enough");
        }else{
            canItBeMade=false;
        }
        int moneyWeGot = money.getCoinsNomination()*money.getCountOfCoins();
        if(pizza.getNeededMoney()<=moneyWeGot){
            result.append(", you have enough money");
        }else{
            canItBeMade=false;
        }
        if(canItBeMade){
            System.out.println(result.toString());
            System.out.println(pizza.getPizzaType() + " will be delivered shortly");
        }else{
            System.out.println("You are not qualified for the delivery");
        }

    }
}
