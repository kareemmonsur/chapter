package ChapterFour;

public class CreditLimitCalculatorTest {
    public static void main(String[] args) {
        CreditLimitCalculator customer1 = new CreditLimitCalculator(5000, 1000, 200,5000);

        System.out.println("customer1 new balance is" + (customer1.getInitialBalance() - customer1.getCharges() - customer1.getCredits()));
    }

}
