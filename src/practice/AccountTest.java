package practice;

import java.util.Scanner;
public class AccountTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter amount to be deposited");
        double amountDeposited = input.nextDouble();
        Account myAccount = new Account("ADE", 50);
        myAccount.setAmountDeposited(amountDeposited);
        System.out.println(myAccount.getBalance());

    }
}
