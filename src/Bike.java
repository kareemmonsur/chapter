public class Bike {
    private boolean isOn;
    private int speed;
    private int gear= 1;

    public Bike() {
    }

  public Bike (boolean isOn, int speed, int gear){
        this.isOn = isOn;
        this.speed = speed;
        this.gear = gear;

    }

    public void turnOn(boolean turnOn) {
        this.isOn = isOn;

    }

    public boolean getIsOn() {
        return isOn;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void accelerateIncrease(int gear) {
        if (gear == 1)
            speed =  speed + 1;
        speed = speed;

        if (gear == 2)
            speed = speed + 2;
        speed = speed;

        if (gear == 3)
            speed = speed + 3;
        speed = speed;
        if (gear == 4)
            speed = speed + 4;
        speed = speed;
    }

    public int returnIsGear() {
        return speed;
    }

    public void accelerateDecrease(int gear) {
        if (gear == 1)
            speed = speed - 1;
        if (gear == 2)
           speed = speed - 2;
        if (gear == 3)
            speed = speed - 3;
        if (gear == 4)
            speed = speed - 4;
    }

    public int getGear() {
        return gear;
    }

    public void setGear() {
        if (speed >= 0 && speed <= 20) {
            int gear = 1;
        }
       if (speed >= 21 && speed <= 30) {
            int gear = 2;
        }
        if (speed >= 31 && speed <= 40) {
            int gear = 3;
        }
        if (speed >= 41) {
            int gear = 4;
        }
    }
    }
