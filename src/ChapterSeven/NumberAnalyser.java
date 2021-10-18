package ChapterSeven;

import java.util.Scanner;

public class NumberAnalyser {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of items you want to input: ");
        int itemNumber = input.nextInt();

        double [] items = new double[itemNumber];

        System.out.println("Enter numbers: ");
        for(int i= 0; i<= items.length; i++){
            items[i] = input.nextDouble();
           // System.out.println(Arrays.toString(items));
        }

    }

}
