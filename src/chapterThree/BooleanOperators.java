package chapterThree;

import java.util.Scanner;

public class BooleanOperators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter integer: ");
        int number = scanner.nextInt();

        if(number % 2 ==0 && number % 3 ==0) {
            System.out.println(number + " is divisible by 2 and 3");
        }
            if(number % 2 ==0 || number % 3 ==0) {
                System.out.println(number + " is divisible by 2 or 3");
            }
            if(number % 2 ==0 ^ number % 3 ==0) {
                System.out.println(number + " is divisible by 2 but not both");
            }
            else {
                System.out.println("Number not applicable, try another number");
            }
        }

    }

