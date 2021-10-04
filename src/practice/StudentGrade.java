package practice;

import java.util.Scanner;
public class StudentGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of subject(s)");
        int subjectNumber = input.nextInt();
        double [] scores = new double[subjectNumber];

        double sum=0;
        System.out.println("Enter scores");
        for(int i=0; i<subjectNumber; i++) {
            scores[i] = input.nextDouble();
            sum= sum + scores[i];

        }
        double average = sum/subjectNumber;

        System.out.println("The sum of the student score is: " + sum);
        System.out.println("The average score of the student is: " + average);

    }
}
