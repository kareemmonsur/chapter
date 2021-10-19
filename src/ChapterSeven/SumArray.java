package ChapterSeven;

import java.util.Scanner;

public class SumArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter total number of shoes: ");
        int shoeNumber = input.nextInt();

        int [] shoeSizes = new int[shoeNumber];

        System.out.println("Enter shoe sizes: ");
        int i;
        int total = 0;
        for(i = 0; i < shoeSizes.length; i++){
            total=+ shoeSizes[i];

        }
        System.out.println(total);
        System.out.println(total/shoeNumber);
    }
}
