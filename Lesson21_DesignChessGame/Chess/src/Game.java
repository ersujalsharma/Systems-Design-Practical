import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.Scanner;

public class Game {
    Board board;
    Deque<Player> players;
    String winner = null;
    public Game(){
        board = new Board(8);
        // assigning players
        Player player1 = new Player(1,Color.White);
        Player player2 = new Player(2,Color.Black);
        players = new ArrayDeque<>();
        players.add(player1);
        players.add(player2);
        // initilize Game -> Place the Pieces;
        initializeGame(board);
        // playGame
        startGame();
        System.out.println(winner);
    }
    Scanner scanner = new Scanner(System.in);
    private void startGame() {
        while (winner == null) {
            print(board.getCells());
            Player player = players.poll();
            System.out.println("Player " + player.getPlayerNumber() + "'s turn (" + player.getColor() + ")");

            // Choose a piece;
            System.out.println("Choose current piece row and col:");
            int row = scanner.nextInt();
            int col = scanner.nextInt();
            Piece piece = board.getCells()[row][col].getPiece();

            // Check if the piece belongs to the current player
            if (piece == null || piece.getColor() != player.getColor()) {
                System.out.println("Invalid piece selection. Choose a valid piece.");
                players.addFirst(player);
                continue;
            }

            // Choose a destination;
            System.out.println("Choose destination row and col:");
            int movingRow = scanner.nextInt();
            int movingCol = scanner.nextInt();

            // Perform the move
            if (piece.move(row, col, movingRow, movingCol)) {
                Cell destinationCell = board.getCells()[movingRow][movingCol];

                // Check if the destination cell is empty or contains an opponent's piece
                if (destinationCell == null || destinationCell.getPiece().getColor() != piece.getColor()) {
                    // Capture the piece if there's one at the destination
                    if (destinationCell != null && destinationCell.getPiece().getColor() != piece.getColor()) {
                        Piece otherPiece = destinationCell.getPiece();
                        if (otherPiece.getPieceType() == PieceType.King) {
                            winner = "Player " + player.getPlayerNumber() + " (" + player.getColor() + ") wins!";
                            break;
                        }
                        // Capture the opponent's piece
                        System.out.println("Captured " + otherPiece.getPieceType());
                    }

                    // Move the piece
                    board.getCells()[movingRow][movingCol] = new Cell(piece);
                    board.getCells()[row][col] = null;
                } else {
                    System.out.println("Invalid move. Destination occupied by your own piece.");
                    players.addFirst(player);
                    continue;
                }
            } else {
                System.out.println("Invalid move. Try again.");
                players.addFirst(player);
                continue;
            }

            players.add(player);
        }
    }


    private void initializeGame(Board board) {
        Cell cells[][] = board.getCells();
        Piece pawnWhite = new Piece(PieceType.Pawn,Color.White);
        Piece pawnBlack = new Piece(PieceType.Pawn,Color.Black);
        // 0 1 for white board.length-2, -1 for black
        // places pawns
        for(int j=0;j<cells.length;j++){
            // white
            cells[1][j] = new Cell(pawnWhite);
            // black
            cells[cells.length-2][j] = new Cell(pawnBlack);
        }
        Piece rookWhite = new Piece(PieceType.Rook,Color.White);
        Piece rookBlack = new Piece(PieceType.Rook,Color.Black);
        cells[0][0] = cells[0][cells.length-1] = new Cell(rookWhite);
        cells[cells.length-1][0] = cells[cells.length-1][cells.length-1] = new Cell(rookBlack);

        Piece knightWhite = new Piece(PieceType.Knight,Color.White);
        Piece knightBlack = new Piece(PieceType.Knight,Color.Black);
        cells[0][1] = cells[0][cells.length-2] = new Cell(knightWhite);
        cells[cells.length-1][1] = cells[cells.length-1][cells.length-2] = new Cell(knightBlack);

        Piece bishopWhite = new Piece(PieceType.Bishop,Color.White);
        Piece bishopBlack = new Piece(PieceType.Bishop,Color.Black);
        cells[0][2] = cells[0][cells.length-3] = new Cell(bishopWhite);
        cells[cells.length-1][2] = cells[cells.length-1][cells.length-3] = new Cell(bishopBlack);

        Piece queenWhite = new Piece(PieceType.Queen,Color.White);
        Piece queenBlack = new Piece(PieceType.Queen,Color.Black);
        cells[0][3] = new Cell(queenWhite);
        cells[cells.length-1][3] = new Cell(queenBlack);

        Piece kingWhite = new Piece(PieceType.King,Color.White);
        Piece kingBlack = new Piece(PieceType.King,Color.Black);
        cells[0][4] = new Cell(kingWhite);
        cells[cells.length-1][4] = new Cell(kingBlack);
        print(cells);
    }
    private void print(Cell[][] cells){
        for(int i=7;i>=0;i--){
            for(int j=0;j<8;j++){
                if(cells[i][j] == null) System.out.print("----------- | ");
                else System.out.print(cells[i][j].getPiece().getPieceType()+"-"+cells[i][j].getPiece().getColor() +" | ");
            }
            System.out.println();
        }
    }
}
