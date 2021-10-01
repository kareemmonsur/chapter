package practice;

import java.util.Scanner;

public class sevenSegmentDisplay {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        sevenSegment segment = new sevenSegment();
        System.out.print("Enter  digit in base 2: ");
        String userInput = input.next();
        segment.setUpSevenSegmentScreen(userInput);
        segment.displaySevenSegment();
    }
}
