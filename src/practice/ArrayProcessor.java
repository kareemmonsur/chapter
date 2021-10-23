package practice;

import java.util.Scanner;

public class ArrayProcessor {
    public static void main(String[] args) {
        double[] myList = new double[2];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter " + myList.length + " values: ");
        int i;
        for (i = 0; i < myList.length; i++)
            myList[i] = scanner.nextDouble();
        System.out.println(myList[i] + " ");

    }
}
