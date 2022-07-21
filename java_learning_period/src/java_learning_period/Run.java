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
//public class Java_learning_period {
//
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String[] args) {
//}
//}


public interface Walk {
public default int getSpeed() {
return 5;
}
}
public interface Run {
public default int getSpeed() {
return 10;
}
}
public class Java_learning_period implements Walk, Run {
public int getSpeed() {
return 1;
}
public static void main(String[] args) {
System.out.println(new Cat().getSpeed());
}
}
