public class SimpleTest{

   public static void main(String[] args){

      final Integer nullSymbol = 0;

      Integer[] breadthFirstSequence = {27, 13, 59, 3, 17, 43, 107, 2, 11};

      System.out.println("Using default breadth-first traversal breadthFirstSequence = "
            + java.util.Arrays.toString(breadthFirstSequence));

      BinarySearchTree<Integer> tree = new BinarySearchTree<Integer>(breadthFirstSequence, nullSymbol);
 
		System.out.println("Height = " + tree.height());
		System.out.println("Width = " + tree.width());
		System.out.println("preOrderTraverse: " + tree.preOrderTraverse());		
		System.out.println("postOrderTraverse: " + tree.postOrderTraverse());		
		System.out.println("inOrderTraverse: " + tree.inOrderTraverse());
		System.out.println("breadthFirstTraverse: " + tree.breadthFirstTraverse());
      
      tree.insert(5);
      System.out.println("inOrderTraversal after adding 5: " + tree.inOrderTraverse());
      System.out.println("Is 5 in tree: " + tree.contains(5));

      tree.remove(5);
      System.out.println("After removing 5.");
      System.out.println("InOrder Traverse: " + tree.inOrderTraverse());


   }//end main method
}//end class
