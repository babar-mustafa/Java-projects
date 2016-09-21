/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package serilizaion;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Babar PC
 */
public class Writing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Writing objects.....");
     Person pr1 = new Person(23,"ba");
    Person.setCount(5);
        System.out.println(pr1);
      
        
        try
        {
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("people.bin"));
            os.writeObject(pr1);
            
            
            os.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Writing.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (IOException E) {
            Logger.getLogger(Writing.class.getName()).log(Level.SEVERE, null, E);
        }
    
    }
    
}
