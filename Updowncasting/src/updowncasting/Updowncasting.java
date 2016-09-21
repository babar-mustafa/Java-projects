/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package updowncasting;

/**
 *
 * @author BABAR
 */
public class Updowncasting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        machine mac1 = new machine();
        Camera cam1 = new Camera();
        mac1.start();
        cam1.start();
        cam1.snap();
        //upcasting 
        machine mac2 = new Camera();
        mac2.start();
        machine mac3 =cam1;
        mac3.start();
        //downcasting 
        machine mac4 = new Camera();
       Camera cam2 = (Camera)mac4;
       cam2.snap();
       cam2.start();
    }
    
}
