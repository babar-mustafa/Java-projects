/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equalsmethod;

/**
 *
 * @author BABAR
 */
public class Equalsmethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person p1 = new Person(2,"babar");
        Person p11 = new Person(4,"awan");
        
      //withh == work
        //System.out.println(p1 == p11);
        //with .equals method work
        System.out.println(p1.equals(p11));
        double a= 4.5;
        double b= 4.5;
        System.out.println(a == b);
        
        int c = 8;
        int d = 8;
        System.out.println(c == d);
        String st1 ="Hello";
        String st2 = "Hello ther".substring(0, 5);
        System.out.println(st2);
        System.out.println(st1 == st2);
               
    }
    }
    

