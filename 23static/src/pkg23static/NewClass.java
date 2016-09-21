/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg23static;

/**
 *
 * @author BABAR
 */
public class NewClass {
    public final static int Number=9; 
   public String name;
   public static String description;
   public void showtt(){
       System.out.println("id is:" +id + "Name is"+name);
   }
   public static void shoeInfo(){
       System.out.println("hello");
   }
   public static int count =0;
   public int id;
   public NewClass(){
       id=count;
   count++;
   }
}
