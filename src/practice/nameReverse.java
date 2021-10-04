package practice;

import java.util.Scanner;
public class nameReverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name you want to reverse: ");
        String name = input.nextLine();
        for (int i = name.length(); i > 0; i--)

            // String [] names = {};

            System.out.print(name.charAt(i - 1));
        }
    }

