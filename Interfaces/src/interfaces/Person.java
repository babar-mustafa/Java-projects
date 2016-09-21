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
public class Person implements Info{
    
    private String name;
    public Person (String name){
    this.name=name;
    }
    public void greed(){
        System.out.println("hello there");   
        
    }
    public void showInfo(){
        System.out.println("Person name is:" +name);
    }

//    @Override
//    public void showInfo() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
}
