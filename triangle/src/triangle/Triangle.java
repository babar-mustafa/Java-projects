/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package triangle;

/**
 *
 * @author Set
 */
public class Triangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i,j,k;
        for(i=0; i<6; i++)
        {//Syste.out.println(" ");
         for(j=0; j<6-i; j++)
         {
             System.out.print(" ");
         }
         for(k=0; k<=i; k++)
        
        {
        System.out.print(" * ");
        }
        System.out.println(  );
    }
           
}
}







 

