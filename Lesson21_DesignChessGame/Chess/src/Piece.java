public class Piece {
    private PieceType pieceType;
    private Color color;
    public boolean move(int startX, int startY, int endX, int endY) {
        // Calculate the difference in positions
        int deltaX = endX - startX;
        int deltaY = endY - startY;

        switch (pieceType) {
            case Pawn:
                if (color == Color.White) {
                    // White pawns move one square forward
                    if (deltaX == 1 && deltaY == 0) {
                        return true;
                    } else {
                        return false;
                    }
                } else {
                    // Black pawns move one square forward
                    if (deltaX == -1 && deltaY == 0) {
                        return true;
                    } else {
                        return false;
                    }
                }

            case Rook:
                // Rooks move any number of squares along a row or column
                if (deltaX == 0 || deltaY == 0) {
                    return true;
                } else {
                    return false;
                }

            case Knight:
                // Knights move in an L shape: 2 squares in one direction and 1 in another
                if ((Math.abs(deltaX) == 2 && Math.abs(deltaY) == 1) ||
                        (Math.abs(deltaX) == 1 && Math.abs(deltaY) == 2)) {
                    return true;
                } else {
                    return false;
                }

            case Bishop:
                // Bishops move diagonally
                if (Math.abs(deltaX) == Math.abs(deltaY)) {
                    return true;
                } else {
                    return false;
                }

            case Queen:
                // Queens move like both a rook and a bishop
                if (deltaX == 0 || deltaY == 0 || Math.abs(deltaX) == Math.abs(deltaY)) {
                    return true;
                } else {
                    return false;
                }

            case King:
                // Kings move one square in any direction
                if (Math.abs(deltaX) <= 1 && Math.abs(deltaY) <= 1) {
                    return true;
                } else {
                    return false;
                }

            default:
                return false;
        }
    }
    public Piece(PieceType pieceType,Color color){
        this.pieceType = pieceType;
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public PieceType getPieceType() {
        return pieceType;
    }

    public void setPieceType(PieceType pieceType) {
        this.pieceType = pieceType;
    }
}
