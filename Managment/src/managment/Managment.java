/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managment;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.BufferedReader;
import java.io.IOException;
/**
 *
 * @author BABAR
 */
public class Managment {

    /**
     * @param args the command line arguments
     */
    //@SuppressWarnings("empty-statement")
    @SuppressWarnings("ConvertToStringSwitch")
    public static void main(String[] args) {
               File fileofinfo = new File("info.txt");
//        
        int c;
      String exx;
        NewClass call=new NewClass();
       boolean menuRepeat=true;
       
        
       do{
        Scanner in = new Scanner(System.in);
         call.Menu();
            System.out.println("enter the number of menu items");
        c=in.nextInt();
        
        
        switch(c){
            case 1:
                System.out.println("You Were in \n 1.View Student Details"); 
          try {
            FileReader fr =new FileReader(fileofinfo);
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
            System.out.println("file not found "+fileofinfo.toString());
        } 
       
                
                  break;
            case 2:
                System.out.println("You Were in \n 2.Add New Student");  
                String [ ] add;
                add = new String[4];
                Scanner as = new Scanner(System.in);
                System.out.println("Enter Name Of Student:");
                add[0]=as.nextLine();
                System.out.println("Enter The E-mail :");
                add[1]=as.nextLine();
                System.out.println("Enter Number Of Student:");
                add[2]=as.nextLine();
                System.out.println("Enter Roll Number Of Student:");
                add[3]=as.nextLine();
                      System.out.println("You Enterd");
                      System.out.println("Name:" +add[0]);
                      System.out.println("E-mail:" +add[1]);
                      System.out.println("Number Of Student:" +add[2]);
                      System.out.println("Roll NO:" +add[3]);
                break;
                                case 3:
                System.out.println("You Were in \n 3. Delte Student Details");  
                break;
                    case 4:
                System.out.println("You Were in \n 4.Exit");  
                Scanner iu =new Scanner(System.in);
                        System.out.println("Are You Want to Exit Then Type Yes\n Other wise NO:");
                exx=iu.next();
                if("NO".equals(exx) || "no".equals(exx)){
                    break;
                }
                else if("yes".equals(exx) || "Yes".equals(exx)){
                    System.exit(0);
                }
                
              break;
                   default:
                       System.out.println("\t");
                       System.out.println("Warnning !!!!!!!!!!!!!!!!!!");
                       System.out.println("Menu not found!!!!!\n Again Enter Number Of Menu!");
        }
        
       }while(menuRepeat);
       
       
    }
}
        
        
        
    
        
        
                   
                    
        
        
        
      
        
        
        
        
        
        
    
    

        
        
        
        
        
        
        
        
        /*
// System.out.println(ba[0]);
               // System.out.println(ba[1]);
                //System.out.println(ba[2]);
               // System.out.println(ba[3]);
String[] s=new String[5];
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a menu word to enter to menu");
        s=in.nextInt();
        System.out.println("you were in " +s);
        String[] s;
       s=new String[5];
       s[0]="Menu";
       s[1]="1.View Student Details";
       s[2]="2.Add New Student";
       s[3]="3. Delte Student Details";
       s[4]="4.Exit";
        System.out.println(s[0]);
        System.out.println(s[1]);
        System.out.println(s[2]);
        System.out.println(s[3]);
        System.out.println(s[4]);
        Scanner in = new Scanner(System.in);
        s=in.nextInt();
        switch (s){
            case 1:
                System.out.println("View Student Details");
                break;
            case 2:
                System.out.println("Add New Student");
                break;
            case 3:
                System.out.println("Delte Student Details");
                break;
            case 4:
                System.out.println("Exit");
                break;
            default:
                System.out.println("Menu Not Availabe");
        }*/
    
    
    

