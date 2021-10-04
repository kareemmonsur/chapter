package chapterThree;

import java.util.Scanner;

public class BabaIjebu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your first lucky number: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter your second lucky number: ");
        int number2 = scanner.nextInt();

        int lotteryNumber1 = (int)(Math.random() * 100);
        int lotteryNumber2 = (int)(Math.random() * 100);
        System.out.println("Baba ijebu first winning number for the week is: " + lotteryNumber1);
        System.out.println("Baba ijebu second winning number for the week is: " + lotteryNumber2);
        if (number1 == lotteryNumber1 && number2 == lotteryNumber2 || number1 == lotteryNumber2 && number2 == lotteryNumber1){
            System.out.println("Congratulations, you have won");
        }
        else{
            System.out.println("Your aren't lucky enough, try again");
        }



    }
}
