/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mpractise3;

/**
 *
 * @author BABAR
 */
public class Mpractise3 {

    /**
     * Create a class named “EMPLOYEE” and assign it three variables “Work, Name and Salary”
     * set the values and get them via Getter and Setter methods; Variables should not be 
     * seen by the outside classes. (Hint: Encapsulation)

     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Employee emp =new Employee();
       emp.setName("ahemd");
       emp.setWork("professor");
       emp.setSalory(15000);
        System.out.println("Employee name is:" +emp.getName());
        System.out.println("Employee work is :" +emp.getWork());
        System.out.println("Employee Salory is " +emp.getSalory());
    }
    
}
