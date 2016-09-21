/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webwork2;
import java.util.Scanner;
/**
 *
 * @author BABAR
 */
public class Webwork2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        Scanner in = new Scanner(System.in);
      
        System.out.println("Enter the number ");
        num=in.nextInt();
       
        if(num % 2 == 0){
            System.out.println("its even number");
        }
        else{
            System.out.println("its odd number");
        } 
    }
    
}
