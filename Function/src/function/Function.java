/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package function;

/**
 *
 * @author Set
 */
public class Function {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int a = 18;
       int b = 56;
       fun (a, b);
    }
    public static void fun(int a, int b){
        int c;
        c = a;
        a = b;
        b = c;
      System.out.println("After replacing  "+a+" and" +b);
    }
}
