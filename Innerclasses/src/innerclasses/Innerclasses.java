/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package innerclasses;

/**
 *
 * @author BABAR
 */
public class Innerclasses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Robot rob = new Robot(7);
        rob.start();
       
        Robot.Battery batery = new Robot.Battery();
        batery.charger();
                
    }
    
}
