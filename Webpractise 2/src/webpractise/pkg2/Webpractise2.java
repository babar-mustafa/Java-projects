/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webpractise.pkg2;
import java.util.Scanner;
/**
 *
 * @author BABAR
 * Write a program with which you can convert a human height given in feet and inches to
centimeters. The program should ask the user to type in his or her height in two parts: first the
height in feet and then the inches part for the height. (A person can say that his or her height
is, for example, 5 feet and 9 inches. That would be 30.48 * 5 + 2.54 * 9 centimeters.
 */
public class Webpractise2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  int feet;
  double point;
  double total;
  double incm;
          Scanner in = new Scanner(System.in);
          System.out.println("enter height in feet first");
          feet=in.nextInt();
                    System.out.println("enter height in points now");
          point =in.nextFloat();
          total=feet+point;
          System.out.println("Your height in feet is "+total);
          incm=total*30.48;
          System.out.println("Your height in cm is "+incm);
    }
    
}
