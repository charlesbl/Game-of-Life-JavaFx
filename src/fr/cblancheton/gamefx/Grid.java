package fr.cblancheton.gamefx;

/**
 * Created by charles on 12/10/16.
 */
public class Grid {
    private Cell cell[][];
    private int width;
    private int height;

    private int numGen;

    public Grid(int width, int height){
        this.width = width;
        this.height = height;

        this.numGen = 0;

        for(int i = 0; i < width; i++)
            for(int j = 0; j < height; j++)
                this.cell[i][j] = new Cell(i, j);
    }

    public Cell getCell(int x, int y){
        return this.cell[x][y];
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
