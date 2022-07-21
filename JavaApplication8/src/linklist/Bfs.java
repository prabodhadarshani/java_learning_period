/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linklist;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Madhsuha
 */
public class Bfs {
   static void traversal(Node node){
       Queue<Node> q =new LinkedList<Node>();
        q.add(node);
        
        while(!q.isEmpty())
        {
            node = q.remove();
            System.out.println(node.data + "");
            
            if(node.left != null)
                q.add(node.left);
            
            if(node.right != null)
                q.add(node.right);
                
        }
  
   } 
}
