package practice;

import java.util.Arrays;
import java.util.Scanner;
public class Example6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] weight = new int[3];
        System.out.println("Enter weight of students: ");
        for(int i=0; i<weight.length; i++) {
        int userInput= input.nextInt();
        weight[i] = userInput;
        }
        System.out.println(Arrays.toString(weight));

//        int [] scores = {20,30,100,40,25};
//       int sum = 0;
//       double average= 0;
//        for(int i = 0; i<5 ; i++) {
//           sum= sum + scores[i];
//        }
//        System.out.println("The sum of scores is" + sum + "and the average is" +  sum/5);
    }

}
