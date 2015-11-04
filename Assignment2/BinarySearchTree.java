/*
 * BinarySearchTree.java
 * By: Garrick Ranck
 *
 */


public class BinarySearchTree<T> extends BinaryTree<T>{
   
   private int numOfNodes = 0;
	
	public BinarySearchTree(){
		super();
	}//end consructor

   public BinarySearchTree(T[] seq){
      super(seq);
   }//end constructor

   public BinarySearchTree(T[] seq, T nullSymbol){
      super(seq, nullSymbol);
   }//end constructor
   
   //inserts value at appropriate location in tree
   public void insert(T value){
      if (root.getData() == null)
         root.setData(value);   
      
      //determine if value is less than root
      else if(value.compareTo(root.getData()) < 0){
         //determine if root has left child
         if(root.getLeftNode() != null)
            insert(root.getLeftNode(), value);
         else
            root.setLeftNode(new BinaryNode<T>(value));
      }//end else if

      //determine if value is greater than root
		else if(value.compareTo(root.getData()) > 0){ 
			//determine if root has right child
         if(root.getRightNode() != null)
            insert(root.getRightNode(), value);
         else
            root.setRightNode(new BinaryNode<T>(value));
      }//end else

   }//end method insert

   //recursively determines placement of value in tree
	//does nothing if value currently exists in tree
	//inserts value at appropriate location in tree
   //accepts child of previous node and value to insert
   public void insert(BinaryNode<T> currentRoot, T value){
		
		//determine if value is less than root 
		if(value.compareTo(currentRoot.getData()) < 0){
			//deterine if root has a left child
			if(root.getLeftNode() != null)
				insert(root.getLeftNode(), value);
			else
				root.setLeftNode(new BinaryNode<T>(value));
		}//end if
		
		//determine if value is greater than root
		else if(value.compareTo(currentRoot.getData()) > 0){
			//determine if root has a right child
			if(root.getRightNode() != null)
				insert(root.getRightNode(), value);
			else
				root.setRightNode(new BinaryNode<T>(value));
		}//end else if

   }//end method insert overloaded
	
	//removes node 
	public void remove(T value){

	}//end method remove

   public int getSize(){
      return numOfNodes;

   }//end method getSize

   //recursive
   //returns number of edge between root and deepest child
   public int height(){
      return 0;

   }//end method height

}//end class BinarySearchTree
