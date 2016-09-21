/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg17.classes;

/**
 *
 * @author BABAR
 */
public class Classes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Hig in =new Hig();
        in.s="babar";
        in.age=17;
        System.out.println("name is: " +in.s);
        System.out.println("age is: " +in.age);
        in.speak();
        Hig in2 =new Hig();
        in2.s="ryan";
        in2.age=23;
        in2.speak();
        //System.out.println("name is: " +in.s);
       // System.out.println("age is: " +in.age);
    }
    
}
 class Hig {
  String s;
    int age;
    void speak(){
    System.out.println("My name is:"+s+" My age is:" +age+"years old");}
 }