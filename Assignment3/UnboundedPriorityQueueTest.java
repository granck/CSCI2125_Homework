import org.junit.Test;
import static org.junit.Assert.*;

public class UnboundedPriorityQueueTest{
	
	@Test
	public void TestEmptyQueueIsEmpty(){
		UnboundedPriorityQueue<Task> taskQueue = new UnboundedPriorityQueue<Task>();
		assertEquals(true, taskQueue.isEmpty());
		assertEquals(0, taskQueue.getSize());
	
	}//end method TestEmptyQueueIsEmpty
	@Test
	public void TestPushWithEmptyQueue(){
		Task task1 = new Task("Task1", 1230, 20);
		UnboundedPriorityQueue<Task> taskQueue = new UnboundedPriorityQueue<Task>();

		taskQueue.enqueue(task1);
		assertEquals(false, taskQueue.isEmpty());
		assertEquals(1, taskQueue.getSize());

	}//end method TestPushWithEmptyQueue

	@Test
	public void TestPushWithNonEmptyQueue(){
		Task task1 = new Task("Task1", 1230, 20);
		Task task2 = new Task("Task2", 1330, 10);
		UnboundedPriorityQueue<Task> taskQueue = new UnboundedPriorityQueue<Task>();

		taskQueue.enqueue(task1);
		assertEquals(false, taskQueue.isEmpty());
		assertEquals(1, taskQueue.getSize());

		taskQueue.enqueue(task2);
		assertEquals(false, taskQueue.isEmpty());
		assertEquals(2, taskQueue.getSize());
		
	}//end method TestPushWithNonEmptyQueue

	@Test
	public void TestPushWithValueAlreadyInQueue(){
		Task task1 = new Task("Task1", 1330, 10);
		Task task2 = new Task("Task2", 1330, 10);
		UnboundedPriorityQueue<Task> taskQueue = new UnboundedPriorityQueue<Task>();

		taskQueue.enqueue(task1);
		assertEquals(false, taskQueue.isEmpty());
		assertEquals(1, taskQueue.getSize());

		taskQueue.enqueue(task2);
		assertEquals(false, taskQueue.isEmpty());
		assertEquals(2, taskQueue.getSize());

	}//end method TestPushWithValueAlreadyInQueue

	@Test
	public void TestPopWithEmptyQueue(){
		UnboundedPriorityQueue<Task> taskQueue = new UnboundedPriorityQueue<Task>();
		assertEquals(null, taskQueue.dequeue());

	}//end method TestPopWithEmptyQueue

	@Test
	public void TestPopWithNonEmptyQueue(){
		Task task1 = new Task("Task1", 1330, 10);
		UnboundedPriorityQueue<Task> taskQueue = new UnboundedPriorityQueue<Task>();

		taskQueue.enqueue(task1);
		assertEquals("Task1", taskQueue.dequeue());
	
	}//end method TestPopWithNonEmptyQueue

	@Test
	public void TestPopBeforeAndAfterEmptyQueue(){
		Task task1 = new Task("Task1", 1330, 10);
		UnboundedPriorityQueue<Task> taskQueue = new UnboundedPriorityQueue<Task>();

		taskQueue.enqueue(task1);
		assertEquals("Task1", taskQueue.dequeue());
		assertEquals(null, taskQueue.dequeue());

	}//end method TestPopBeforeAndAfterEmptyQueue



}//end UnboundedPriorityQueueTest class
