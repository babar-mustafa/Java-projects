/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg23static;

/**
 *
 * @author BABAR
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("No of objects before:" +NewClass.count);
        NewClass in = new NewClass();
        NewClass in2 = new NewClass();
        NewClass in22 = new NewClass();
        System.out.println("No of objects after"+NewClass.count);
        in.name="bertie";
        in2.name="khan";
        //System.out.println(in.name);
        //System.out.println(in2.name);
        NewClass.description="ok h boss";
        System.out.println(NewClass.description);
         NewClass.shoeInfo();
        
        in.showtt();
        in2.showtt();
              
       
        System.out.println(Math.PI);
        System.out.println(NewClass.Number);
    
    
    }
    
    
}
