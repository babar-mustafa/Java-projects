/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package castingnuval;

/**
 *
 * @author BABAR
 */
public class CastingNuVal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int intValue = 34;
        double doublevalue = 56.3;
        float floatValue = 253.6f;
        long longValue = 12654;
        byte byteValue = 20;
        intValue =(int)longValue;
        System.out.println(intValue);
////        longValue = intValue;
////        System.out.println(longValue);
////        doublevalue = intValue;
////        System.out.println(doublevalue);
    }
    
}
