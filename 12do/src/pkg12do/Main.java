/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg12do;
import java.util.Scanner;

/**
 *
 * @author BABAR
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int y;
        Scanner in=new Scanner(System.in);
        /*System.out.println("Enter the integer");
        y=in.nextInt();
        while(y!=5){
             System.out.println("Enter the integer");
        y=in.nextInt();*/
        do{
        System.out.println("Enter the integer");
        y=in.nextInt();
        }
        while(y!=5);
        System.out.println("Got 5!");
        
        }
    }
    

