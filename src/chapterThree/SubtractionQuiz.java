package chapterThree;

import java.util.Scanner;

public class SubtractionQuiz {
    public static void main(String[] args) {
        //Generate random single numbers
        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);

        //If number1>number2, swap number1 with number 2
        if (number1 > number2){
            int temp = number1;
            number1 = number2;
            temp = number2;
        }

        // prompt the user to ask the question
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is" + " " + number1 + "-" + number2 + "?");
        int answer = scanner.nextInt();

        //display the result
        if (number1 - number2 == answer) {
            System.out.println("You are absolutely correct!");
        }
        else{
            System.out.println("Wrong answer!");
            System.out.println(number1 + " - " + number2 + " " + "should be "  + (number1 - number2) );
        }
    }
}
