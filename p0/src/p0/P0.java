/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p0;
import java.lang.*;
import java.util.Scanner;
/**
 *
 * @author BABAR
 */
public class P0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a,b,c;
       Scanner in = new Scanner(System.in);
       System.out.println("enter ist number");
       a = in.nextInt();
       System.out.println("enter second number");
       b =in.nextInt();
        c=a+b;
       System.out.println("result is"+c);
       // int c = MnFunction(a ,b);
        //System.out.println("minimum value is" +c);
        // TODO code application logic here
    }}
sysout
  /*  public static int MnFunction(int a,int b){
    int min;
    if
            (a>b)
        min =b;
    else
        min = a;
    return min;
    }
}
