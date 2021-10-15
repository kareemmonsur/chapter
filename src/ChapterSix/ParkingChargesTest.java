package ChapterSix;

import java.util.Scanner;

public class ParkingChargesTest {
    public static void main(String[] args) {
        ParkingCharges charge = new ParkingCharges();
        Scanner scanner = new  Scanner(System.in);
        System.out.println("Enter park time in hours: ");
        int parkTime = scanner.nextInt();

//        double extraTime = parkTime % 3;
        if (parkTime <= 3){
            charge.calculateParkingCharges(parkTime);
            System.out.println(charge.parkCharges());
        }
    }
}
