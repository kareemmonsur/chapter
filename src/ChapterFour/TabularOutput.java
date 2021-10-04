package ChapterFour;

public class TabularOutput {
    public static void main(String[] args) {
        System.out.println("N" + " " + "N*10" + " " + "N*100" + " " + "N*1000");

        for (int number= 1; number<=5; number++){
            int unit= number*1;
            int tens= number*10;
            int hundred= number*100;
            int thousand= number*1000;

            System.out.println(unit + " " + tens + " "+ hundred + " " + thousand);

            }
        System.out.println();

        }

    }

