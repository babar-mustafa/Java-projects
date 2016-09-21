/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg15arrayst;

/**
 *
 * @author BABAR
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int h;
        String[] ai;
        ai=new String[3];
        ai[0]="hello";
        ai[1]="m.r";
        ai[2]="hi";
       // System.out.println(ai[0]);
        //System.out.println(ai[1]);
        //System.out.println(ai[2]);
        for(h=0;h<ai.length;h++){
        System.out.println(ai[h]);
        }
        String[] bi={"apple","mango","oranges"};
        for(String ty:bi){
            System.out.println(ty);
        }
        
    }
    
}
