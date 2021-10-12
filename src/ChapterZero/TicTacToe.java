//package ChapterZero;
//
//import static ticTakToe.Players.*;
//import static ticTakToe.CellElement.*;
//
//public class TicTacToe {
//    private CellElement cellElement = EMPTY;
//    private Board board = new Board(cellElement);
//    private Players players = PLAYER2;
//    private String[][] playArray = board.getPlayArray();
//
//    public String[][] getPlayArray() {
//        return playArray;
//    }
//
//    public CellElement getCellElement() {
//        return cellElement;
//    }
//
//    public Players getPlayers() {
//        return players;
//    }
//
//    public void currentPlayerMoves(Players player, int position) {
////        player = getPlayers();
//        if (player == PLAYER1) setPosition(position, X);
//        else
//        if (player == PLAYER2) setPosition(position, O);
//    }
//
//    public void play() {
//        if (cellElement != EMPTY){
//            System.out.println("Player has to play in an empty cell");
//        }
//    }
//
//    public void setPlayer(Players player) {
//        this.players = player;
//    }
//
//    public String[][] getArray() {
//        return Board.array;
//    }
//
//    public void turnUserInputToBoardPosition(int position, CellElement board) {
//        switch (position){
//            case 1 -> playArray[0][0] = String.valueOf(board);
//            case 2 -> playArray[0][1] = String.valueOf(board);
//            case 3 -> playArray[0][2] = String.valueOf(board);
//            case 4 -> playArray[1][0] = String.valueOf(board);
//            case 5 -> playArray[1][1] = String.valueOf(board);
//            case 6 -> playArray[1][2] = String.valueOf(board);
//            case 7 -> playArray[2][0] = String.valueOf(board);
//            case 8 -> playArray[2][1] = String.valueOf(board);
//            case 9 -> playArray[2][2] = String.valueOf(board);
//        }
//    }
//    //
//    public void setPosition(int position, CellElement board){
//        for (int row = 0; row < playArray.length; row++) {
//            for (int column = 0; column < playArray[row].length; column++) {
//                turnUserInputToBoardPosition(position, board);
//            }
//        }
//    }
//
//
//}
