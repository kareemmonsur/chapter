 package Arithmetics;

public class Arithmetics {
    private int sum;

    public void add(int firstNumber, int secondNumber) {
        sum = firstNumber + secondNumber;
    }

    public int getAdd() {
        return sum;
    }

    private int subtract;

    public void subtract(int firstNumber, int secondNumber) {
        subtract = firstNumber - secondNumber;
    }

    public int getSubtract() {
        return subtract;
    }

    private int multiply;

    public void multiply(int firstNumber, int secondNumber) {
        multiply = firstNumber * secondNumber;
    }

    public int getMultiply() {
        return multiply;
    }

    private int divide;

    public void divide(int firstNumber, int secondNumber) {
        divide = firstNumber / secondNumber;
    }
    public int getDivide() {
        return divide;
    }

    private int mod;

    public int getMod() {
        return mod;
    }

    public void mod(int firstNumber, int secondNumber) {
        mod = firstNumber % secondNumber;
    }

    private int min;

    public void min(int firstNumber, int secondNumber) {
        if (firstNumber < secondNumber) {
            min = firstNumber;
        } else {
            min = secondNumber;
        }
    }
        public int getMin () {
            return min;
        }
        private int max;
        public void max ( int firstNumber, int secondNumber) {
            if (secondNumber > firstNumber) {
                max = secondNumber;
            } else {
                max = firstNumber;
            }
        }
        public int getMax () {
            return max;
        }
    }


