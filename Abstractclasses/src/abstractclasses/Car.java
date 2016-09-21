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
public class Car extends Machine {

    @Override
    public void start() {
        System.out.println("satrting camera");
    }

    @Override
    public void showstuff() {
        System.out.println("checking 1");
    }

    @Override
    public void shutdown() {
        System.out.println("checking 2");
    }
    
}
