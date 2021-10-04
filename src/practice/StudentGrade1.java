package practice;

import java.util.Arrays;
import java.util.Scanner;
public class StudentGrade1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of students");
        int studentsSize = input.nextInt();
        System.out.println("Enter number of courses");
        int courseSize = input.nextInt();
        double[][] studentsRecord = new double[studentsSize][courseSize];
        for (int row = 0; row < studentsRecord.length; row++) {
            System.out.println("Student: " + (row + 1));
            for (int column = 0; column < studentsRecord[row].length; column++) {
                System.out.println("Course: " + (column + 1));
                studentsRecord[row][column] = input.nextDouble();
            }
        }
        System.out.println(Arrays.deepToString(studentsRecord));
    }
}