/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package overloadobj;

/**
 *
 * @author Set
 */
public class Over {
     int minFun(int n1,int n2){
         int min;
         if(n1>n2)
             min =n2;
         else
             min=n1;
         return min;
}
double minFun(double n1,double n2){
         double min;
         if(n1>n2) 
             min =n2;
         else
             min=n1;
         return min;
}
}