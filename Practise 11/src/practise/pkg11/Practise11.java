/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practise.pkg11;

/**
 *
 * @author BABAR
 */
public class Practise11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int die1;
        int die2;
        int count;
        count =0;
        do{
        die1=(int)(Math.random()*6)+1;
        die2=(int)(Math.random()*6)+1;
        count++;
        }
        while(die1==1 || die2==1);
        System.out.println("first value is " +die1);
        System.out.println("second value is " +die2);
        System.out.println("rolls needed to come snake eye" +count);
        //snake eye means 1 1 on both dices
    }
    
}
