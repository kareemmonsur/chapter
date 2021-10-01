package chapterThree;

import java.util.Scanner;

public class ConditionalCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        if (number % 5==0)
            System.out.println("Hi-five");
            if  (number % 2==0)
                System.out.println("Hi-even");
        }

    }

