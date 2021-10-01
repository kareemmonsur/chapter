package practice;

public class Operator {
    private int sum;
    private int product;

    public void add(int numberOne, int numberTwo) {
        sum = numberOne + numberTwo;
    }

    public int getSum() {
        return sum;
    }


    public void multiply(int numberOne, int numberTwo) {
        product = numberOne * numberTwo;
    }
    public int getProduct() {
        return product;
    }

}
