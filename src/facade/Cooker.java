package facade;

public class Cooker {

    private boolean isOn;
    private int power;

    public Cooker(boolean isOn, int power) {
        this.isOn = isOn;
        this.power = power;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
