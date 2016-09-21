/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webwork7;
import java.*;
import java.util.Scanner;
/**
 *
 * @author BABAR
 * 
 * Write a program called ReverseString, 
 * which prompts user for a String, and prints the reverse of the String.
 * The output shall look like:
Enter a String: abcdef
The reverse of String "abcdef" is "fedcba".
 */
public class Webwork7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //ist method
        String string;
         Scanner in = new Scanner(System.in);
 
      System.out.println("Enter a string to reverse");
      string = in.nextLine();
       
      String reverse = new StringBuffer(string).
      reverse().toString();
        System.out.println("before reverse" +string);
        System.out.println("after reverse" +reverse);
        ////second method
//      System.out.println("\nString before reverse:
//      "+string);
//      System.out.println("String after reverse:
//      "+reverse);"
     
//        String original, reverse = "";
//      Scanner in = new Scanner(System.in);
// 
//      System.out.println("Enter a string to reverse");
//      original = in.nextLine();
// 
//      int length = original.length();
// 
//      for ( int i = length - 1 ; i >= 0 ; i-- )
//         reverse = reverse + original.charAt(i);
// 
//      System.out.println("Reverse of entered string is: "+reverse);
        
    }
    
}
