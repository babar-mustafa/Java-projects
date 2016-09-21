/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practise02;
//import java.util.Scanner;


/**
 *
 * @author BABAR
 */
public class Practise02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int die1;
       int die2;
            int roll;
//       Scanner in = new Scanner(System.in);
//        System.out.println("Enter the first number ");
//       die1=in.nextInt();
//        System.out.println("Enter the second number "); 
//        die2=in.nextInt();
       die1=(int)(Math.random()*6)+1;
       die2=(int)(Math.random()*6)+1;
       roll = die1 + die2;
        System.out.println("The first die is " +die1);
        System.out.println("The second die is " +die2);
        System.out.println("The first die is " +roll);
     
    }
    
}
