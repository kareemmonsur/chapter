package ChapterSix;

public class SumOfIntegerCalculator {
    private int firstNumber;
    private int secondNumber;
    private int sum;


    public SumOfIntegerCalculator(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public void addNumbers() {
        sum = firstNumber + secondNumber;
    }

    public int getSum() {
        return sum;
    }
}
