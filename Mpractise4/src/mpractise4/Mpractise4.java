/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mpractise4;

/**
 *
 * @author BABAR
 */
public class Mpractise4 {

    /**
     * @param args the command line arguments
     * Create a class named “Politician” and assign it three variables “Name, Party and Authority” 
 * set the values and get them via Getter and Setter methods; Variables should be seen by the 
 * outside classes. (Hint: Weak Encapsulation)
     */
    public static void main(String[] args) {
       Politicion pn = new Politicion();
       pn.setName("Imran Khan");
       pn.setParty("PTI");
       pn.setAuthority("Chairmain");
        System.out.println("Politicion name is:" +pn.getName());
        System.out.println("Politicion pary is: " +pn.getParty());
        System.out.println("Politicion authprity is:" +pn.getAuthority());
    }
    
}
