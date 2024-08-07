package Game;

import pieces.PieceType;
import pieces.PieceX;
import pieces.PieceY;
import pieces.PlayingPiece;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class TicTacToe {
    Deque<Player> players;
    Board gameBoard;
    public void initializeGame(int size){
        players = new LinkedList<>();
        players.add(new Player("crossPlayer",new PieceX(PieceType.X)));
        players.add(new Player("noughtPlayer",new PieceY(PieceType.Y)));
        gameBoard = new Board(size);
    }
    public String startGame(){
        boolean noWinner = true;
        while(noWinner){
            Player playerTurn = players.removeFirst();
            gameBoard.printBoard();
            boolean freeSpace = gameBoard.gerFreeCells();
            if(!freeSpace){
                noWinner = false;
                continue;
            }
            System.out.println("Player:" + playerTurn.userName +" Enter row,column: ");
            Scanner inputScanner = new Scanner(System.in);
            String s = inputScanner.nextLine();
            String[] values = s.split(",");
            int inputRow = Integer.valueOf(values[0]);
            int inputColumn = Integer.valueOf(values[1]);

            //place the piece
            boolean pieceAddedSuccessfully = gameBoard.addPiece(inputRow,inputColumn, playerTurn.playingPiece);
            if(!pieceAddedSuccessfully) {
                //player can not insert the piece into this cell, player has to choose another cell
                System.out.println("Incorrect possition chosen, try again");
                players.addFirst(playerTurn);
                continue;
            }
            players.addLast(playerTurn);

            boolean winner = isThereWinner(inputRow, inputColumn, playerTurn.playingPiece.getPieceType());
            if(winner) {
                return playerTurn.userName;
            }
        }
        return "tie";
    }
    public boolean isThereWinner(int row, int column, PieceType pieceType) {

        boolean rowMatch = true;
        boolean columnMatch = true;
        boolean diagonalMatch = true;
        boolean antiDiagonalMatch = true;

        //need to check in row
        for(int i=0;i<gameBoard.size;i++) {

            if(gameBoard.playingPieces[row][i] == null || gameBoard.playingPieces[row][i].getPieceType() != pieceType) {
                rowMatch = false;
            }
        }

        //need to check in column
        for(int i=0;i<gameBoard.size;i++) {

            if(gameBoard.playingPieces[i][column] == null || gameBoard.playingPieces[i][column].getPieceType() != pieceType) {
                columnMatch = false;
            }
        }

        //need to check diagonals
        for(int i=0, j=0; i<gameBoard.size;i++,j++) {
            if (gameBoard.playingPieces[i][j] == null || gameBoard.playingPieces[i][j].getPieceType() != pieceType) {
                diagonalMatch = false;
            }
        }

        //need to check anti-diagonals
        for(int i=0, j=gameBoard.size-1; i<gameBoard.size;i++,j--) {
            if (gameBoard.playingPieces[i][j] == null || gameBoard.playingPieces[i][j].getPieceType() != pieceType) {
                antiDiagonalMatch = false;
            }
        }

        return rowMatch || columnMatch || diagonalMatch || antiDiagonalMatch;
    }
}
