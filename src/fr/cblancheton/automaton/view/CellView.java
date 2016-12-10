package fr.cblancheton.automaton.view;

import fr.cblancheton.automaton.model.Cell;
import javafx.scene.shape.Rectangle;

/**
 * Created by charles on 12/10/16.
 */
public class CellView extends Rectangle{
    private final Cell cell;

    public CellView(Cell cell) {
        this.cell = cell;
        //TODO init rect
    }
}
