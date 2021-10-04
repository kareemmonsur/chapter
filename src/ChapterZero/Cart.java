package ChapterZero;

import java.util.ArrayList;
//import java.util.List;

public class Cart {
    private String ownerName;
    private ArrayList<Product> productBought = new ArrayList<>();

    public Cart(String ownerName) {
        this.ownerName = ownerName;
    }

    public void addToCart(Product newProduct){

        productBought.add(newProduct);
    }

    public void removeFromCart(Product boughtProduct){

        productBought.remove(boughtProduct);
    }

    public ArrayList<Product> getProductBought(){
        return productBought;
    }





}

