package fr.cblancheton.automaton.view;

import fr.cblancheton.automaton.model.Grid;
import javafx.scene.Group;

/**
 * Created by charles on 12/10/16.
 */
public class GridView extends Group{
    private final Grid grid;

    public GridView(Grid grid){
        this.grid = grid;
        //TODO init all cells
    }
}
