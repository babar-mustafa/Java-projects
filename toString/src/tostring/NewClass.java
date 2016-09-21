/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tostring;

/**
 *
 * @author BABAR
 */
public class NewClass {

    private String name;
    private int id;
    public String toString(){
    return name +":" +id;
    }
    public NewClass(String name,int id){
    this.name=name;
    this.id=id;
    }
}
