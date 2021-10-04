package practice;

import java.math.BigDecimal;

public class Item {
    private String name;
    private BigDecimal price;
    private int quantity;
    BigDecimal totalItem;

    public Item(String name, BigDecimal price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public BigDecimal calTotalItem() {
        totalItem = price.multiply(BigDecimal.valueOf(quantity));
        return totalItem;
    }
    
    public String toString() {
        String details = name + " " + price + " " + quantity + " " + calTotalItem();
        return details;
        
    }



    
}
