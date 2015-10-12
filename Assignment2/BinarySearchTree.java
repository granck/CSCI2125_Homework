/*
 * BinarySearchTree.java
 * By: Garrick Ranck
 *
 */


public class BinarySearchTree<S>{
   
   Node rootPtr; //holds root of a specific tree
   int numOfNodes;

   public BinarySearchTree(){
      rootPtr = new <S>Node();
      numOfNodes = 0;

   }//end constructor
   
   //recursive
   //inserts value at appropriate location in tree
   public void insert(S value){
      if (rootPtr.getValue() == null)
         rootPtr.setValue(value);   
      
      //else if value is less than true root
      else if(value < rootPtr.getValue()){
         //determine if root has left child
         if(rootPtr.hasLeft())
            insert(rootPtr, value);
         else
            rootPtr.setLeft(value);
      }//end else if

      //else value is greater than root
      else{ 
         if(rootPtr.hasRight())
            insert(rootPtr, value);
         else
            rootPtr.setRight(value);
      }//end else

   }//end method insert

   public int getSize(){
      return numOfNodes;

   }//end method getSize

   //recursive
   //returns number of edge between root and deepest child
   public int height(){
      return 0;

   }//end method height

}//end class BinarySearchTree
