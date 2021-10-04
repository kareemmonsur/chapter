package chapterThree;

public class AirConditioner {

    public boolean isOn = false;
    private boolean isOff = true;
    private int temperature;

    public void ifIsOn(boolean acIsOn) {
        isOn = acIsOn;
    }

    public boolean returnIsOn() {

        return isOn;
    }

    public void ifAcIsOff(boolean acIsOff) {
        isOff = acIsOff;
    }

    public boolean returnIsOff() {
        return isOff;
    }

    public void setTemperature(int tempValue) {
        temperature = tempValue;
    }

    public void acIncrease() {
        temperature = temperature + 1;
    }

    public int getVolume() {
        return temperature;
    }

    public void acDecrease() {
        temperature = temperature - 1;

    }

    public void acTempIncreaseByNumb(int tempValue) {
        if (tempValue <= 30) ;
        temperature = temperature + 1;
    }

    public void acTempDecreaseByNumb(int tempValue) {
        if (tempValue <= 30) ;
        temperature = temperature - 1;
    }
}





