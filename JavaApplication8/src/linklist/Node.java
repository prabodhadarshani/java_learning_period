/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linklist;

/**
 *
 * @author Madhsuha
 */
public class Node {
    Node left;
    Node right;
    String data;
    
    public Node(String data){
        this.data =data;
    }
   public Node(String data, Node left, Node right) {
         this.data = data;
         this.left = left;
         this.right =right;
   
   }
}
