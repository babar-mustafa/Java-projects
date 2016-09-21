/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mpractise4;

/**
 *
 * @author BABAR
 * Create a class named “Politician” and assign it three variables “Name, Party and Authority” 
 * set the values and get them via Getter and Setter methods; Variables should be seen by the 
 * outside classes. (Hint: Weak Encapsulation)
 */
public class Politicion {
    public String name;
    public String party;
    public String authority;
    
    public String getName(){
    return name;
    }
    public void setName(String name){
    this.name = name;
    }
    public String getParty(){
    return party;
    }
    public void setParty(String party){
    this.party =party;
    
    }
   public String getAuthority(){
   return authority;
   } 
   public void setAuthority(String authority){
   this.authority= authority;
   
   }
}
