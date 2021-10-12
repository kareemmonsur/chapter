package ChapterFour;

import java.util.Scanner;

// find the sum of 10 numbers
public class SumCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter number: ");
//        int number = scanner.nextInt();
        int sum = 0;
        int number;
        for (number = 1; number <= 2; number++) {
            System.out.print("Enter number: ");
            number = scanner.nextInt();
            sum += number;
        }
        System.out.printf("The total sum is: %d",sum);
    }
}
