/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg16marray;

/**
 *
 * @author BABAR
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int[][] gfy={
        {10,20,30},
        {40,50},
        {60,70,80,90}
    };  
    System.out.println(gfy[0][1]);
    int[][] pk;
    pk=new int[2][3];
    pk [1][2]=56;
        System.out.println(pk [1][2]);
        for(int row=0;row<gfy.length;row++){
        for(int col=0;col<gfy[row].length;col++){
            System.out.println(gfy[row][col] + "\t");
        }
        }
        String[][] lok=new String[2][3];
        lok [0][2]="hello there";
        System.out.println(lok[0][2]);
        
        String[][] ja=new String[2][];
        ja[0]=new String[3];
        ja[0][2]="the boss";
        System.out.println(ja [0][2]);
}
}