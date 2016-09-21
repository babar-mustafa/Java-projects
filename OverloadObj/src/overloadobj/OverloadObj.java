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
public class OverloadObj {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  int a= 110;
        int b= 90;
        double c=9.345;
        double d=9.5;
        
        Over obj=new Over();
        int a1 = obj.minFun(a,b);
        
        Over obj2=new Over();
       double a2 =obj2.minFun(c,d);
        
        System.out.println("Integar minimum value is " +a1);
        System.out.println("Double minimum value is " +a2);
    }
    
}
