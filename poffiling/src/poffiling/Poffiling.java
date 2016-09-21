/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poffiling;
import java.io.File;
/**
 *
 * @author BABAR
 */
public class Poffiling {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(System.getProperty("user.home"));
        File f = new File("C:\\Users\\BABAR\\Desktop\\fff.txt");
        if(f.exists()){
            f.renameTo(new File("C:\\Users\\BABAR\\Desktop\\bbb.txt"));
            System.out.println(f.getName() +"file name has been update ");
}
        else{
            System.out.println(f.getName() +"file name has not been updated");
}
    }
        
}
/*
for finding directory
 System.out.println(System.getProperty("user.home"));
        File f = new File("C:\\Users\\BABAR\\Desktop\\fff.txt");
        if(f.exists()){
            System.out.println(f.getName() +"file exit ");
}
        else{
            System.out.println(f.getName() +"file not exist");
}
*/
/*
for deleting
System.out.println(System.getProperty("user.home"));
        File f = new File("C:\\Users\\BABAR\\Desktop\\fff.txt");
        if(f.exists()){
            f.delete();
            System.out.println(f.getName() +"file has been deletd ");
}
*/