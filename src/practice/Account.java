package practice;

public class Account {
    private String name;
    private double balance;

    public Account(String name, double balance) {
        this.name = name;
        if (balance > 0) {
            this.balance = balance;
        }
    }

    public void setAmountDeposited(double amountDeposited) {
        if (amountDeposited > 0) {
            balance = balance + amountDeposited;
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}


