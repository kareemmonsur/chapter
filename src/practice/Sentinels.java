package practice;
import java.util.Scanner;
public class Sentinels {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter positive numbers from 1: ");
        int positiveNumbers = input.nextInt();

        int sum = 0;
        while(positiveNumbers !=0) {
            sum = sum + positiveNumbers;

            System.out.println("Enter positive numbers from 1: ");
            positiveNumbers = input.nextInt();

        }

            System.out.println("The sum of the numbers are: " + sum);

    }
}
