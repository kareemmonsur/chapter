package chapterThree;

import java.util.Scanner;

public class ChineseZodiac {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = scanner.nextInt();

        switch (year % 12) {
            case 0: System.out.println("Your zodiac sign is Monkey");
            break;
            case 1: System.out.println("Your zodiac sign is Rooster");
                break;
            case 2: System.out.println("Your zodiac sign is Dog");
                break;
            case 3: System.out.println("Your zodiac sign is Pig");
                break;
            case 4: System.out.println("Your zodiac sign is Rat");
                break;
            case 5: System.out.println("Your zodiac sign is Ox");
                break;
            case 6: System.out.println("Your zodiac sign is Tiger");
                break;
            case 7: System.out.println("Your zodiac sign is Rabbit");
                break;
            case 8: System.out.println("Your zodiac sign is Dragon");
                break;
            case 9: System.out.println("Your zodiac sign is Snake");
                break;
            case 10: System.out.println("Your zodiac sign is Horse");
                break;
            case 11: System.out.println("Your zodiac sign is Sheep");
                break;

        }

    }

}
