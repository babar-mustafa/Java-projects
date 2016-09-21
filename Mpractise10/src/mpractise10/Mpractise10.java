/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mpractise10;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author BABAR
 */
public class Mpractise10 {

    /**
     * Create a directory in any drive of your system also 
     * check the directory is exists or not, in case if directory
     * doesn’t exists “the program should not be terminated abnormally” 
     * and alerts you via a message dialogue box, if directory exists then 
     * create a TestFile.txt, if file already exists the program should not
     * be terminated abnormally but alerts you
     * via message dialog box that the file is already exists.
     */
    public static void main(String[] args)  {
//creating a directory
//        boolean dirFlag = false;
//        File stockDir = new File("E:\\stockDir ");
//
//try {
//   dirFlag = stockDir.mkdir();
//} catch (SecurityException Se) {
//System.out.println("Error while creating directory in Java:" + Se);
//}
//
//if (dirFlag)
//  JOptionPane.showMessageDialog(null,"Directory were created");
//else
//   JOptionPane.showMessageDialog(null,"Directory was not created");
       File file = new File("D://TesFile3.txt");
        boolean fileCreated = false;
        try {
            fileCreated = file.createNewFile();
        } catch (IOException ioe) {
            JOptionPane.showMessageDialog(null,"Error while creating empty file:");
           
        }
 
        if (fileCreated) {
            JOptionPane.showMessageDialog(null,"Created empty file");
            
        } else {
            JOptionPane.showMessageDialog(null,"Creating empty file is failed ");
        }
         if(file.exists()){
         JOptionPane.showMessageDialog(null,"File already exists");
         }
         
    }
    
}
