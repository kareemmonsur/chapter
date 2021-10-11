package ChapterFour;

import java.util.Scanner;

public class SalesCommissionCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int grossSales = 0;
        for (int item = 1; item<= 3; item++){
        System.out.println("Input price of item: ");
        double itemValue = scanner.nextInt();
            grossSales += itemValue;
        }
        double salesmanEarningPerWeek = (200 + (0.09 * grossSales));
        System.out.println("Sales Man earning for the week is: " + salesmanEarningPerWeek);

    }
}
