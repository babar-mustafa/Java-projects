/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generics;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.util.Map;
import java.util.Iterator;
/**
 *
 * @author BABAR
 */
public class Generics {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // old way
        ArrayList al = new ArrayList();
        al.add("cat");
        al.add("dog");
        String animal =(String)al.get(0);
        System.out.println(animal);
        //new way
        ArrayList<String> al2 = new ArrayList<>();
        al2.add("hi");
        al2.add("hello");
      
        String animal2 =al2.get(1);
        System.out.println(animal2);
        //with dobul values
        
   
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        hm.put(5, "janwar");
        hm.put(6, "animal2");
         String var= hm.get(1);
         String var2 =hm.get(0);
      System.out.println("Value at index 2 is: "+var);
      System.out.println("Value at index 2 is: "+var2);

//         Set set = hm.entrySet();
//      Iterator iterator = set.iterator();
//      while(iterator.hasNext()) {
//         Map.Entry mentry = (Map.Entry)iterator.next();
//         System.out.print("key is: "+ mentry.getKey() + " & Value is: ");
//         System.out.println(mentry.getValue());
//      }

//        String janw =hm.get(1);
//        System.out.println("value is " +janw);
        
        //in ide 7
        ArrayList<For> list = new ArrayList<>();
        
    }
    
}
