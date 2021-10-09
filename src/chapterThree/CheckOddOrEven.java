package chapterThree;

import java.util.Scanner;

public class CheckOddOrEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first digit: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter second digit: ");
        int secondNumber = scanner.nextInt();

        if(firstNumber % 2 == 0 && secondNumber % 2 == 0){
            System.out.println(firstNumber + "and" + secondNumber + "are" + "even");
        }
        else if (firstNumber % 2 == 1 && secondNumber % 2 == 1){
            System.out.println(firstNumber + "and" + secondNumber + "are" + "odd");
        }
        else{
            System.out.println("Nothing special");
        }
    }
}
