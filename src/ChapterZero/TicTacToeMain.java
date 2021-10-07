package ChapterZero;

import java.util.Scanner;

public class TicTacToeMain {
    static int playerMoves(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(prompt);
        return scanner.nextInt();
    }

    public static void main(String[] args) {
        WinnerBoard winnerBoard = new WinnerBoard();
        winnerBoard.winningPlayer();
    }

}
