//import java.util.ArrayList;

public class UnboundedPriorityQueue<T extends Comparable<T>> {

   MinHeap<T> que; 
   public UnboundedPriorityQueue(){
      que = new MinHeap<T>(); 

   }//end constructor 
   

   //adds task to end of arraylist
   //bubble up until in proper index 
   public void enqueue(T task){
      que.insert(task); //still need to bubble element up to proper index

   }//end method enqueue
   
   //removes first index from arraylist
   //places last index into first
   //bubble down until in proper index
   public T dequeue(){
      return que.remove();
   }//end method dequeue


   public boolean isEmpty(){
      return que.isEmpty();

   }//end method isEmpty

}//end class UnboundedPriorityQue
