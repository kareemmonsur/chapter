package ChapterZero;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//DB MOD 4
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is the owner's name: ");
        String ownerName = input.nextLine();
        Cart cart = new Cart(ownerName);


        //public void addToCart() {
        System.out.println("What did the" + " " + ownerName + "buy?");
        String productBought = input.nextLine();

        System.out.println("How much does the" + " " + productBought + "cost?");
        double price = input.nextDouble();

        System.out.println();
        double quantity = input.nextDouble();





//        System.out.println();
//        Product product = new Product();














    }
}

//        SalesReceipt cart = new SalesReceipt();
//
//        Product p1 = new Product();
//       p1.setProductId(1);
//       p1.setProductName("Milo");
//       p1.setPrice(1200.0);
//       p1.setQuantity(3);
//
//
//       cart.addToCart(p1);
//
//       cart.printReceipt();
//    }
//}
