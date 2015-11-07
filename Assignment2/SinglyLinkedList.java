/**
 * SinglyLinkedList.java
 * By: Garrick Ranck
 * Singly linked list with inner class Node
 * November 6, 2015
 * Data Structures Assignment 2
 **/

import java.util.*;

public class SinglyLinkedList<T extends Comparable<T>> extends BinaryTree<T>{

   private Node<T> head;
   private int count;

   public SinglyLinkedList(BinaryNode<T> node){
      head = new Node<T>(node);
      count = 1;

   }//end constructor

   //adds an element to list(que)
   //@param node of type BinaryNode<T>, node to be added to que
   public void pushNode(BinaryNode<T> node){
      Node<T> temp = new Node<T>(node);
      Node<T> current = head;

      if(current == null){
         head = new Node<T>(node);
         count++;
      }//end if
      
      else{
         while(current.getNext() != null){
            current = current.getNext();
         }//end while
         current.setNext(temp);
         count++;
      }//end else
   }//end method pushNode
   
   //@returns next BinaryNode<T> in que
	//@requires isEmpty != true
   public BinaryNode<T> popNode(){
      Node<T> removed = head;
      head = head.getNext();
      count--;
      return removed.getData();

   }//end method popNode
   
   //@returns boolean: true if que = empty, false if que != empty
   public boolean isEmpty(){
      //if(head == null)
      //   return true;
      //return false;
      if(count == 0)
         return true;
      return false;
   }//end method isEmpty

   //inner class contains data of an element in linked list
   private class Node<T extends Comparable<T>>{ 

      private BinaryNode<T> data; 
      private Node<T> next; //next linked node in the list
      
      //creates a SinglyLinkedList with the provided node
      //@param data of type BinaryNode<T>, head of SinglyLinkedList
      public Node (BinaryNode<T> data){
         this.data = data;
         next = null;

      }//end constructor

      //assigns value of next node as the input
      //@param next of type Node<T>, next node to be pointed to be this.node 
      public void setNext(Node<T> next){

         this.next = next;

      }//end method setNext

      //gets next node in linked list
      //@returns node of type Node<T>, node that is this.node's next node
      public Node<T> getNext(){
         return this.next;

      }//end method getNext

      //@returns node of type BinaryNode<T>, value representation of this node
      public BinaryNode<T> getData(){
         return this.data;

      }//end method getData

   }//end class Node

}//end class MyArrayList


