import java.util.Scanner;

public class TwoPointThreeZero{

public static void main(String[] args){

Scanner input = new Scanner(System.in);

	int number, number1, number2, number3, number4, number5;


System.out.print("Enter a five digit number: ");

	number = input.nextInt();

		number1 = number / 10000;

		number2 = (number % 10000) / 1000;

		number3 = (number % 1000) / 100;

		number4 = (number % 100) / 10;

		number5 = number % 10;

System.out.println("The entered numbers are: " + number1 + "  " + number2 + "  " + number3 + "  " + number4 + "  " + number5);


}

}
