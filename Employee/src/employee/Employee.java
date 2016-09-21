/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package employee;

/**
 *
 * @author ms8
 */
public class Employee {

    private String name;
    private int salary;
    private boolean work;
    
    public Employee(){
    }
    
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getSalary(){
        return salary;
    }
    public void setSalary(int salary)
    {
        this.salary = salary;
    }
    
    public boolean getWork(){
        return work;
    }
    public void setWork(boolean work){
        this.work = work;
        }
     


   public static void main(String[] args) {
        //public static void main(String args[]){
        Employee emp = new Employee();
        
       emp.setName("sabah");
       emp.setSalary(10);
       emp.setWork(true);
       
       System.out.println("Employee name is " +emp.getName());
       System.out.println("Employee has a salary package of " +emp.getSalary()+ "k");
       System.out.println("This employee is new? : " +emp.getWork());
    
    }
}
    

