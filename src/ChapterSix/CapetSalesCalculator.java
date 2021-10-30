package ChapterSix;

//The width of a carpet
//        ranges from 11 to 20 ft with an increment of 1 ft. The length of a carpet ranges
//        from 5 to 25 ft with an increment of 5 ft. The unit price of a carpet is $19 per
//        square foot.

public class CapetSalesCalculator {
    public static void main(String[] args) {
        System.out.print("  5 10 15 20 25");
        System.out.print("\n\n");
        for(int length = 5; length < 25; length++){
            for(int width = 11; width < 20; width++){
                int price = length * width * 19;
                System.out.print(" " + price);
            }
            System.out.println("");
        }


    }

}
