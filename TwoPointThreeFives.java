/*prompt user to enter the following;
total miles driven
gasoline cost per gallon
average miles per gallon
parking fee
toll fee per day
use the values entered to calculate driving cost per day 
print result*/


import java.util.Scanner;

public class TwoPointThreeFives{

public static void main(String[] args){

Scanner input = new Scanner(System.in);
	

System.out.println("Enter total miles driven per day: ");

		int totalMiles = input.nextInt();

System.out.println("Enter cost per gallon of gasoline: ");
		
		int gasolineCost = input.nextInt();

System.out.println("Enter Average miles per gallon: ");

		int averageMilesPerGallon = input.nextInt();

System.out.println("Enter parking fees per day: ");

		int parkingFees = input.nextInt();

System.out.println("Enter tolls per day: ");
		
		int tollsPerDay = input.nextInt();


int drivingCostPerDay = (totalMiles / averageMilesPerGallon ) * gasolineCost + parkingFees + tollsPerDay;


System.out.println("Your daily driving cost per day is" + drivingCostPerDay + "Naira");

}


}
