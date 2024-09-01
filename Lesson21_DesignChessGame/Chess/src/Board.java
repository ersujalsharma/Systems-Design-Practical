public class Board {
    private Cell[][] cells;
    public Board(int size){
        cells = new Cell[size][size];
    }

    public Cell[][] getCells() {
        return cells;
    }

    public void setCells(Cell[][] cells) {
        this.cells = cells;
    }
}
