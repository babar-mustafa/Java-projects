/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package babar;
import java.util.Scanner;
/**
 *
 * @author Set
 */
public class Babar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 int a,b,c;
       
        Scanner in= new Scanner(System.in);
        System.out.println("Enter first number");
        a=in.nextInt();
        System.out.println("Enter second number");
        b=in.nextInt();
        c = a + b;
        System.out.println("sum is " +c);
    }
    
}
