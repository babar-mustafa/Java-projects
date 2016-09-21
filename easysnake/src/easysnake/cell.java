/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easysnake;

/**
 *
 * @author BABAR
 */
public class cell {
      final static int CELL_TYPE_EMPTY = 0, CELL_TYPE_FOOD = 10, CELL_TYPE_SNAKE_NODE = 20;
    final int row, col;
    int type;

    public cell(int row, int col) {
        this.row = row;
        this.col = col;
    }
    
}
