/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practise;

/**
 *
 * @author BABAR
 */
public class Practise {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a=7;
        int b = 4;
        int c=MnFunction(a,b);
        System.out.println("min value is" +c);
        // TODO code application logic here
    }
    public static int MnFunction(int a,int b){
    int min;
    if(a>b)
        min = b;
    else
        min = a;
    return min;
        
        
        }
}
