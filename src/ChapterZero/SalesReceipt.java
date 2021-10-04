package ChapterZero;

import java.util.Date;

public class SalesReceipt extends Cart{
private double amountPaid=0.0;
private Date paymentDate;
private double totalAmount=0.0;
private double change=0.0;
private double VAT=0.0;

    public SalesReceipt(String ownerName) {
        super(ownerName);
    }

    public void payment(){

        change = amountPaid - totalAmount;
}
public void confirmOrder(){
    if (change>=0.0){
        System.out.println("Payment successful: your order is confirmed");
    }else if(change<0.0){
        System.out.println("Payment failed: your order is not confirmed");
    }
}
public void calVAT(){
        VAT= 0.075 * totalAmount;

    }
public void printReceipt(){
    for (Product newProduct : getProductBought()){
        System.out.println("PRODUCT ID: " + newProduct.getProductId());
        System.out.println("PRODUCT NAME: " + newProduct.getProductName());
        System.out.println("PRODUCT PRICE: " + newProduct.getPrice());
        System.out.println("PRODUCT QUANTITY: " + newProduct.getQuantity());
        double total = newProduct.getPrice()* newProduct.getQuantity();
        System.out.println("TOTAL: " + total);
        totalAmount+=total;
        VAT= 0.075 * totalAmount;
        System.out.println("VAT: " + VAT);
        System.out.println();
    }
    System.out.println("NET TOTAL: " + totalAmount);
}






























//    private int receiptId;
//    private int quantity;
//    private double price;
//
//    public SalesReceipt(int receiptId) {
//        this.receiptId = receiptId;
//        this.quantity = quantity;
//        this.price = price;
//    }
//
//    public void extendedPrice(double extendedPrice){
//     extendedPrice = price * quantity;
//
//    }
//
//    public int getReceiptId() {
//        return receiptId;
//    }
//
//    public void setReceiptId(int receiptId) {
//        this.receiptId = receiptId;
//    }
//
//    public int getQuantity() {
//        return quantity;
//    }
//
//    public void setQuantity(int quantity) {
//        this.quantity = quantity;
//    }
//
//    public double getPrice() {
//        return price;
//    }
//
//    public void setPrice(double price) {
//        this.price = price;
//    }




}
