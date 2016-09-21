/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package math.exception;
import java.util.*;
import java.util.Scanner;
import java.util.InputMismatchException;
/**
 *
 * @author lab1
 */
public class MathException {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in=new Scanner(System.in);
        System.out.println("enter integer");
        try{
            int number=in.nextInt();
        }
        catch(InputMismatchException as){
        
System.out.println("enter only integer number");
    }
    
    finally{
    System.out.println("Hello");
}
    }
}
