package ChapterSeven;

import java.util.Scanner;

public class SalesCommissionCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of workers: ");
        int numberOfWorkers = input.nextInt();

        double [] grossPay = new double[numberOfWorkers];


        System.out.println("Enter gross pay of workers :");
        int i = 0;
        for (i = 0; i< grossPay.length; i++){
            double salesCommission = 200 + (input.nextInt() * 0.09);
            grossPay[i] = salesCommission;
        }
        int counter = 1;
        for(Double pay:grossPay){

            System.out.print("worker " + counter + " ");
            System.out.print(pay);
            counter++;
            System.out.println();
        }

    }
}
