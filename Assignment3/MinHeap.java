import java.util.ArrayList;

public class MinHeap<T extends Comparable<T>>{
   
   private ArrayList<T> heap;

   public MinHeap(){
      heap = new ArrayList<T>();   

   }//end constructor
   
   //@param task of type T, task that is to be inserted into the heap
   public void insert(T task){
      int index = heap.size(); //size of heap, equal to index of element added
      heap.add(task);
      
      //while parent is greater than child perform swap 
      while(heap.get((index - 1)/2).compareTo(heap.get(index)) > 0){
         T replaced = heap.get((index - 1)/2); //temp value to store parent element
         heap.set((index - 1)/2, heap.get(index)); //changes parent value to child
         heap.set(index, replaced); //changes child value to parent
         index = (index - 1)/2;

      }//end while


   }//end end method insert
   
   //@returns task of type T, task that was removed from heap 
   public T remove(){
      T replaced = heap.get(heap.size() - 1);
      T removed = heap.get(0);
      heap.remove(0);
      heap.set(0, replaced);
      heap.remove(heap.size() - 1);
      return removed; //still need to bubble down new root to proper index 


   }//end method remove

   
   //@returns true if heap is empty, false if not
   public boolean isEmpty(){
      return heap.isEmpty();

   }//end method isEmpty
   

   //@returns true if heap is full, false if not
   public boolean isFull(){
      return true; //fix return value

   }//end method isFull


  






}//end class MinHeap
