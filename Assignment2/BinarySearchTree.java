/*
 * BinarySearchTree.java
 * By: Garrick Ranck
 *
 */


public class BinarySearchTree<T extends Comparable<T>> extends BinaryTree<T>{
   
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

   public BinaryNode<T> findLowest(BinaryNode<T> currentRoot){
      if(currentRoot.getLeftNode() != null)
         return findLowest(currentRoot.getLeftNode());
      else
         return currentRoot;

   }//end method BinaryNode<T>

   public int getSize(){
      return numOfNodes;

   }//end method getSize
   
   //returns boolean true if value is in tree
   //else returns false
   public boolean contains(T value){

      //value is equal to root
      if(value.compareTo(root.getData()) == 0)
         return true; 
      
      //value is less than root
      else if(value.compareTo(root.getData()) < 0){
         if(root.getLeftNode() == null)
            return false;
         else
            return contains(root.getLeftNode(), value);
      }//end if less than root
      
      //value is greater than root
      else{
         if(root.getRightNode() == null)
            return false;
         else
            return contains(root.getRightNode(), value);
      }//end else

   }//end method contains

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
