package ChapterFour;
//(Credit Limit Calculator) Develop a Java application that determines whether any of several
//        department-store customers has exceeded the credit limit on a charge account. For each customer,
//        the following facts are available:
//        a) account number
//        b) balance at the beginning of the month = intial balance
//        c) total of all items charged by the customer this month = totalItem
//        d) total of all credits applied to the customer’s account this month = credit
//        e) allowed credit limit. = creditLimit

//beginning balance = intial balance, charges = amount to pay at the moment, credit = amount owed from prev balance + charges

//        The program should input all these facts as integers, calculate the new balance (= beginning balance
//        + charges – credits), display the new balance and determine whether the new balance exceeds the
//        customer’s credit limit. For those customers whose credit limit is exceeded, the program should dis-
//        play the message "Credit limit exceeded" .

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

