package practice;

public class AccountStatementTest {
    public static void main(String[] args) {
        AccountStatement firstAccount = new AccountStatement("Kareem", "kareem@yahoo.com","07070","857575775",0);
        firstAccount.depositMoney(10_000);
        firstAccount.withdrawMoney(7000);
        firstAccount.withdrawMoney(3100);
    }

}
