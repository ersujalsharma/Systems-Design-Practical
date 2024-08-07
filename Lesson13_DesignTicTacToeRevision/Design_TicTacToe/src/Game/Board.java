package Game;

import pieces.PlayingPiece;

import java.util.ArrayList;
import java.util.List;

public class Board {
    int size;
    PlayingPiece[][] playingPieces;
    public Board(int size){
        this.size = size;
        playingPieces = new PlayingPiece[size][size];
    }
    public Boolean addPiece(int row,int col,PlayingPiece playingPiece){
        if(playingPieces[row][col]!=null){
            return false;
        }
        playingPieces[row][col] = playingPiece;
        return true;
    }
    public boolean gerFreeCells(){
        for(int i=0;i<playingPieces.length;i++){
            for(int j=0;j<playingPieces.length;j++){
                if(playingPieces[i][j]==null){
                    return true;
                }
            }
        }
        return false;
    }
    public void printBoard(){
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if(j==0){
                    System.out.print(i+" ");
                }
                if (playingPieces[i][j] != null) {
                    System.out.print(playingPieces[i][j].getPieceType() + "   ");
                } else {
                    System.out.print("    ");

                }
                System.out.print(" | ");
            }
            System.out.println();
        }
    }
}
