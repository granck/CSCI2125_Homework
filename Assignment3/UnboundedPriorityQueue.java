//import java.util.ArrayList;

public class UnboundedPriorityQueue<T extends Comparable<T>> {

   MinHeap<T> que; 
   public UnboundedPriorityQueue(){
      que = new MinHeap<T>(); 

   }//end constructor 
   

   //adds task to end of arraylist
   //bubble up until in proper index 
	//@parameter value of type T, passes value into que
   public void enqueue(T task){
      que.insert(task); //still need to bubble element up to proper index

   }//end method enqueue
   
   //removes first index from arraylist
   //places last index into first
   //bubble down until in proper index
	//@preturns first element of type T in heap
   public T dequeue(){
      return que.remove();
   }//end method dequeue

	//@returns true if heap is empty, else returns false
   public boolean isEmpty(){
      return que.isEmpty();

   }//end method isEmpty
	
	//@returns integer number of elements in heap
	public int getSize(){
		return que.getSize();
	}//end method getSize

}//end class UnboundedPriorityQue
