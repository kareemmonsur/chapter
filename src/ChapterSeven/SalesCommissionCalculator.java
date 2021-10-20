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
        if(salesCommission >= 200 || salesCommission < 300){
            counterA = counterA + 1;
        }
        else if(salesCommission >= 300 || salesCommission < 400){
            counterB = counterB + 1;
        }
        if(salesCommission >= 400 || salesCommission < 500){
            counterC = counterC + 1;
        }
        if(salesCommission >= 500 || salesCommission < 600){
            counterD = counterD + 1;
        }
        int counter = 1;
        for(Double pay:grossPay){

            System.out.print("Worker " + counter + " ");
            System.out.print(pay);
            counter++;
            System.out.println();
        }

    }
}
