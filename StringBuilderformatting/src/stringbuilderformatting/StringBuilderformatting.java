/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringbuilderformatting;
import java.lang.String;
/**
 *
 * @author BABAR
 */
public class StringBuilderformatting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      String anum=" ";
      anum +="hello.";
      anum+="\t";
      anum+="how are you?";
        System.out.println(anum);
        StringBuilder sb=new StringBuilder("\t");
        sb.append("i am fine");
        sb.append(" ");
        sb.append("what about u?");
        System.out.println(sb.toString());
        StringBuilder s =new StringBuilder("  \t   ");
        s.append("hiiiiiii")
        .append(" t t ")
        .append("uuuuuuuuuu");
        System.out.println(s.toString());
        System.out.printf("Number is %-10d,\nQuantity is %10d\n" ,9,800);
    }
    
}
