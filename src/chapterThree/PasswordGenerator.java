package chapterThree;

import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first name: ");
        String firstName = scanner.nextLine();

        System.out.println("Enter last name: ");
        String lastName = scanner.nextLine();

        int passwordNumber = 100 + (int)(Math.random() * 900);
        String password = (firstName.substring(0,2).toLowerCase() + lastName.substring(0,2).toLowerCase() + passwordNumber);
        System.out.println("Your password is: " + password);
    }
}
