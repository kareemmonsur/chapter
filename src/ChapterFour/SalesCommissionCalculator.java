package ChapterFour;
//(Sales Commission Calculator) A large company pays its salespeople on a commission basis.
//        The salespeople receive $200 per week plus 9% of their gross sales for that week. For example, a
//        salesperson who sells $5,000 worth of merchandise in a week receives $200 plus 9% of $5000, or a
//        total of $650. You’ve been supplied with a list of the items sold by each salesperson. The values of
//        these items are as follows:
//        Item
//        1       sales man = $200 + 0.9(gross sales) / week
//        2
//        3
//        4
//        Value
//        239.99
//        129.75
//        99.95
//        350.89
//        Develop a Java application that inputs one salesperson’s items sold for last week and calculates and
//        displays that salesperson’s earnings. There’s no limit to the number of items that can be sold.


import java.util.Scanner;

public class SalesCommissionCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        for (int item = 1; item<= 3; item++){
        System.out.println("Input price of item: ");
        int itemValue = scanner.nextInt();
        total += itemValue;
        }
        System.out.println(total);

    }
}
