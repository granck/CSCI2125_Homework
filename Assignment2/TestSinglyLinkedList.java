import org.junit.Test;
import static org.junit.Assert.*;

public class TestSinglyLinkedList{

   @Test
   public void TestPopWithOneNode(){
      String[] seq = {"A"};
      BinaryTree<String> first= new BinaryTree<String>(seq);
      SinglyLinkedList<String> list = new SinglyLinkedList<String>(first.root);
      assertEquals("A", list.popNode().getData());
   }
   @Test
   public void TestPushAndPopWithTwoNodes(){
      String[] seqA = {"A"};
      String[] seqB = {"B"};
      BinaryTree<String> first = new BinaryTree<String>(seqA);
      BinaryTree<String> second = new BinaryTree<String>(seqB);
      SinglyLinkedList<String> list = new SinglyLinkedList<String>(first.root);
      list.pushNode(second.root);
      assertEquals("A", list.popNode().getData());
      assertEquals("B", list.popNode().getData());
   }
   @Test
   public void TestPushAndPopWithSameNode(){
      String[] seq = {"A"};
      BinaryTree<String> first = new BinaryTree<String>(seq);
      SinglyLinkedList<String> list = new SinglyLinkedList<String>(first.root);
      list.pushNode(first.root);
      assertEquals("A", list.popNode().getData());
      assertEquals("A", list.popNode().getData());
   }

 





















}//end TestSinglyLinkedList class
