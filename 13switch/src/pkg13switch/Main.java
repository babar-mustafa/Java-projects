/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg13switch;
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
        String s;
        Scanner in = new Scanner(System.in);
        System.out.println("enter the string");
        s=in.nextLine();
        System.out.println("you entered" +s);
        switch(s){
            case "my":
        System.out.println("starting word");
                break;
            case "name":
        System.out.println("mid word");
                break;
            case "khan":
        System.out.println("last word");
                break;
            default:
                System.out.println("default case");
        }
        
    }
    
}
