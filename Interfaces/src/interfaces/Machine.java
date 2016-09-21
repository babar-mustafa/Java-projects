/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author BABAR
 */
public class Machine implements Info{
   
    private int id = 7;
    public void start(){
        System.out.println("machine started");
   
   }
    public void showInfo(){
        System.out.println("Machine id id:" +id);
    }
}
