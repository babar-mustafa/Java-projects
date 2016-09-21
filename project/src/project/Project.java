                                                                                //ABDUL-GHAFFAR KHAN               
package project;

import java.util.*;
import java.util.Scanner;
/**
 *
 * @author abdulghaffar
 */
public class Project {
      static  List<Integer> l=new ArrayList<Integer>(100);
      static List<String> s = new ArrayList<String>(100);
      static List<Double> t=new ArrayList<Double>(100);
      
      public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
     boolean y=true;  
     do{   
         System.out.println("Enter 1 to INSERT data:");
          System.out.println("Enter 2 to UPDATE data:");
           System.out.println("Enter 3 to SEARCH data:");
            System.out.println("Enter 4 to DELETE data:");
             System.out.println("Enter 5 to COUNT data:");
              System.out.println("Enter 6 to TRIVERSE data:");
              System.out.println("Enter 7 to EXIT:");
         System.out.println("ENTER YOUR CHOICE:");
         int choice=in.nextInt();
         switch(choice)
         {
            case 1:
                insert();
                break;
            case 2:
                update();
                break;
            case 3:
                search();
                break;
            case 4:
                delete();
                break;
            case 5:
                total();
                break;
            case 6:
                Triversing();
                break;
            case 7:
                toexit();
                break;
            default:
                System.out.println("bad input");
                break;
        }
        System.out.println("want to process more? y/n");
        String x=in.next();
        char ch=x.charAt(0); 
        if( ch=='n')
            y=false;
    }
    while(y!=false);
   
    }
    
    //********************* ****************************************************************ABDULGHAFFAR KHAN
      static public void insert(){
       
       
       Scanner in=new Scanner(System.in);
        
        boolean y=true;
       do{
            System.out.println("Student ID-No:");
            int num=in.nextInt();
            if(num==0)
                System.out.println("0 is not alowed");
            else
                l.add(num);
            
            System.out.println("Student Name:");
            String c=in.next();
           s.add(c);
           
           System.out.println("Enter CGPA:");
           Double g=in.nextDouble();
           t.add(g);
            
            
            System.out.println("want to insert more?y/n");
            String x=in.next();
            char ch=x.charAt(0);
            if( ch=='n')
                y=false;
         }
       while(y!=false); 
   }
   
  //*************************************************************************************
      static public void Triversing(){
       
       
       if(l.isEmpty())
           System.out.println("list is empty ");
       else
       {
           System.out.println("\tSTUDENTS INFORMATION SYSTEM");
           System.out.println("\t***************************");
            System.out.println("_________________________________________");
            System.out.println(" S-no\tRoll NO\t\tName\tCGPA ");
            System.out.println("_________________________________________");
            for(int i=0 ; i<l.size();i++)
                
                 System.out.println(""+i+"\t"+l.get(i)+"\t\t"+s.get(i)+"\t" +t.get(i));
       }
   }
   
   //********************************************************************************
      static public void search(){
       
       //List<Integer> I=new ArrayList<Integer>();
       System.out.println("Enter Student ID-no:");
       Scanner in=new Scanner(System.in);
       
       int num=in.nextInt();
          System.out.println("\tSTUDENTS INFORMATION SYSTEM");
           System.out.println("\t***************************");
            System.out.println("______________________________________________");
            System.out.println("S-no\tRoll NO\t\tName\tCGPA");
            System.out.println("______________________________________________");
            
       for(int i=0;i<l.size();i++){
           if(l.get(i)==num)
                   
            
           System.out.println(""+i+"\t"+l.get(i)+"\t\t"+s.get(i)+"\t"+t.get(i));
       }
         
       if(l.lastIndexOf(num)==-1)
               System.out.println(num+" is NOT PRESENT");
   }

   //*****************************************************************************
      static public void update(){
       
       
       Scanner in=new Scanner(System.in);
       int num1,num2;
              double z;
       String x;
       System.out.println("Student ID-NO:");
       num2=in.nextInt();
          System.out.println("Student Name:");
          x=in.next();
          System.out.println("Student CGPA:");
          z=in.nextInt();
       if(num2==0)
             System.out.println("0 is not alowed");
       else{
             try{
                System.out.println("Enter position you want to edit");
                num1=in.nextInt();
                l.set(num1, num2);
                s.set(num1, x);
                t.set(num1, z);
             }catch(IndexOutOfBoundsException e){
                    System.err.println("caught IndexOutOfBoundsException: specified position is empty "+e.getMessage());
               }
       
          }
   }
   
   
    //************************************************************************************************8
      static public void delete(){
        
        
        Scanner in=new Scanner(System.in);
        System.out.println("Enter position you want to delete");
        int c=in.nextInt();
        l.remove(c);
        s.remove(c);
        t.remove(c);
    }
    
    
     //***********************************************************************
      static public void total(){
        
        
        System.out.println("Total no. in list are "+ l.size());
    }
    
    //******************************************************************************ABDULGHAFFAR KHAN
      static public void toexit(){
        
        System.exit(0);
    }
}
