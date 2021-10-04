package ChapterZero;

public class Receipt {
    private int receiptId;
    private int quantity;
    private int price;

    public Receipt(int receiptId, int quantity, int price) {
        this.receiptId = receiptId;
        this.quantity = quantity;
        this.price = price;

    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity(){
        return quantity;
    }

    public double extendedPrice(){
        double extendedPrice = quantity * price;
        return extendedPrice;
    }











}
