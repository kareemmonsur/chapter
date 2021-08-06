/*prompt user to enter five integers
check each of the five integers to know the:
number of negative values
number of positive values
number of zero values
print result*/


import java.util.Scanner;

public class TwoPointThreeTwo{

public static void main(String[] args){

Scanner input = new Scanner(System.in);

	int totalNegetives = 0;

	int totalPositives = 0;

	int totalZero = 0;

System.out.print("Enter first integer: ");

	int number1 = input.nextInt();

System.out.print("Enter second integer: ");

	int number2 = input.nextInt();

System.out.print("Enter third integer: ");

	int number3 = input.nextInt();

System.out.print("Enter fourth integer: ");

	int number4 = input.nextInt();

System.out.print("Enter fifth integer: ");

	int number5 = input.nextInt();


		if (number1 < 0 )

			totalNegetives = totalNegetives + 1;

		if (number2 < 0 )

			totalNegetives = totalNegetives + 1;

		if (number3 < 0 )

			totalNegetives = totalNegetives + 1;

		if (number4 < 0 )

			totalNegetives = totalNegetives + 1;

		if (number5 < 0 )

			totalNegetives = totalNegetives + 1;

		if (number1 > 0 )

			totalPositives = totalPositives + 1;

		if (number2 > 0 )

			totalPositives = totalPositives + 1;

		if (number3 > 0 )

			totalPositives = totalPositives + 1;

		if (number4 > 0 )

			totalPositives = totalPositives + 1;

		if (number5 > 0 ) 

			totalPositives = totalPositives + 1;

		if (number1 == 0 )

			totalZero = totalZero + 1; 

		if (number2 == 0 )

			totalZero = totalZero + 1;

		if (number3 == 0 )

			totalZero = totalZero + 1;

		if (number4 == 0 )

			totalZero = totalZero + 1;

		if (number5 == 0 )

			totalZero = totalZero + 1;


System.out.println("Total number of Negative integers: " + totalNegetives);

System.out.println("Total number of Positive integers: " + totalPositives);

System.out.println("Total number of Zeros: " + totalZero);

}

}
