package practice;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Cart {
    private String ownerName;
    private BigDecimal overallTotal;
    private ArrayList<Item> itemBought = new ArrayList<>();

    public Cart(String ownerName) {
        this.ownerName = ownerName;
    }

    public String toString(){
        String stringToBeReturned = "";
        for (Item item: itemBought) {
            stringToBeReturned = stringToBeReturned + item + "\n";
        }
        return stringToBeReturned ;
    }

    public BigDecimal calculateOverallTotal(){
        double OverallTotal=0;
        for (Item item: itemBought) {
            overallTotal= overallTotal.add(item.calTotalItem());
        }
        return overallTotal;

        }
    public void addItemToCart(Item item)
        {
        itemBought.add(item);
        }




    }


