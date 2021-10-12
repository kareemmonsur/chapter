package ChapterFour;

import java.util.Scanner;

// find the sum of 10 numbers
public class SumCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int number;
        for (number = 1; number <= 2; number++) {
            sum += number;
            System.out.println("Enter number: ");
            number = scanner.nextInt();
        }
        System.out.println(sum);
    }
}
