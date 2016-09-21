 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creatingandwritingtextfiles;
import java.io.File;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author BABAR
 */
public class Creatingandwritingtextfiles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //through file writer
      
        File f1 = new File("tady.txt");
       
      
            
             
        
              try (BufferedWriter bw = new BufferedWriter(new FileWriter(f1))){
            bw.write("this is first line");
            bw.newLine();
            bw.write("this is second line");
            bw.newLine();
            bw.write("this is third line line");
            bw.newLine();
            
        } catch (IOException ex) {
                  System.out.println("unable to read file" +f1.toString());
        }
    }
    
}

/* 
FileWriter writer;
        try {
            writer = new FileWriter("MyFile45.txt", true);
             writer.write("Hello World");
            writer.write("\r\n");   // write new line
            writer.write("Good Bye!");
            writer.close();
        
        } catch (IOException ex) {
            Logger.getLogger(Creatingandwritingtextfiles.class.getName()).log(Level.SEVERE, null, ex);
        }
*/