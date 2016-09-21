/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package arraylist;
import java.util.ArrayList;
/**
 *
 * @author Babar PC
 */
public class Arraylist {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ArrayList<Integer> number = new ArrayList<Integer>();
       //for adding 
       number.add(2);
       number.add(6);
       number.add(8);
        System.out.println(number.get(0));
        System.out.println("--------------------");
        //ist way of iterating
        for(int i = 0; i<number.size(); i++){
            System.out.println(number.get(i));
        }
        number.remove(0);
        number.remove(number.size()-1);
          System.out.println("--------------------");
          //2nd way of iterating
          for(Integer b:number){
              System.out.println(b);
          }
    }
    
}
