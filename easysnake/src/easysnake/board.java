/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easysnake;
import javafx.scene.control.Cell;
import java.applet.Applet;
import java.awt.Graphics;
import java.awt.*;
import java.awt.event.*;
import java.awt.Image.*;
import javax.swing.*;
/**
 *
 * @author BABAR
 */
public class board {
     final int ROW_COUNT, COL_COUNT;
    Cell[][] cells;

    public Board(int rowCount, int columnCount) {
        ROW_COUNT = rowCount;
        COL_COUNT = columnCount;

        cells = new Cell[ROW_COUNT][COL_COUNT];
        for (int row = 0; row < ROW_COUNT; row++) {
            for (int column = 0; column < COL_COUNT; column++) {
                cells[row][column] = new cell(row, column);
            }
        }
    
}
  public void generateFood() {
        int row = (int) (Math.random() * ROW_COUNT);
        int column = (int) (Math.random() * COL_COUNT);

        cells[row][column].type = Cell.CELL_TYPE_FOOD;
    }
}