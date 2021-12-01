package OOP;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        final double PI = 3.14159;
        final String TAB = "\t";
        final String NEWLINE = "\n";
        double radius, area, circumference;

        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.000");
        System.out.println("Enter radius: ");
        radius = scanner.nextDouble();
//compute the area and circumference
        area = PI * radius * radius;
        circumference = 2.0 * PI * radius;
//Display the results
        System.out.println("Given Radius: " + TAB + df.format(radius) + NEWLINE + "Area: " + TAB + df.format(area)
                + NEWLINE + "Circumference: " + TAB + df.format(circumference));
    }
}
