/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project03;
import java.util.Scanner;
/**
 *
 * @author BABAR
 */
public class Project03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String userName;
       String capital;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name ");
        userName = in.nextLine();
        capital =userName.toUpperCase();
        System.out.println("you enterd:" +capital);
    }
    
}
