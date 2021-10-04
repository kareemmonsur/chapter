package ChapterZero;

public class Customer {
    private int customerId;
    private String customerName;
    private double wallet;
    private double cashPaid;


    public Customer(int customerId, String customerName) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.wallet = 30_000;
        this.cashPaid = 0.0;
    }

    public void setCashPaid(double cashPaid) {
        wallet -= cashPaid;
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getWallet() {
        return wallet;
    }

    public double getCashPaid() {
        return cashPaid;
    }
}
