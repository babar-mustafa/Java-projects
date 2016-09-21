/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericsandwildcards;
import java.util.ArrayList;
/**
 *
 * @author BABAR
 */
public class Genericsandwildcards {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
ArrayList<MAchine> al1 = new ArrayList<MAchine>();
al1.add(new MAchine());
al1.add(new MAchine());

//wildcards
ArrayList<camera> al2 = new ArrayList<camera>();
al2.add(new camera());
al2.add(new camera());
showList(al1);


    }
public static void showList(ArrayList<? extends MAchine>  al2){
    for(Object valuew: al2){
    System.out.println(valuew);
    }

}

}    
   

/*
for string 
ArrayList<String> al1 = new ArrayList<String>();
al1.add("one);
al1.add("two);


showList(al1);


    }
public static void showList(ArrayList<String> al1){
    for(String valuew: al1){
    System.out.println(valuew);
    }

//for class
ArrayList<MAchine> al1 = new ArrayList<MAchine>();
al1.add(new MAchine());
al1.add(new MAchine());

public static void showList(ArrayList<MAchine> al1){
    for(MAchine valuew: al1){
    System.out.println(valuew);
    }
//for wild 
ArrayList<camera> al2 = new ArrayList<camera>();
al2.add(new camera());
al2.add(new camera());
showList(al2);


    }
public static void showList(ArrayList<?> al2){
    for(Object valuew: al2){
    System.out.println(valuew);
    }
*/
