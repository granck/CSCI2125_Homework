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
	/*
	 * removes first value in heap and replaces it with last value in heap
	 * then bubbles replaced value down heap until it is in proper location again
	 *
	 * @returns task of type T, task that was removed from heap 
	 **/
	public T remove(){
		T removed = null;
		if(isEmpty() == false){
			T replaced = heap.get(heap.size() - 1);
			removed = heap.get(0);
			heap.set(0, replaced);
			heap.remove(heap.size() - 1);
			int index = 0;

			while(heap.size() != 0){

				//if left child is less than parent
				if((index*2 + 1) < heap.size() && heap.get(index*2 + 1).compareTo(heap.get(index)) < 0){

					//if right child is less than left child
					//by transitive property, right child will be less than parent as well
					if((index*2 + 2) < heap.size() && heap.get(index*2 + 2).compareTo(heap.get(index* 2 + 1)) < 0 ){
						T swap = heap.get(index*2 + 2); //stores value in child index
						heap.set((index*2 + 2), heap.get(index)); //sets child index to parent value
						heap.set(index, swap); //sets parent index to child value
						index = index*2 + 2; //increment index to location of child bubbled down
					}//end inner if

					//else if 
					else{ 
						T swap = heap.get(index*2 + 1); //stores value in child index
						heap.set((index*2 + 1), heap.get(index)); //sets child index to parent value
						heap.set(index, swap); //sets parent index to child value
						index = index*2 + 1; //increment index to location of child bubbled down
					}// end else

				}//end outer if

				//else if left child isn't less, check right child seperately
				else if((index*2 + 2) < heap.size() && heap.get(index*2 + 2).compareTo(heap.get(index)) < 0 ){
					T swap = heap.get(index*2 + 2); //stores value in child index
					heap.set((index*2 + 2), heap.get(index)); //sets child index to parent value
					heap.set(index, swap); //sets parent index to child value
					index = index*2 + 2; //increment index to location of child bubbled down

				}//end else if

				//else if neither left or right child is less, break loop
				else
					break;

			}//end while
		}//end if

		return removed; 

	}//end method remove

	//@returns true if heap is empty, else returns false 
	public boolean isEmpty(){
		return heap.isEmpty();

	}//end method isEmpty

	//Used for test purposes only to ensure heap values are being pushed/popped	
	//@returns integer number of elements in heap
	public int getSize(){
		return heap.size(); //fix return value

	}//end method isFull









}//end class MinHeap
