/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webwork5;
import java.util.Scanner;
/**
 *
 * @author BABAR
 * Now the program presents an integer that is only minimally larger than the integer written by
the user of the program. Modify the program so that it outputs an integer that is twice as large
as the integer typed by the user. (Here you should also invent a better name for the variable
one_larger_integer. The character * is the multiplication operator in Java.)
 */
public class Webwork5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1;
        int large;
        int twice;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        num1=in.nextInt();
        System.out.println("You enterd " +num1);
        large =num1+1;
        System.out.println("Larger number as compared to you enterd is "+large);
        twice=large+large;
        System.out.println("so the twice number is:"+twice);
    }
    
}
