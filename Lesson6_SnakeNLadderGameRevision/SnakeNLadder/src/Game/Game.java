package Game;

import Board.Board;
import Cell.Cell;
import Dice.Dice;
import Player.Player;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class Game {
    Board board;
    Dice dice;
    Queue<Player> playerList = new ArrayDeque<>();
    Player winner = null;
    public Game(){
        initializeGame();
    }

    private void initializeGame() {
        board = new Board(10,5,4);
        dice = new Dice(1);
        winner = null;
        addPlayers();
    }

    private void addPlayers() {
        Player player1 = new Player("P1",0);
        Player player2 = new Player("P2",0);
        playerList.add(player1);
        playerList.add(player2);
    }
    public void startGame(){
        while(winner == null){
            Player playerturn = findPlayerTurn();
            System.out.println("Player turn is: "+playerturn.id+" current position is: "+playerturn.currentPos);
            int diceNumber = dice.rollDice();
            int playerNewPosition = playerturn.currentPos+diceNumber;
            playerNewPosition = jumpCheck(playerNewPosition);
            playerturn.currentPos = playerNewPosition;
            System.out.println("Player turn is:" +playerturn.id+" new Position is: "+playerNewPosition);
            if(playerNewPosition >= board.cells.length*board.cells.length-1){
                winner = playerturn;
            }
        }
        System.out.println("Winner is : "+winner.id);
    }

    private Player findPlayerTurn() {
        Player playerTurns = playerList.poll();
        playerList.add(playerTurns);
        return playerTurns;
    }
    public int jumpCheck(int playerNewPosition){
        if(playerNewPosition>board.cells.length*board.cells.length-1){
            return playerNewPosition;
        }
        Cell cell = board.getCell(playerNewPosition);
        if(cell.jump!=null && cell.jump.start == playerNewPosition){
            String jumpBy = cell.jump.start < cell.jump.end ? "Ladder" :"Snake";
            System.out.println("Jump done by "+jumpBy);
            return cell.jump.end;
        }
        return playerNewPosition;
    }
}
