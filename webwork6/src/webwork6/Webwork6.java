/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webwork6;
import java.util.Scanner;
/**
 *
 * @author BABAR
 * Write a program called KeyboardScanner to prompt user for an int, a double,
 * and a String. The output shall look like (the inputs are shown in bold):
Enter an integer: 12
Enter a floating point number: 33.44
Enter your name: Peter
Hi! Peter, the sum of 12 and 33.44 is 45.44
 */
public class Webwork6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int integer;
        double db;
        String s;
        double fin;
       Scanner in = new Scanner(System.in);
        System.out.println("Enter the integer");
        integer =in.nextInt();
        System.out.println("Enter the floating point value");
       db =in.nextFloat();
       System.out.println("Enter the name");
        s =in.next();
        fin=integer+db;
        System.out.println("hi"+s+ "the sum of"+integer+ "and " +db+ "is"+fin);
        


    }
    
}
