/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pestingmethod;

/**
 *
 * @author Set
 */
public class Pestingmethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       OurNewClass obj = new OurNewClass();
       OurNewClass obj2 = new OurNewClass();
       int a2 = obj.b();
       obj2.message();
       System.out.println(a2);
    }
    
}
