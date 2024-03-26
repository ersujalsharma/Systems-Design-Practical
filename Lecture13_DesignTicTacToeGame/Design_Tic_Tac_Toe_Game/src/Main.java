public class Main {
    public static void main(String[] args) {
        TicTacToeGame game = new TicTacToeGame();
        game.initializeGame(5);
        System.out.println("game winner is: " + game.startGame());
    }
}