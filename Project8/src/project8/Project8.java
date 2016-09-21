/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project8;
import java.util.Scanner;
/**
 *
 * @author BABAR
 */
public class Project8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int hexNum;
       Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        hexNum=in.nextInt();
        
        switch(hexNum){
            case 0:
                System.out.println("you entered 0");
                System.out.println("which is equal to 0 in hexadecimal");
                break;
            case 1:
                System.out.println("you entered 1");
                System.out.println("which is equal to 1 in hexadecimal");
                break;
            case 2:
                System.out.println("you entered 2");
                System.out.println("which is equal to 2 in hexadecimal");
                break;    
            case 3:
                System.out.println("you entered 3");
                System.out.println("which is equal to 3 in hexadecimal");
                break;   
            case 4:
                System.out.println("you entered 4");
                System.out.println("which is equal to 4 in hexadecimal");
                break;    
            case 5:
                System.out.println("you entered 5");
                System.out.println("which is equal to 5 in hexadecimal");
                break;
            case 6:
                System.out.println("you entered 6");
                System.out.println("which is equal to 6 in hexadecimal");
                break;
            case 7:
                System.out.println("you entered 7");
                System.out.println("which is equal to 7 in hexadecimal");
                break;
            case 8:
                System.out.println("you entered 8");
                System.out.println("which is equal to 8 in hexadecimal");
                break;
            case 9:
                System.out.println("you entered 1");
                System.out.println("which is equal to 1 in hexadecimal");
                break;
            case 'a' :
                System.out.println("you entered a");
                System.out.println("which is equal to 10 in hexadecimal");
                break; 
//            case 'A':
//                System.out.println("you entered a");
//                System.out.println("which is equal to 10 in hexadecimal");
//                break;
            case 'b':
                System.out.println("you entered b");
                System.out.println("which is equal to 11 in hexadecimal");
                break;    
            case 'B':
                System.out.println("you entered B");
                System.out.println("which is equal to 11 in hexadecimal");
                break;    
            case 'c':
                System.out.println("you entered c");
                System.out.println("which is equal to 12 in hexadecimal");
                break;    
            case 'C':
                System.out.println("you entered C");
                System.out.println("which is equal to 12 in hexadecimal");
                break;    
            case 'd':
                System.out.println("you entered d");
                System.out.println("which is equal to 13 in hexadecimal");
                break;    
            case 'D':
                System.out.println("you entered D");
                System.out.println("which is equal to 13 in hexadecimal");
                break;  
            case 'E':
                System.out.println("you entered E");
                System.out.println("which is equal to 14 in hexadecimal");
                break;    
            case 'e':
                System.out.println("you entered e");
                System.out.println("which is equal to 14 in hexadecimal");
                break;    
            case 'f':
                System.out.println("you entered f");
                System.out.println("which is equal to 15 in hexadecimal");
                break;    
            case 'F':
                System.out.println("you entered F");
                System.out.println("which is equal to 15 in hexadecimal");
                break;    
            default:
                System.out.println("invalid number ");
                System.out.println("-1");
    }
    }
    
}
