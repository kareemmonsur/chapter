/*prompt user to enter the following;
weight in pounds
height in inches
use the values entered to calculate body mass index
print result
also print standard BMI values from Department of Health and
Human Services/National Institutes of Health
*/


import java.util.Scanner;

public class TwoPointThreeThree{

public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter weight(in pounds): ");

	int weight = input.nextInt();

System.out.print("Enter height(in inches): ");

	int height = input.nextInt();


		double BMI = (weight * 703) / (height * height); 


System.out.println("Your body mass index is: " + BMI);

System.out.print("BMI  VALUES\n");

System.out.printf("Underweight:\t less than %f\n", 18.5);

System.out.printf("Normal:\t\t between %f and %f\n", 18.5, 24.9);

System.out.printf("Overweight:\t between %d and %f\n", 25, 29.9);

System.out.printf("Obese:\t\t %d or greater\n", 30);

}

}
