package practice;

public class Triangles {

    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++){
            System.out.print(i);
            for(int a = 1; a<= i; a++){
                System.out.print("*");
            }
            System.out.println(i);
        }
    }
}
