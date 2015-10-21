/*
 *
 * BinaryNode.java
 * By: Garrick Ranck
 * Used in BinarySearchTree class
 * Holds data and reference to left/right nodes
 */

public class BinaryNode<S>{
   
   BinaryNode<S> left;
   BinaryNode<S> right;
   S value;
   private static int length;

   public BinaryNode(){
      value = null;
      left = null;
      right = null;

      length = 0;

   }//end constructor

   public BinaryNode(S data){
      value = data;
      left = null;
      right = null;

      length = 1;

   }//end constructor with parameter

   public void setValue(S data){
      value = data;

   }//end method setValue
      
   public void setLeft(S data){
      if(left == null)
         left = new <S>BinaryNode(data);
      else
         left.setValue(data);

      length++;

   }//end method setLeft

   public void setRight(S data){
      if(right == null)
         right = new <S>BinaryNode(data);
      else
         right.setValue(data);

      length++;

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

   public int length(){
      return length;
   }//end method length

}//end class BinaryNode
