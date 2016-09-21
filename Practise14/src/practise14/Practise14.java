/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practise14;
import java.util.Scanner;
/**
 *
 * @author BABAR
 */
public class Practise14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String test; // Input String test
        Scanner in =new Scanner(System.in);
        System.out.println("enter the string");
        test=in.nextLine();
String [] array=test.split(" "); // Splitting the whole string by a " " space

for(int i=0;i<array.length;i++)
   System.out.println(array[i]);  // Just Print  the array it
   }
    
}
