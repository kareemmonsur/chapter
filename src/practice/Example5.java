package practice;

public class Example5 {
    public static void main(String[] args) {
      // int[] myArray = new int[10];
        int[] myArray = {11,2,13,4,15,6,17,8,19};
        int total = 0;
        for (int i = 0; i < myArray.length; i++){
            total += myArray[i];
        }
        System.out.println("total is " + total);
        System.out.println("average is " + total/9);
    }
}
