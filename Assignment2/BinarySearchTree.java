/**
 * BinarySearchTree.java
 * By: Garrick Ranck
 * Creates a binary search tree, additionally provides insertion, deletion, and contains methods
 * November 6, 2015
 * Data Structures Assignment 2
 **/


public class BinarySearchTree<T extends Comparable<T>> extends BinaryTree<T>{
   
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
   //@param value of type T, consistent with type in BinaryTree and BinarySearchTree, data to be added to tree
   public void insert(T value){
      if(root == null)
         root = new BinaryNode<T>(value);

      if(root.getData() == null)
         root.setData(value);   

      //if root exists, use overloaded method to continue
      else
         insert(root, value);

   }//end method insert


   //recursively determines placement of value in tree
	//does nothing if value currently exists in tree
	//inserts value at appropriate location in tree
   //accepts child of previous node and value to insert
   //@param currentRoot of type BinaryNode<T>, node given if value to be inserted is be a descendent
   //@param value of type T, consistent with type in BinaryTree and BinarySearchTree, data to be added to tree
   public void insert(BinaryNode<T> currentRoot, T value){
		
		//determine if value is less than root 
		if(value.compareTo(currentRoot.getData()) < 0){
			//deterine if root has a left child
			if(currentRoot.getLeftNode() != null)
				insert(currentRoot.getLeftNode(), value);
			else
				currentRoot.setLeftNode(new BinaryNode<T>(value));
		}//end if
		
		//determine if value is greater than root
		else if(value.compareTo(currentRoot.getData()) > 0){
			//determine if root has a right child
			if(currentRoot.getRightNode() != null)
				insert(currentRoot.getRightNode(), value);
			else
				currentRoot.setRightNode(new BinaryNode<T>(value));
		}//end else if

   }//end method insert overloaded
	
	//removes node 
	public void remove(T value){
      
      remove(root, value);
	}//end method remove
   
   //recursively removes desired value from tree
   //@param currentRoot of type BinaryNode<T>, node given if value to be removed is a descendent
   //@param value of type T, consistent with type in BinaryTree and BinarySearchTree, data to be removed from tree
   //@returns boolean true if currentRoot is a leaf node, used for logic to replace removed data 
   public boolean remove(BinaryNode<T> currentRoot, T value){
      if(currentRoot.getData() == null)
         System.out.println("No such value in tree.");
      else if(value.compareTo(currentRoot.getData()) == 0){
         //if currentRoot has 2 children
         if(currentRoot.getLeftNode() != null && currentRoot.getRightNode() != null){
            BinaryNode<T> tempNode = findLowest(currentRoot.getRightNode());
            currentRoot.setData(tempNode.getData());
            if(remove(currentRoot.getRightNode(), currentRoot.getData())){
               currentRoot.setRightNode(null);
               return false;
            }//end if
         }
         else if(currentRoot.getLeftNode() != null){
            currentRoot.setData(currentRoot.getLeftNode().getData());
            if(remove(currentRoot.getLeftNode(), currentRoot.getData())){
               currentRoot.setLeftNode(null);
               return false;
            };
         }//end else if currentRoot has only left child

         else if(currentRoot.getRightNode() != null){
            currentRoot.setData(currentRoot.getRightNode().getData());
            if(remove(currentRoot.getRightNode(), currentRoot.getData())){
               currentRoot.setRightNode(null);
               return false;
            }//end if
         }//end else if currentRoot has only right child
         
         else{ //leaf node
            //currentRoot.setData(null);
            return true;
         }//end else
      }//end else if value is equal to root
      
      //value is less than currentRoot
      else if(value.compareTo(currentRoot.getData()) < 0){
         if(remove(currentRoot.getLeftNode(), value)){
            currentRoot.setLeftNode(null);
            return false;
         }//end if
      }//end else if
      //value is greater than currentRoot
      else{
         if(remove(currentRoot.getRightNode(), value)){
            currentRoot.setRightNode(null);
            return false;
         }//end if
      }//end else

      return false;


   }//end overloaded remove method
   
   //finds smallest value of tree beginning with node given
   //@param currentRoot of type BinaryNode<T>, node that method will find smallest value in
   //@returns BinaryNode<T> that is the smallest in the tree
   public BinaryNode<T> findLowest(BinaryNode<T> currentRoot){
      if(currentRoot.getLeftNode() != null)
         return findLowest(currentRoot.getLeftNode());
      else
         return currentRoot;

   }//end method BinaryNode<T>
   
   //passes value to be searched for into overloaded method with root of tree
   //@param value of type T, consistent with  type in BinaryTree and BinarySearchTree, value to be searched for in tree
   //@return boolean: true if value is in tree, false if value is not in tree
   public boolean contains(T value){
      return contains(root, value); 

   }//end method contains
   
   //searches the tree for specified value
   //@param currentRoot of type BinaryNode<T>, node used to compare with value
   //@param value of type T, consistent with type in BinaryTree and BinarySearchTree, value to be searched for in tree
   //@returns boolean: true if value is in tree, false if value is not in tree
   public boolean contains(BinaryNode<T> currentRoot, T value){
      
      //if value is equal to currentRoot
      if(value.compareTo(currentRoot.getData()) == 0)
         return true;
      
      //else if value is less than currentRoot
      else if(value.compareTo(currentRoot.getData()) < 0){
         if(currentRoot.getLeftNode() == null)
            return false;
         else
            return contains(currentRoot.getLeftNode(), value);
      }//end else if less than root

      //value is greater than root
      else{
         if(currentRoot.getRightNode() == null)
            return false;
         else
            return contains(currentRoot.getRightNode(), value);

      }//end else value is greater than root

   }//end method contains(2 parameters)

}//end class BinarySearchTree
