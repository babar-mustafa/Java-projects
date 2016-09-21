/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assarray;

/**
 *
 * @author BABAR
 */
public class Assarray {

   
    public static void main(String[] args) {
   //ist way
        
        int[] fru;
       fru =new int[3];
       fru [0]=2;
       fru[1]=4;
       fru [2]=6;
       //ist way can also done by this way
       int h;
       for(h=0;h<fru.length;h++)
       {
       System.out.println(fru[h]);
       }
System.out.println(fru[0]);
System.out.println(fru[1]);
System.out.println(fru[2]);
//second way    
int p;
int[]pok={10,20,30,40};
for(p=0;p<pok.length;p++){
System.out.println(pok[p]);}
    }

}
