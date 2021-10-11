package ChapterFour;

public class CreditLimitCalculator {
    private int initialBalance;
    private int charges;
    private int credits;
    private int accountNumber;
    private int creditLimit;


    public CreditLimitCalculator(int initialBalance, int charges, int credits, int creditLimit) {
        if (initialBalance > 0) {
            this.initialBalance = initialBalance;
        }
        if (charges > 0) {
            this.charges = charges;
        }
        if (credits > 0) {
            this.credits = credits;
        }
        if (creditLimit > 0) {
            this.creditLimit = creditLimit;
        }
    }

    public int getInitialBalance() {
        return initialBalance;
    }

    public int getCharges() {
        return charges;
    }

    public int getCredits() {
        return credits;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(int creditLimit) {
        this.creditLimit = creditLimit;
    }
}

