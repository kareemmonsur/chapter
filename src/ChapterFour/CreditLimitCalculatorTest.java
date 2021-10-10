package ChapterFour;

public class CreditLimitCalculatorTest {
    public static void main(String[] args) {
        CreditLimitCalculator customer1 = new CreditLimitCalculator(5000, 1000, 200,5000);
        int newBalance = (customer1.getInitialBalance() - customer1.getCharges() - customer1.getCredits());
        if (newBalance > 0) {
            System.out.println("customer1 new balance is " + newBalance);
        }
        else{
            System.out.println("Error, try again!");
        }
        if (newBalance < customer1.getCreditLimit()) {
            System.out.println("customer1 creditLimit is " + customer1.getCreditLimit());
        }
        else{
            System.out.println("Credit limit exceeded");
        }


    }


}
