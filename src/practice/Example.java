package practice;
import java.util.Scanner;
public class Example {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       System.out.println(("Kindly enter your name"));
       String [] names = new String [10];
        names [0] = input.nextLine();
        names [1] = input.nextLine();
        names [2] = input.nextLine();
        names [3] = input.nextLine();
        names [4] = input.nextLine();
        names [5] = input.nextLine();
        names [6] = input.nextLine();
        names [7] = input.nextLine();
        names [8] = input.nextLine();
        names [9] = input.nextLine();
        for(int i=0; i<names.length; i++){
            System.out.println(names[i]);
        }

    }
}
