package chapterThree;

import java.util.Scanner;

public class Lottery {
    public static void main(String[] args) {
        int lotteryNumber = (int)(Math.random() * 100);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your entry (00-99): ");
        int entryNumber = scanner.nextInt();

        int lotteryNumber1 = lotteryNumber / 10;
        int lotteryNumber2 = lotteryNumber % 10;

        int entryNumber1 = entryNumber / 10;
        int entryNumber2 = entryNumber % 10;
        System.out.println("Today's lottery number is: " + lotteryNumber);

        if (lotteryNumber == entryNumber) {
            System.out.println("Numbers match perfectly! Congratulations, you just won $5000");
        }
            else if (lotteryNumber1 == entryNumber2 && lotteryNumber2 == entryNumber1){
            System.out.println("Numbers match! Congratulations, you just won $3000");
        }
        else if (lotteryNumber1 == entryNumber1 || lotteryNumber2 == entryNumber2 || lotteryNumber1 == entryNumber2 || lotteryNumber2 == entryNumber1) {
            System.out.println("One of the numbers match! Congratulations, you just won $1000");
        }
        else {
            System.out.println("None of the numbers match, try again!");
        }

    }
}
