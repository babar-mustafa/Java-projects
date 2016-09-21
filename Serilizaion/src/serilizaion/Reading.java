/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package serilizaion;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Babar PC
 */
public class Reading {
    
    
    public static void main(String[] args) {
        System.out.println("reading object objects.....");
   
   try( FileInputStream fi = new FileInputStream("people.bin")){
   ObjectInputStream os = new    ObjectInputStream(fi);
   
   Person pr1 =(Person)os.readObject();
   Person pr2 =(Person)os.readObject();
   
   os.close();
   } 
   
   catch (FileNotFoundException ex) {
            Logger.getLogger(Reading.class.getName()).log(Level.SEVERE, null, ex);
        }
   catch (IOException E) {
            Logger.getLogger(Reading.class.getName()).log(Level.SEVERE, null, E);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Reading.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
