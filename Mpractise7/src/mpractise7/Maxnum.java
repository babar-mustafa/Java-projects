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
public class Maxnum {
   public static int Fmaxnum(int a,int b,int c){
   int max=0;
   if(a<b)
       max=b;
   if(b<a)
       max = a;
   if(a<c)
       max=c;
   return max;
   
   }
}
