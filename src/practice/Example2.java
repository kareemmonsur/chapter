package practice;
import java.util.Arrays;
import java.util.Scanner;
public class Example2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String [] names = new String[2];
        for(int i=0; i< names.length; i++){
            System.out.println("Kindly enter a name" + (i+1));
            String userInput= input.nextLine();
            names[i] = userInput;
        }

        System.out.println(Arrays.toString(names));
    }
}
