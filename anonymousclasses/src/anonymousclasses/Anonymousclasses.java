/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anonymousclasses;

/**
 *
 * @author BABAR
 */
public class Anonymousclasses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       machine mac1 = new machine(){
       @Override
       public void start(){
        System.out.println("MAhine .................");
    }
       
       };
       mac1.start();
       In iny = new In() {

           @Override
           public void speak() {
               System.out.println("speak truth");          }
       };
       iny.speak();
    }
    
}
