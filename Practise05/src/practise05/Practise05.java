/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practise05;
import java.util.Scanner;
/**
 *
 * @author BABAR
 */
public class Practise05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String fName;
        String lName;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your first name");
        fName=in.nextLine();
    System.out.println("Enter your last name");
    lName=in.nextLine();
        System.out.println("you enterd  name is: " +fName+ " " +lName);
        System.out.println("your first name is:"+fName+ "\nWhich has no of characters are " +fName.length());
        System.out.println("your last name is "+lName+ "\nWhich has no of characters are " +lName.length());
        System.out.println("your initials are:"+fName.charAt(0) + lName.charAt(0));
//    fName = in.subString(0);
    }
    
    
}
