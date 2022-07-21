/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_learning_period;

import jdk.nashorn.internal.ir.TryNode;

/**
 *
 * @author Madhsuha
 */
//public class period1 {
//
//}
public class Bird {
public String getName() {
return "Unknown";
}
public void displayInformation() {
System.out.println("The bird name is: "+getName());
}
}
public class Peacock extends Bird {
public String getName() {
return "Peacock";
}
public static void main(String[] args) {
Bird bird = new Peacock();
bird.displayInformation();
}
}
 