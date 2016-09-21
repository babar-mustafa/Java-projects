/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion;

/**
 *
 * @author BABAR
 */
public class RECURSION {

    
    public static void main(String[] args) {
        System.out.println(calculate(6));
    }
    public static int calculate(int value){
           
         System.out.println(value);
        if(value == 1){
        return 1;
        }
  return calculate(value-1)*value;
          
    
    }
}
