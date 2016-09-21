/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package minfunction;
import java.lang.*;
/**
 *
 * @author Set
 */
public class MinFunction {


    /**
     * @param args the command line arguments
     */
public static void main(String[] args){ 
    int a = 8;
int b = 2;
int c= MinFunction(a, b);
System.out.println("result is" +c);
}
  public static int MinFunction(int a , int b)
  {
    
      
            int min;
            if(a > b)
                min = b;
            else
                min = a;
            return min;
        }
    }
    


