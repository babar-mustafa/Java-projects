/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enummmmtype;

/**
 *
 * @author BABAR
 */
public enum Animal {
    DOG("kutta"),CAT("billi"),MOUSE("choha");
    private String name;
    
    Animal(String name){
    this.name = name;
    
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Animal{" + "name=" + name + '}';
    }
    
}
