/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practise7;
import java.util.Scanner;
/**
 *
 * split[i]=Character.toUpperCase(split[i].charAt(0))+split[i].substring(1);
        s+=split[i]+" ";
 * @author BABAR
 */
public class Practise7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s;
Scanner in = new Scanner(System.in);
        System.out.println("Enter the string");
       s=in.nextLine();
    s = s.replaceAll("\\s+"," ");
    String[] split = s.split(" ");
    s="";
    for (int i = 0; i < split.length; i++) {
        split[i]=Character.toUpperCase(split[i].charAt(0))+split[i].substring(1);
        s+=split[i]+" ";
        System.out.println(split[i]);
    }
    System.out.println(s);
    }
}
