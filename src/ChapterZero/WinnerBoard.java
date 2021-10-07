package ChapterZero;

import static ChapterZero.CellElement.EMPTY;
import static ChapterZero.Players.PLAYER1;
import static ChapterZero.Players.PLAYER2;

public class WinnerBoard {
    static TikTakToe ticTakToe = new TikTakToe();
    static Board board = new Board(EMPTY);
    static String[][] playBoard = board.getPlayArray();
    static boolean playGame = GameWinner.isWon(playBoard);
    static Players player = PLAYER1;

    public static Players getPlayers(Players player) {
        if (player == PLAYER1) {
            player = PLAYER2;
        } else {
            player = PLAYER1;
        }
        return player;
    }

    public void winningPlayer(){
        String gamePlayer = "";

        while (!playGame) {
            player = WinnerBoard.getPlayers(player);
            if (player == PLAYER1) gamePlayer = "Player 1";
            else
            if (player == PLAYER2) gamePlayer = "Player 2";

            ticTakToe.currentPlayerMoves(player, TicTacToeMain.playerMoves(gamePlayer));
            playGame = GameWinner.isWon(playBoard);
            board.printOnBoard();
        }
        System.out.println(gamePlayer + " IS THE WINNER OF THE GAME!");
    }
}
