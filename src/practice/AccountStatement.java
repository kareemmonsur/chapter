package practice;

import java.util.ArrayList;

public class AccountStatement {
    private String customerName;
    private String email;
    private String phoneNumber;
    private String accountNumber;
    private int balance=0;
    private ArrayList<Double> transactionAmount = new ArrayList<>();
    private ArrayList<String> transactionType = new ArrayList<>();
   // private int depositedMoney;


    public AccountStatement(String customerName, String email, String phoneNumber, String accountNumber, int balance) {
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void depositMoney(double depositedMoney){
        if (depositedMoney>0) {
            balance += depositedMoney;
            System.out.println("Deposit successful, your account balance is now: " + this.balance);
            transactionAmount.add(depositedMoney);
            transactionType.add("dep");
        }else{
            System.out.println("Invalid transaction, try again later");
        }
    }

    public void withdrawMoney(double withdrawnMoney){
        if (withdrawnMoney<=balance) {
            this.balance -= withdrawnMoney;
            System.out.println("Withdrawal successful, your account balance is now: " + this.balance);
            transactionAmount.add(withdrawnMoney);
            transactionType.add("withdrawal");
        }else{
            System.out.println("Invalid transaction, try again later");
        }
    }

    public void displayAccountStatement(){
        System.out.printf("%s, ");
    }


    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }


}
