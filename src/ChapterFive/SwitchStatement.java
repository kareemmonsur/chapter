package ChapterFive;
import java.util.Scanner;
public class SwitchStatement {
    public static void main(String... args) {
        String Menu = """
                1--> Create Account
                2--> Close Account
                3--> Borrow Loan
                press any key
                """;
        System.out.println(Menu);
        Scanner input = new Scanner(System.in);
        int response = input.nextInt();
        switch (response) {
            case 3:
                System.out.println("5 million approved");
                break;
            case 1:
                System.out.println("Account created");
                break;
            case 2:
                System.out.println("Account closed");
                break;
            default:
                System.out.println("Do the needful");
                main();

        }

    }
}
