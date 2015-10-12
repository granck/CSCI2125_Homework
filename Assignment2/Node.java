/*
 *
 * Node.java
 * By: Garrick Ranck
 * Used in BinarySearchTree class
 * Holds data and reference to left/right nodes
 */

public class Node<S>{
   
   Node<S> left;
   Node<S> right;
   S value;

   public Node(){
      value = null;
      left = null;
      right = null;

   }//end constructor

   public Node(S data){
      value = data;
      left = null;
      right = null;

   }//end constructor with parameter

   public void setValue(S data){
      value = data;

   }//end method setValue
      
   public void setLeft(S data){
      if(left == null)
         left = new <S>Node(data);
      else
         left.setValue(data);

   }//end method setLeft

   public void setRight(S data){
      if(right == null)
         right = new <S>Node(data);
      else
         right.setValue(data);

   }//end method setRight

   public S getValue(){
      return value;

   }//end method getValue

   public boolean hasLeft(){
      if(left == null)
         return false;
      return true;

   }//end method hasLeft

   public boolean hasRight(){
      if(right == null)
         return false;
      return true;

   }//end method hasRight

   public S getLeft(){
      if(left == null)
         return null;
      else
         return left.getValue();

   }//end method getLeft

   public S getRight(){
      if(right == null)
         return null;
      else
         return right.getValue();

   }//end method getRight

}//end class Node
