package ChapterFour;

import java.util.Scanner;

public class SumCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int number;
        for (number = 1; number <= 2; number++) {
            System.out.print("Enter number: ");
            number = scanner.nextInt();
            sum += number;
        }
        System.out.println("The sum of numbers are: " + sum);
    }
}
