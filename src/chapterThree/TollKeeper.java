package chapterThree;

import java.util.Scanner;

public class TollKeeper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter M,C,T for motor, car and truck respectively: ");
        String userInput = scanner.nextLine();

        if (userInput.toUpperCase().equals("M") == true){
            System.out.println("Your toll fare is $1");
        }
        else if (userInput.toUpperCase().equals("C") == true){
            System.out.println("Your toll fare is $2");
        }
        else if (userInput.toUpperCase().equals("T") == true){
            System.out.println("Your toll fare is $1");
        }
        else{
            System.out.println("Invalid input");
        }

    }
}
