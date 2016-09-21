/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package getset;

//public class hg{}
/**
 *
 * @author BABAR
 */
public class Getset {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       NewClass in = new NewClass();
       in.setName("lion");
       in.setAge(12);
        System.out.println("name is " +in.getName());
        System.out.println("age is "+in.getage());
        
    }
    
}
