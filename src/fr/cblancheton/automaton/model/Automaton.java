package fr.cblancheton.automaton.model;

/**
 * Created by charles on 12/10/16.
 */
public class Automaton {
    private Grid grid;

    public Automaton(){
        this.grid = new Grid(10, 10);
    }

    public void nextGeneration(){
        this.grid.getCells().stream().forEach(cell -> cell.processNewState());
        this.grid.getCells().stream().forEach(cell -> {
            try{
                cell.nextGen();
            }catch (IllegalStateException e){
                e.printStackTrace();
            }
        });
    }

    public Grid getGrid() {
        return this.grid;
    }
}
