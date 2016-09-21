/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author BABAR
 */
public class bike extends car{
//    public void start(){
//        System.out.println("bike is running");
//               }
  
    
    @Override
    public void start(){
        super.start(); //To change body of generated methods, choose Tools | Templates.
    }

    public void play() {
        System.out.println("boy is playing");
    }
    public void pia(){
        System.out.println("this is "+name);
    }
}
