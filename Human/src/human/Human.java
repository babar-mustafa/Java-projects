
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package human;

/**
 *
 * @author Set
 */
public class Human {

        public Human(String name)
{
    System.out.println("Human.age is" +name);
    
}
        public Human(int age){
         System.out.println("Human.name is" +age);
        }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Human my= new Human(10);
    Human my1= new Human("amir");
    }
    
}
