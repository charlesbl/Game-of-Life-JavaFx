package fr.cblancheton.automaton.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by charles on 12/10/16.
 */
public class Cell {
    private int x;
    private int y;

    private Grid grid;

    private State state;
    private State newState;

    public Cell(Grid grid, int x, int y) {
        this.grid = grid;
        this.x = x;
        this.y = y;
        this.state = State.DEAD;
        this.newState = null;
    }

    public State processNewState(){
        int aliveCount = 0;

        for(Cell cell : this.getCellsAround()){
            if(cell.getState() == State.ALIVE)
                aliveCount++;
        }

        if(aliveCount > 3)
            this.newState = State.ALIVE;
        else
            this.newState = State.DEAD;

        return this.newState;
    }

    public State nextGen() throws IllegalStateException{
        if(this.newState == null)
            throw new IllegalStateException("New state not process");

        this.state = this.newState;
        this.newState = null;

        return this.state;
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

    public List<Cell>getCellsAround(){
        List<Cell> list = new ArrayList<>();
        list.add(this.getTopCell());
        list.add(this.getRightCell());
        list.add(this.getBottomCell());
        list.add(this.getLeftCell());
        return list;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public State getState() {
        return this.state;
    }

    public void setState(State state){
        this.state = state;
    }
}
