package ChapterFour;

public class Kata {

    public int calculateFactorialOf(int i) {

        int number;
        int factorial = 1;
        for (number = 5; number != 0; number--) {
            factorial = factorial * number;

        }
        return factorial;

    }

    public int calculateCopies(int copies) {

        int totalPrice = 0;
        totalPrice = copies * 1500;
        if (copies > 4 && copies < 10) {
            totalPrice = copies * 1400;
        } else if (copies > 10 && copies < 30) {
            totalPrice = copies * 1200;
        } else if (copies > 30 && copies < 50) {
            totalPrice = copies * 1100;
        } else if (copies > 50 && copies < 100) {
            totalPrice = copies * 1000;
        } else if (copies > 100 && copies < 200) {
            totalPrice = copies * 900;
        } else if (copies > 200) {
            totalPrice = copies * 800;
        }
            return totalPrice;
        }


    }
