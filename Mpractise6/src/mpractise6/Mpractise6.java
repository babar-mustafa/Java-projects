/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mpractise6;
import java.io.File;
/**
 *
 * @author BABAR
 */
public class Mpractise6 {

    /**
     * Check if the file name TestFile.txt is existing in your system 
     * E: directory or not, if it exists rename it and then delete it after 
     * renaming it. Program should not be abnormally terminated if the directory 
     * does not exist.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //chechikng for exuxtant of file in E drive
//       File f = new File("E:\\Testfile.txt");
//       if(f.exists()){
//           System.out.println("File exists"+f.toString());
//       }
//       else{
//                System.out.println("File Does not exisits"+f.toString());
//       }
        //renaming of file
//        File f = new File("E:\\Testfile.txt");
//       if(f.exists()){
//       f.renameTo(new File("E:\\babar.txt"));
//           System.out.println("File has succesfully renamed...");
//       }
//       else{
//           System.out.println("File has not been renamed");
//       }
        //deletiom of file
        File f = new File("E:\\babar.txt");
    if(f.exists()){
    f.delete();
        System.out.println("file has deleted"+f.toString());
    }
    else{
        System.out.println("File has not deleted" +f.toString());
    }
    }
    
}
