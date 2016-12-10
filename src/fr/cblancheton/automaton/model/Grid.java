package fr.cblancheton.automaton.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by charles on 12/10/16.
 */
public class Grid {
    private Cell cells[][];
    private final int width;
    private final int height;

    private int numGen;

    public Grid(int width, int height){
        this.width = width;
        this.height = height;

        this.numGen = 0;

        for(int i = 0; i < width; i++)
            for(int j = 0; j < height; j++)
                this.cells[i][j] = new Cell(i, j);
    }

    public Cell getCell(int x, int y){
        return this.cells[x][y];
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public List<Cell> getCells() {
        List<Cell> cells = new ArrayList<>();
        for(int i = 0; i < this.width; i++)
            for(int j = 0; j < this.height; j++)
                cells.add(this.cells[i][j]);
        return cells;
    }
}
