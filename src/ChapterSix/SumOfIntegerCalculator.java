package ChapterSix;

public class SumOfIntegerCalculator {
    private int firstNumber;
    private int secondNumber;
    private int sum;


    public SumOfIntegerCalculator(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public int getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public void addNumbers() {
        sum = firstNumber + secondNumber;
    }

    public int getSum() {
        return sum;
    }
}
