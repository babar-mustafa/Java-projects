/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg19getset;

/**
 *
 * @author BABAR
 */
public class NewClass {
    String name;
       int age;
      void speak()
      {
        System.out.println("My name is" +name);
        System.out.println("My age is" +age);
      }
      int retir(){
      int years=56-age;
          //System.out.println(+years);
      return years;      
    
      }
int getAge(){
return age;
}
String getName(){
return name;
}
}

