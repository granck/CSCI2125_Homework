/*
 * BinarySearchTree.java
 * By: Garrick Ranck
 *
 */


public class BinarySearchTree<T> extends BinaryTree<T>{
   
   BinaryNode<T> rootPtr; //holds root of a specific tree
   private int numOfNodes = 0;

   public BinarySearchTree(T[] seq){
      super(seq);

   }//end constructor

   public BinarySearchTree(T[] seq, T nullSymbol){
      super(seq, nullSymbol);
   }//end constructor
   
   //recursive
   //inserts value at appropriate location in tree
   public void insert(T value){
      if (root.getData() == null)
         root.setData(value);   
      
      //else if value is less than true root
      else if(value.compareTo(root.getData())){
         //determine if root has left child
         if(root.getLeftNode())
            insert(root.getLeftNode(), value);
         else
            root.setLeftNode(new BinaryNode<T>(value));
      }//end else if

      //else value is greater than root
      else{ 
         if(root.getRightNode())
            insert(root.getRightNode(), value);
         else
            root.setRightNode(new BinaryNode<T>(value));
      }//end else

   }//end method insert

   //inserts value at appropriate location in tree
   //overloaded. Accepts Child of previous node and value to insert
   public void insert(BinaryNode<T> currentRoot, T value){

   }//end method insert overloaded

   public int getSize(){
      return numOfNodes;

   }//end method getSize

   //recursive
   //returns number of edge between root and deepest child
   public int height(){
      return 0;

   }//end method height

}//end class BinarySearchTree
