/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polumarphism;

/**
 *
 * @author BABAR
 */
public class Polumarphism {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        plant pl = new plant();
        Tree tr = new Tree();
        plant pl2 = new Tree();
       // plant plan6 =Tree;
        pl.grow();
        tr.grow();
        pl2.grow();
        //doGrow(Tree);
    }
    public void doGrow(plant plant){
        System.out.println("");
    } 
}
