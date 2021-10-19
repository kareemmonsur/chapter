package ChapterSeven;

import java.util.Scanner;

public class SalesCommissionCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of workers: ");
        int numberOfWorkers = input.nextInt();

        int [] grossPay = new int[numberOfWorkers];

        System.out.println("Enter gross pay of workers :");
        for (int i = 0; i< grossPay.length; i++){
            grossPay[i] = input.nextInt();
        }

    }
}
