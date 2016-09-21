/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practise12;

/**
 *
 * @author BABAR
 */
public class Practise12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int n;
       int maxDivisor;
       int numWithMax;
       maxDivisor=1;
       numWithMax=1;
       for(n=2;n<=1000;n++){
    int d;
    int divisorCount;
    divisorCount = 0;
    for(d=1;d<=n;d++){
    if(n%d==0)
        divisorCount++;
    }
    if(divisorCount>maxDivisor)
        maxDivisor =divisorCount;
        numWithMax=n;
    }
        System.out.println("among integers between 1 to 1000");
        System.out.println("the maximum number of divisor is " +maxDivisor);
        System.out.println("a number with" +maxDivisor+ "divisor is " +numWithMax);
    }
}

