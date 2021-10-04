package ChapterSeven;

import java.util.Scanner;
public class ArrayChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total= 0;
        for(int i=0; i<10; i++) {
            //number[i] = input.nextInt();
            System.out.println("enter number: ");
            total = total + 1;
        }
        System.out.println(total);
    }
}
