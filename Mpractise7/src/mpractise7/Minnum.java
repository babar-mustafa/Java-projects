/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mpractise7;

/**
 *
 * @author BABAR
 */
public class Minnum {
 public static int  Fminnum(int a,  int b, int c){
   int min = 0;
   if(a < b )
      min=a;
   else if (b<a)
       min = b;
   else if (c<b)
       min = c;   
        return min;
   
   } 

}
