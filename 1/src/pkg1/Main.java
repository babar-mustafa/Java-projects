/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1;

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
         int a,b,c;
         double p =22.7;
       Scanner in = new Scanner(System.in);
       System.out.println("enter ist number");
       a = in.nextInt();
       System.out.println("enter second number");
       b =in.nextInt();
        c=(int) (p*p-2*a*b+b*b);
       System.out.println("result is"+c);
        // TODO code application logic here
    }
    
}
