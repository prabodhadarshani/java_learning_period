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
public class Dfs {
    static void traversal(Node node){
      if(node == null)
          return;
        System.out.println(node.data);
        traversal(node.left);
        traversal(node.right);
      
    }
    
}
