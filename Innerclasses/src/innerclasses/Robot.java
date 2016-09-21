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
public class Robot {
    private int id;
   
 public class Brain{
     
private void Think(){
    System.out.println("Brain use to think");
}    
    }

 static class Battery{
 public void charger(){
     System.out.println("battery is charging");
 }
 }
    public Robot(int id) {
        this.id = id;
    }
    final String name = "bobv";
    public void start(){
        System.out.println("Root " +id+ "is thinjking");
     class temp{
        public void doSomething(){
            System.out.println("id is:" +id);
            System.out.println("name is " +name);
        }
        }
    temp t = new temp();
      t.doSomething();
        Brain ber = new Brain();
        ber.Think();
    }
    
}
