package fr.cblancheton.gamefx;

/**
 * Created by charles on 12/10/16.
 */
public class Cell {
    private int x;
    private int y;

    private Grid grid;

    private State state;

    public Cell(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Cell getTopCell(){
        return this.grid.getCell(this.x, this.y + 1);
    }

    public Cell getBottomCell(){
        return this.grid.getCell(this.x, this.y - 1);
    }

    public Cell getRightCell(){
        return this.grid.getCell(this.x + 1, this.y);
    }

    public Cell getLeftCell(){
        return this.grid.getCell(this.x - 1, this.y);
    }
}
