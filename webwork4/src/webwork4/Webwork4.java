/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webwork4;

/**
 *
 * @author BABAR
 */
public class Webwork4 {

    /**
     * Write a program called SquareBoard that displays the following n×n (n=5) pattern using two nested for-loops.
# # # # #
# # # # #
# # # # #
# # # # #
# # # # #
* for other
* #  
# #  
# # #  
# # # #  
# # # # #  
*   int row;
        int col;
        for(row=1;row<=5;row++){
        for(col=1;col<=row;col++){
            System.out.print("# ");
        }
            System.out.println(" ");
        }
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int row;
        int col;
        for(row=1;row<=5;row++){
        for(col=1;col<=5;col++){
            System.out.print("# ");
            
        }
            System.out.println(" ");
        }
    }
    
}
