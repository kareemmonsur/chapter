package chapterThree;

import java.util.Scanner;

public class ThreePointThreeOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter score: ");
        int score = scanner.nextInt();
        System.out.println("Enter salary: ");
        double salary = scanner.nextDouble();
        if (score > 90)
        System.out.println("Your new salary: " + (salary = (salary * 0.3) + salary));
    }
}
