package ChapterSix;

public class ParkingCharges {
    private double parkCharges;
    private int parkTime;

    public ParkingCharges() {
    }

    public void calculateParkingCharges(int parkTime) {
        parkCharges = parkTime * 2.0;

    }
    public double parkCharges(){
        return parkCharges;
    }

    public int getParkTime() {
        return parkTime;
    }

    public void setParkTime(int parkTime) {
        this.parkTime = parkTime;
    }

}
