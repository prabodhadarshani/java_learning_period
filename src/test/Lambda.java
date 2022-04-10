/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author Madhsuha
 */

//   interface student {
//    void print(String name);
//}
//
//public class lambda implements student {
//    public void print(String name) {
//        System.out.println("Hello" + " " + name);
//    }
//
//    public static void main(String args[]) {
//        lambda obj = new lambda();
//        obj.print("Saman");
//   
//} 
//}


@FunctionalInterface  //It is optional  
interface Student{  
    public void print();  
}  
  
public class Lambda {
    public static void main(String[] args) {  
        
          
        //with lambda  
        Student obj=()->{
            System.out.println("Hello");  
        };  
        obj.print();
    }  
}  