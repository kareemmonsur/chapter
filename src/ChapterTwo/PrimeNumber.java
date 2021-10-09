package ChapterTwo;

import java.util.Scanner;

public class PrimeNumber {

        public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            System.out.println("Enter positive integer that is greater than 1: ");
            int number = input.nextInt();
            if (number < 2) {
                System.out.println("Wrong input, enter positive integer that is greater than 1");
            }
            for(int counter = 1; counter<=number; counter++){
                    System.out.println("prime number");
            }

        }
    }








