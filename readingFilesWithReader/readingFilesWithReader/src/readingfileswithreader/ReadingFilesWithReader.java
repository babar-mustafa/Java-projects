/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readingfileswithreader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;



/**
 *
 * @author BABAR
 */
public class ReadingFilesWithReader {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        File file1 = new File("New Text Document.txt");
       
        try {
            FileReader fr = new FileReader(file1);
             BufferedReader br = new BufferedReader(fr);
             String text = "";
             try{
             String line = br.readLine();
            
               while(line != null){
                  text += line;
                  line = br.readLine();
               }
                System.out.println(text);
            } catch (IOException ex) {
                          System.out.println("File does not existed");
            }
        } catch (FileNotFoundException ex) {
            System.out.println("file not found "+file1.toString());
        } 
    }
    
}
