/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package overloadingexample;

/**
 *
 * @author Set
 */
public class OverloadingExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
int a = 10;
        int b = 90;
        double c = 9.76;
        double d = 6.5;
        int result1 = minFun (a, b);
        double result2 = minFun(c, d);
        System.out.println("integer minimum value is " +result1);
    System.out.println("double minimum value is " +result2);
    }
    public static int minFun(int n1,int n2){
    int min;
    if (n1>n2)
    min = n2;
    else
    min =n1;
    return min; 
}
public static double minFun(double n1,double n2){
    double min;
    if(n1>n2)
        min = n2;
    else
        min = n1;
    return min;
}
}