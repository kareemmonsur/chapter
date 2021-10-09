//package ChapterZero;
//
//import java.util.Scanner;
//
//public class CreditCard {
//    private String cardNumber;
//
//    public CreditCard() {
//    }
//
//    public void setCardNumberMinAndMaxDigits(String cardNumber) {
//        if(cardNumber.length()>12 || cardNumber.length()<17)
//        this.cardNumber = cardNumber;
//    }
//
//    char num1 = cardNumber.charAt(0);
//        char num2 = cardNumber.charAt(1);
//        char num3 = cardNumber.charAt(2);
//        char num4 = cardNumber.charAt(3);
//        char num5 = cardNumber.charAt(4);
//        char num6 = cardNumber.charAt(5);
//        char num7 = cardNumber.charAt(6);
//        char num8 = cardNumber.charAt(7);
//        char num9 = cardNumber.charAt(8);
//        char num10 = cardNumber.charAt(9);
//        char num11 = cardNumber.charAt(10);
//        char num12 = cardNumber.charAt(11);
//        char num13 = cardNumber.charAt(12);
//
//        int numb12 = num12 * 2;
//        int numb10 = num10 * 2;
//        int numb8 = num8 * 2;
//        int numb6 = num6 * 2;
//        int numb4 = num4 * 2;
//        int numb2 = num2 * 2;
//        int even = (numb2 + numb4 + numb6 + numb8 + numb10 + numb12);
//
//        int odd = (num1 + num3 + num5 + num7 + num9 + num11 + num13);
//
//        int sum = even + odd;
//        if(sum % 10 == 0){
//            System.out.println("card is valid");
//        }
//        else {
//            System.out.println("card is invalid");
//        }
//    }
//
