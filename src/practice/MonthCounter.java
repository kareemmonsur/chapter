package practice;

import java.util.Scanner;

public class MonthCounter {
    public static void main(String[] args) {
        String [] months = {"January","February","March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter month number(1-12): ");
        int monthNumber = scanner.nextInt();
        System.out.println("The month is " + months[monthNumber - 1]);

    }
}
