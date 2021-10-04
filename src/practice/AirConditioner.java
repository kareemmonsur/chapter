package practice;

public class AirConditioner {
    private int currentTemperature=16;

    public boolean isOn() {
        return true;
    }

    public void increaseTemperature() {
        if (currentTemperature<30) {
            currentTemperature= currentTemperature + 1;
        }
    }

    public int getTemperature() {
        return currentTemperature;
    }

    public void decreaseTemperature() {
        if (currentTemperature > 16) {
            currentTemperature = currentTemperature - 1;
        }
    }
}


