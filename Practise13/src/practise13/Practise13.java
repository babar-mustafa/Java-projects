/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practise13;
import java.util.Scanner;
/**
 *
 * @author BABAR
 */
public class Practise13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1;
        int num2;
        String sym;
        int ans;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number");
        num1=in.nextInt();
        if(num1==0){
            System.out.println("programe going to terminate");
            System.exit(0);
        }
        
           
        System.out.println("Enter the operator of operation which u want");
        sym=in.next();
        System.out.println("Enter the second number");
        num2=in.nextInt();
        System.out.println("you enterecd\n");
        System.out.println("first number"+num1+ "\noperator\t"+sym+ "\nsecond number is" +num2);
        switch(sym){
            case "+":
                ans=num1 + num2;
                System.out.println("addition result is "+ans);
                break;
            case "-":
                ans=num1-num2;
                System.out.println("subtraction result is"+ans);
                break;
                case"*":
                    ans=num1+num2;
                    System.out.println(",ultipication  result is "+ans);
                    break;
                case "/":
                     ans=num1/num2;
                     System.out.println("division  result is "+ans);
                     break;
                default:
                    System.out.println("not a walid operation");
             
        }
      
    }
    
}
