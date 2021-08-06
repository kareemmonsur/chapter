import java.util.Scanner;

public class TwoPointThreeFour{

public static void main(String[] args){

Scanner input = new Scanner(System.in);

	//growthRate = 83000000;

	//current world population = 790000000;
	int numberOfYears;

System.out.print("Enter the number of years: ");

	numberOfYears = input.nextInt();

int newPopulation = numberOfYears * 83000000 + 790000000;


System.out.println("world population after" + " " + numberOfYears + "years" + " " +"will be: " + newPopulation);
		

}

}
