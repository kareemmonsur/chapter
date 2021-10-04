package practice;

import org.junit.jupiter.api.Test;

public class Lamp {

    private boolean isOn;
    private int brightness;

    public void setOff(boolean isOn) {

        this.isOn = isOn;
    }

    public boolean getIsOn() {

        return isOn;
    }

    public void setIncreaseVol(int brightValue) {
        if (brightValue <= 90) {

            brightness = brightValue + 10;
        }
    }

    public int getBrightness() {
        return brightness;
    }

    public void setDecreaseVol(int brightValue) {
            if (brightValue >= 10) {
                brightness = brightValue - 10;
            }
    }
}


