/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dfs;

/**
 *
 * @author Madhsuha
 */
public class Search {
    public static void main(String[] args) {
        try {
            Node tree = sampletree();
           // Bfs.traversal(tree);
            Dfs.traversal(tree);
        } catch (Exception e) {
            e.printStackTrace();
        }
        }
    
     public static Node sampletree(){
       Node root = new  Node("A" , 
                   new Node ("B", 
                   new Node ("C"),new Node ("D")),
                   new Node ("E" ,new Node ("F"),new Node ("G",
                   new Node ("H"), null)));
                   
         
         return root;
    }
    
}

  