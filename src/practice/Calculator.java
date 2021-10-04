package practice;

public class Calculator {
    private boolean isOn;
    private int result;
    public Calculator(boolean isOn){
        this.isOn=isOn;

    }


    public boolean getIsOn() {
    return isOn;
    }

    public void powerButton() {
        if(isOn==false){
            isOn=true;
        }else{
            isOn=false;
        }

    }

    public void addition(int firstNumber, int secondNumber) {
        if(isOn==true){
            result = firstNumber + secondNumber;
        }


    }

    public int getSum() {
        return result;
    }

    public void subtract(int firstNumber, int secondNumber) {
        if(isOn==true){
            result = firstNumber - secondNumber;

        }
    }

    public int getMinus() {
        return result;
    }

    public void multiply(int firstNumber, int secondNumber) {
        if(isOn==true){
            result = firstNumber * secondNumber;
        }
    }

    public int getTimes() {
        return result;
    }

    public void divide(int firstNumber, int secondNumber) {
        if(isOn==true){
            result = firstNumber / secondNumber;
        }
    }

    public int getCut() {
        return result;
    }
}
