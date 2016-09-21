/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mpractise2;

/**
 *
 * Create four classes using IS-A relationship: Names of classes should be Bird,
 * Pigeon, Sparrow, and Eagle, Class bird should be the parent of all other classes 
 * and all classes should have the same 
 * method name “Flying()”. Call Parent class method in any child class by using super keyword
 * @author BABAR
 */
public class Bird {
public void Flyaing(){
        System.out.println("Bird is flying");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pigeon pg = new Pigeon();
        pg.display();
        
        
    }
    
}
