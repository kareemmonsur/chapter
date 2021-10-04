package practice;

import java.math.BigDecimal;
import java.util.Scanner;

public class CartTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Abeg who get this cart?");
        String ownerName = input.next();
        Cart cart = new Cart(ownerName);
        String response = "";
        do {
            //if(response.equalsIgnoreCase(""))
            System.out.println("Wetin dem buy?");
            String itemName = input.next();
            System.out.println("Na like how many?");
            int itemQuantity = input.nextInt();
            System.out.println("Na how much be each one?");
            BigDecimal itemPrice = input.nextBigDecimal();
            System.out.println("Wetin you wan buy again?");
            response = input.next();
            Item itemBought = new Item(itemName, itemPrice, itemQuantity);
            cart.addItemToCart(itemBought);
        }while (response.equalsIgnoreCase("yes"));

        System.out.println(cart);
    }
}
