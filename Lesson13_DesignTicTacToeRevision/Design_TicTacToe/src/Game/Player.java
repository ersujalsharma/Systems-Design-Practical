package Game;

import pieces.PlayingPiece;

public class Player {
    String userName;
    PlayingPiece playingPiece;
    public Player(String userName,PlayingPiece playingPiece){
        this.userName = userName;
        this.playingPiece = playingPiece;
    }
}
