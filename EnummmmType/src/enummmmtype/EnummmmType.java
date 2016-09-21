/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enummmmtype;

/**
 *
 * @author BABAR
 */
public class EnummmmType {
//    public static final int DOG = 0;
//    public static final int CAT = 1;
//    public static final int MOUSE = 2;
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Animal anim = Animal.CAT;
       
       switch(anim){
           case DOG:
               System.out.println("DOG");
               break;
           case MOUSE:
               System.out.println("MOUSE");
               break;
           case  CAT:
               System.out.println("CAT");
               break;
           default:
               System.out.println("NOT defined");
       
       }
        System.out.println(Animal.DOG);
        System.out.println(Animal.DOG.name());
        System.out.println(Animal.DOG.getClass());
        System.out.println(Animal.DOG instanceof Animal);
        Animal anim2 = Animal.valueOf("CAT");
        System.out.println(anim2);
        
    }
    
}
