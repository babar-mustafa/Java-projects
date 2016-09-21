/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webwork1;
import java.util.Scanner;
/**
 *
 * @author BABAR
 */
public class Webwork1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
         Scanner in = new Scanner(System.in);
         System.out.println("Enter the number ");
         num=in.nextInt();
         System.out.println("you Entered" +num);
         if(num<49){
             System.out.println("you were fail ");
         }
         else{
        System.out.println("you were pass");
    }
    }
    
}
