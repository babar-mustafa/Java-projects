/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg19getset;
import java.util.Scanner;
/**
 *
 * @author BABAR
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      NewClass t =new NewClass();
      t.name="babar";
      t.age=12;
      t.speak();
     int  hg= t.retir();
        System.out.println(hg);
        
        int hh =t.getAge();
        String hj=t.getName();
        System.out.println("My names is" +hj);
        System.out.println("My age is"+hh);
    }
    
}
