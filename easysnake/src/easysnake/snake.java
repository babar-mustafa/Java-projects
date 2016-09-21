/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easysnake;

import java.util.LinkedList;
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
public class snake {
     LinkedList<Cell> snakePartList = new LinkedList<>();
    Cell head;

    public snake(Cell initPos) {
        head = initPos;
        snakePartList.add(head);
    
}
 public void grow() {
        snakePartList.add(head);
    }

    public void move(Cell nextCell) {
        Cell tail = snakePartList.removeLast();
        tail.type = Cell.CELL_TYPE_EMPTY;

        head = nextCell;
        snakePartList.addFirst(head);
    }

    public boolean checkCrash(Cell nextCell) {
        for (Cell cell : snakePartList) {
            if (cell == nextCell) {
                return true;
            }
        }

        return false;
    }
}
