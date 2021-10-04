package ChapterFour;
import java.util.Scanner;
public class GasMileage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of miles driven");
        int milesDriven = input.nextInt();

        System.out.println("Enter number of gallons used");
        int gallon = input.nextInt();

        float total = 0;
        while (milesDriven !=0 && gallon!=0) {

            float average = milesDriven / gallon;
            total= total + milesDriven/gallon;

            System.out.println("Enter number of miles driven");
            milesDriven = input.nextInt();

            System.out.println("Enter number of gallons used");
            gallon = input.nextInt();

        }
        System.out.println(total);


        }

    }
