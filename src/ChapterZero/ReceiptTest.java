package ChapterZero;

public class ReceiptTest {
    public static void main(String[] args) {
        Receipt milo = new Receipt(1,5,1000);
        Receipt peak = new Receipt(2, 2, 500);
        System.out.printf("%-6s%-6s%s%16s\n", "Items","Price", "Quantity", "Extended price");
        System.out.println("1.milo" + " " + milo.getPrice() + "     " + milo.getQuantity()+ "       " + milo.extendedPrice());
        System.out.println("1.peak" + " " + peak.getPrice() + "     " + peak.getQuantity()+ "       " + peak.extendedPrice());

    }

}
