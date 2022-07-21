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
public class Search {
    public static void main(String[] args) {
        try {
            Node tree = sampletree();
            Dfs.traversal(tree);
        } catch (Exception e) {
            e.printStackTrace();
        }
        }
    
     public static Node sampletree(){
       Node root = new  Node( "A" , 
                  new Node("B", new Node("D"), null),
                   new Node ("C", 
                   new Node ("G"),new Node("E", new Node("F" ), new Node("H"))));
                  

                   
         
         return root;
    }
    
}

  