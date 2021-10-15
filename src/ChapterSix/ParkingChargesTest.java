package ChapterSix;

import java.util.Scanner;

public class ParkingChargesTest {
    public static void main(String[] args) {
        ParkingCharges charge = new ParkingCharges();
        Scanner scanner = new  Scanner(System.in);
        System.out.println("Enter park time in hours: ");
        double parkTime = scanner.nextDouble();

        double extraTime = parkTime % 3;
        if (parkTime <= 3){
            System.out.println(charge.parkCharges());
        }
    }
}
