/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filereadingwithscanner;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
/**
 *
 * @author BABAR
 */
public class FilereadingwithScanner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException  {
        //String fileNAme = "C:\\Users\\BABAR\\Desktop\\New Text Document.txt";
       String fileNAme = "New Text Document.txt";
            File textFile = new File(fileNAme);
        Scanner in = new Scanner(textFile);
        int value = in.nextInt();
        System.out.println("integer value is "+value);
        in.nextLine();
        int count=2;
        while(in.hasNextLine()){
            String line=in.nextLine();
        System.out.println(count+ ":" +line);
        count++;
        }
   // in.close();
    }
    
}
