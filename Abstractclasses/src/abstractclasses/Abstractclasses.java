/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractclasses;

/**
 *
 * @author BABAR
 */
public class Abstractclasses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Camera cam1 = new Camera();
             cam1.setId(5);
        
        Car car1 = new Car();
           car1.setId(6);
       
           car1.run();
        
       
        
    }
    
}
