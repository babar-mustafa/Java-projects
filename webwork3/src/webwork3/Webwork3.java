/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webwork3;
import java.util.Scanner;
/**
 *
 * @author BABAR
 */
public class Webwork3 {

    /**
     * 
     * 
     * Write a program called PrintNumberInWord which prints "ONE", "TWO",... , "NINE", "OTHER" 
     * if the int variable "number" is 1, 2,... , 9, or other, respectively. Use (a) a "nested-if" 
     * statement; (b) a "switch-case" statement.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        Scanner in = new Scanner(System.in);
        System.out.println("enter a number");
        num=in.nextInt();
        System.out.println("  you Enterd" +num);
        switch(num){
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
                case 3:
                System.out.println("THREE");
                break;
                    case 4:
                System.out.println("FOUR");
                break;
                        case 5:
                System.out.println("FIVE");
                break;
                        default:
                            System.out.println("invalid input");
  
  
  
  
        }
    }
    
}
