/*
 * SinglyLinkedList.java
 * Singly linked list with inner class Iterator and inner class Node
 * Garrick Ranck, November 6, 2015
 * CSCI2125
 **/

import java.util.*;

public class SinglyLinkedList<T extends Comparable<T>> extends BinaryTree<T>{

   private Node<T> head;
   private int count;

   public SinglyLinkedList(BinaryNode<T> node){
      head = new Node<T>(node);
      count = 1;

   }//end constructor

   //method adds an element to list
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
	
	//@requires isEmpty != true
   public BinaryNode<T> popNode(){
      Node<T> removed = head;
      head = head.getNext();
      count--;
      return removed.getData();

   }//end method popNode

   public boolean isEmpty(){
      //if(head == null)
      //   return true;
      //return false;
      if(count == 0)
         return true;
      return false;
   }//end method isEmpty

   //inner class contains data of an element in linked list
   private class Node<T>{ 

      private BinaryNode<T> data; 
      private Node<T> next; //next linked node in the list
      
      //creates node with input as value 
      public Node (BinaryNode<T> data){
         this.data = data;
         next = null;

      }//end constructor

      //assigns value of next node as the input
      //@requires input = Node of type Element
      public void setNext(Node<T> next){

         this.next = next;

      }//end method setNext

      //gets next node in linked list
      public Node<T> getNext(){
         return this.next;

      }//end method getNext

      //returns value of this node
      public BinaryNode<T> getData(){
         return this.data;

      }//end method getData

   }//end class Node

}//end class MyArrayList


