package practice;

public class Example3 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int number = 0; number < numbers.length; number++) {
            int evenNumber = numbers[number];

            if (evenNumber % 2 == 0) {
                System.out.println(evenNumber * 2);
            }
        }
    }
}
