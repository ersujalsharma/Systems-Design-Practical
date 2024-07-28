package Board;

import Cell.Cell;
import SnakeNLadder.Jump;

import java.util.concurrent.ThreadLocalRandom;

public class Board {
    public Cell[][] cells;
    public Board(int boardLength,int noOfSnake,int noOfLadders){
        initialize(boardLength);
        addSnakesLadder(noOfSnake,noOfLadders);
    }

    public void initialize(int boardLength){
        cells = new Cell[boardLength][boardLength];
        for(int i=0;i<boardLength;i++){
            for(int j=0;j<boardLength;j++){
                cells[i][j] = new Cell();
            }
        }
    }

    private void addSnakesLadder(int noOfSnake, int noOfLadders) {
        while (noOfSnake-->0){
            int snakehead = ThreadLocalRandom.current().nextInt(1, cells.length* cells.length-1);
            int snakeTail = ThreadLocalRandom.current().nextInt(1, cells.length* cells.length-1);
            if(snakeTail>=snakehead){
                continue;
            }
            Jump snakeObj = new Jump();
            snakeObj.start = snakehead;
            snakeObj.end = snakeTail;
            Cell cell = getCell(snakehead);
            cell.jump = snakeObj;
        }
        while (noOfLadders-->0){
            int ladderhead = ThreadLocalRandom.current().nextInt(1, cells.length* cells.length-1);
            int ladderTail = ThreadLocalRandom.current().nextInt(1, cells.length* cells.length-1);
            if(ladderhead>=ladderTail){
                continue;
            }
            Jump ladderObj = new Jump();
            ladderObj.start = ladderhead;
            ladderObj.end = ladderTail;
            Cell cell = getCell(ladderhead);
            cell.jump = ladderObj;
        }
    }

    public Cell getCell(int playerPosition){
        int boardRow = playerPosition/cells.length;
        int boardCol = playerPosition% cells.length;
        return cells[boardRow][boardCol];
    }
}
