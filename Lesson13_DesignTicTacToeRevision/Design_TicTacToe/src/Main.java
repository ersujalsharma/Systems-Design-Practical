import Game.TicTacToe;

public class Main {
    public static void main(String[] args) {
        TicTacToe ticTacToe = new TicTacToe();
        ticTacToe.initializeGame(3);
        String winnerName = ticTacToe.startGame();
        System.out.println("Game Result is = "+winnerName);
    }
}