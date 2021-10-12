package ChapterFour;

import java.util.Scanner;

public class ProductCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int product = 1;
        for (int number = 1; number <= 4; number++){
            System.out.println("Enter number: ");
            number = scanner.nextInt();
            product *= number;

        }
        System.out.println(product);
    }
}
