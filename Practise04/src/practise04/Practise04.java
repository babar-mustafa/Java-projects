/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practise04;
import java.util.Scanner;
/**
 *
 * @author BABAR
 */
public class Practise04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int pEggs;
        int dozen;
        int gross;
        int overGross;
       Scanner in = new Scanner (System.in);
        System.out.println("ENter the number of eggs you have");
  pEggs=in.nextInt();
        System.out.println("Number of Eggs of dozen u have:"+pEggs);
        dozen=pEggs/12;
        System.out.println("number of dozens of egg "+dozen);
        gross=pEggs/144;
        System.out.println("Number of gross of dozens of egg" +gross);
        overGross=pEggs%144;
        System.out.println("Number of over gross eggs" +overGross);
    }
    
}
