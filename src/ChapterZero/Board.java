//package ChapterZero;
//
//import java.util.Arrays;
//
//public class Board {
//    private static final int row = 3;
//    private static final int column = 3;
//    public static String[][] array = new String[row][column];
//
//
//    //    private static char[][] array = new char[row][column];
//    public Board(CellElement cellElement) {
//        for (String[] strings : array) {
//            Arrays.fill(strings, String.valueOf(cellElement));
//        }
//    }
//
//    public static void printOnBoard() {
//        System.out.println("_________");
//        for (int row = 0; row < array.length; row++) {
//            for (int column = 0; column < array[row].length; column++) {
//                if (column == array[row].length - 1) System.out.println(array[row][column]);
//                else System.out.print(array[row][column] + " | ");
//            }
//            System.out.println("_________");
//        }
//    }
//
//    public boolean boardIsFull() {
//        if (array[row - 1][column - 1] == "X" || array[row - 1][column - 1] == "O") {
//            return true;
//        }
//        return false;
//    }
//
//    public static String[][] getPlayArray() {
//        return array;
//    }
//
//    public static boolean isBoardFull(int row, int col) {
//        if (array[row - 1][col - 1] == "X" ||
//                array[row - 1][col - 1] == "O") {
//            return true;
//        }
//        return false;
//    }
//
//    public static void outOfBound() {
//        if (row > 3 || column > 3) throw new ArrayIndexOutOfBoundsException("Input can only be between 1 and 9");
//    }
//
//}
