package ChapterSix;
//A parking garage charges a $2.00 minimum fee to park for up to three
//        hours. The garage charges an additional $0.50 per hour for each hour or part thereof in excess of three
//        hours. The maximum charge for any given 24-hour period is $10.00. Assume that no car parks for
//        longer than 24 hours at a time. Write an application that calculates and displays the parking charges
//        for each customer who parked in the garage yesterday. You should enter the hours parked for each
//        customer. The program should display the charge for the current customer and should calculate and
//        display the running total of yesterday’s receipts. It should use the method calculateCharges to de-
//        termine the charge for each customer.

public class ParkingCharges {
    //private double parkingFee;
    private int parkTime;
   // private int extraTime;

    public ParkingCharges(int parkTime) {
      //  this.parkingFee = parkingFee;
        this.parkTime = parkTime;
      //  this.extraTime = extraTime;
    }

    public void calculateParkingCharges() {
        double parkingCharges = 2.00 * parkTime;

    }

//    public double getParkingFee() {
//        return parkingFee;
//    }
//
//    public void setParkingFee(double parkingFee) {
//        this.parkingFee = parkingFee;
//    }

    public int getParkTime() {
        return parkTime;
    }

    public void setParkTime(int parkTime) {
        this.parkTime = parkTime;
    }

//    public int getExtraTime() {
//        return extraTime;
//    }
//
//    public void setExtraTime(int extraTime) {
//        this.extraTime = extraTime;
//    }
}
