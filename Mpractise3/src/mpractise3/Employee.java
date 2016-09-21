/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
Create a class named “EMPLOYEE” and assign it three variables “Work, Name and Salary”
     * set the values and get them via Getter and Setter methods; Variables should not be 
     * seen by the outside classes. (Hint: Encapsulation)

 */
package mpractise3;

/**
 *
 * @author BABAR
 */
public class Employee {
    private String name;
    private String work;
    private int Salory;
    public String getName(){
    return name;
    }
    public void setName(String name){
    this.name=name;
    }
    public String getWork(){
    return work;
    }
    public void setWork(String work){
    this.work=work;
    }
    public int getSalory(){
    return Salory;
    }
    public void setSalory(int Salory){
    this.Salory=Salory;
    }
    
}
