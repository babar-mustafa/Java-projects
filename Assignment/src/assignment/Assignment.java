/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package assignment;
import java.util.Scanner;
/**
 *
 * @author Set
 */
public class Assignment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a;
      
        Scanner in= new Scanner(System.in);
        System.out.println("Enter any data type");
        a=in.nextInt();
        if(a <9)
 System.out.println("data type integer");
        else {
        //for(a=65; a<=90; a++)
System.out.println("data type long integer");
//        for(a=0; a<=9; a++);



        for(a=65; a<=90; a++){
        
                System.out.println("data type character");
        }
           
    }
    
}
}
