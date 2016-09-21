/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mpractise8;
import java.util.Scanner;
/**
 *
 * @author BABAR
 */
public class Mpractise8 {

    /**Make a program that will only accept positive 
     * integers and will repeat itself until it gets 
     * positive integers
     * 
     */
    public static void main(String[] args) {
Scanner in = new Scanner(System.in);
int num;
do{
        System.out.println("enter the number");
        num=in.nextInt();
         if(num<0){
            System.out.println("please write another number");
        System.out.println("The enterd number is not a positive integer");
}
       
        
    }
  while(num<0);
    System.out.println("got the positive integer");
    }
}