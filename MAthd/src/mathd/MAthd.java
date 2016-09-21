/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mathd;
import java.util.Scanner;

/**
 *
 * @author Set
 */
public class MAthd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int a,b, result=0;
       char c;
        Scanner in= new Scanner(System.in);
        System.out.println("Enter first number");
        a=in.nextInt();
        System.out.println("Enter second number");
        b=in.nextInt();
        String st= in.next();
        c= st.charAt(0);
        switch(c)
        {
            case'+':
                result=a+b;
                System.out.println("add" +result);
                break;
                case'-':
                result=a-b;
                System.out.println( +result);
                break;
                    case'*':
                result=a*b;
                System.out.println( +result);
                break;
                        case'/':
                result=a/b;
                System.out.println( +result);
                break;
        }
     //           Default;
       //                     System.out.println("Syntax error");
        
    
    }
      
               
    
    

