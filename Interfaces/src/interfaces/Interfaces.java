/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author BABAR
 */
public class Interfaces {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Machine mac1 = new Machine();
        mac1.start();
        mac1.showInfo();
        Person pr1 = new Person("babar");
        pr1.greed();
        pr1.showInfo();
        Info inf1 = new Machine();
        
       inf1.showInfo();
       Info inf2 =pr1;
       inf2.showInfo();
        System.out.println("   ");
       outputInfo(mac1);
       outputInfo(pr1);
           
          }
    private static void outputInfo(Info inf){
           inf.showInfo();
       }
}
