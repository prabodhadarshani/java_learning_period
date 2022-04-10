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
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("gfg");
    
	
//		int a = 230;
//		System.out.println("int value = "+a);
//		byte i = 10;
//                byte y = 10;
//                System.out.println(i+y);
//		byte b = i.byteValue();
//		System.out.println("byte value = "+b);	


byte a=10;  
byte b=10;  
byte c= (byte) (a+b);//Compile Time Error: because a+b=20 will be int  
//byte c=(byte)(a+b);  
System.out.println(c);  
	
}
	
}
    
    

