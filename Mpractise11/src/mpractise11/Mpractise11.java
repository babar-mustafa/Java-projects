/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mpractise11;
import java.util.Scanner;
/**
 *
 * @author Babar PC
 */
public class Mpractise11 {

    /**
     * Make a program that will only accept 
     * “Vowels” in lower case and will repeat 
     * itself until it gets
        Vowels
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("enter the character");
        while(!sc.hasNext("[aeiou || AEIOU]")){
           System.out.println("not a vowel");
           sc.next();
       }
       String vowel =sc.next();
        System.out.println("got the vowel " +vowel);
    }
    
}
