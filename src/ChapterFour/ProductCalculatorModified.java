package ChapterFour;

import java.util.Scanner;

public class ProductCalculatorModified {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many numbers do you want to multiply: ");
        int count = scanner.nextInt();
        int product = 1;
        for (int number = 1; number <= count; number++){
            System.out.println("Enter integer: ");
            int integer = scanner.nextInt();
            product *= integer;

        }
        System.out.println(product);
    }
}
