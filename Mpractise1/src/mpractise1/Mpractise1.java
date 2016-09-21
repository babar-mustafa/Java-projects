/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mpractise1;

/**
 *
 * @author BABAR
 */
public class Mpractise1 {

    /**
     * Create two classes; make two methods for calculating the area of rectangle
     * and circle and call them in another class also show the output.
     * [Hint: area of R: L*w, area of C: pi*r*r] Classes should be in different package
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.AofRectangle();
        System.out.println(" ");
        Circle c= new Circle();
        c.aofCircle();
        System.out.println(" ");
    }
    
}
