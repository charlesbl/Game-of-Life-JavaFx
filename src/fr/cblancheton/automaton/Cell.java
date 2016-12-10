package fr.cblancheton.automaton;

/**
 * Created by charles on 12/10/16.
 */
public class Cell {
    private int x;
    private int y;

    private Grid grid;

    private State state;
    private State newState;

    public Cell(int x, int y) {
        this.x = x;
        this.y = y;
        this.state = State.ALIVE;
        this.newState = null;
    }

    public void processNewState(){
        //TODO
        this.newState = State.DEAD;
    }

    public void nextGen() throws IllegalStateException{
        if(this.newState == null)
            throw new IllegalStateException("New state not process");

        this.state = this.newState;
        this.newState = null;
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
