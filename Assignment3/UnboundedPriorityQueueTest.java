import org.junit.Test;
import static org.junit.Assert.*;

public class UnboundPriorityQueueTest{
	
	@Test
	public void TestEmptyQueueIsEmpty(){
		UnboundPriorityQueue<Task> taskQueue = new UnboundPriorityQueue<Task>();
		AssertEquals(true, taskQueue.isEmpty());
		AssertEquals(0, taskQueue.getSize());
	
	}//end method TestEmptyQueueIsEmpty
	@Test
	public void TestPushWithEmptyQueue(){
		Task task1 = new Task("Task1", 1230, 20);
		UnboundPriorityQueue<Task> taskQueue = new UnboundPriorityQueue<Task>();

		taskQueue.enqueue(task1);
		AssertEquals(false, taskQueue.isEmpty());
		AssertEquals(1, taskQueue.getSize());

	}//end method TestPushWithEmptyQueue

	@Test
	public void TestPushWithNonEmptyQueue(){
		Task task1 = new Task("Task1", 1230, 20);
		Task task2 = new Task("Task2", 1330, 10);
		UnboundPriorityQueue<Task> taskQueue = new UnboundPriorityQueue<Task>();

		taskQueue.enqueue(task1);
		AssertEquals(false, taskQueue.isEmpty());
		AssertEquals(1, taskQueue.getSize());

		taskQueue.enqueue(task2);
		AssertEquals(false, taskQueue.isEmpty());
		AssertEquals(2, taskQueue.getSize());
		
	}//end method TestPushWithNonEmptyQueue

	@Test
	public void TestPushWithValueAlreadyInQueue(){
		Task task1 = new Task("Task1", 1330, 10);
		Task task2 = new Task("Task2", 1330, 10);
		UnboundPriorityQueue<Task> taskQueue = new UnboundPriorityQueue<Task>();

		taskQueue.enqueue(task1);
		AssertEquals(false, taskQueue.isEmpty());
		AssertEquals(1, taskQueue.getSize());

		taskQueue.enqueue(task2);
		AssertEquals(false, taskQueue.isEmpty());
		AssertEquals(2, taskQueue.getSize());

	}//end method TestPushWithValueAlreadyInQueue

	@Test
	public void TestPopWithEmptyQueue(){
		UnboundPriorityQueue<Task> taskQueue = new UnboundPriorityQueue<Task>();
		AssertEquals(null, taskQueue.dequeue());

	}//end method TestPopWithEmptyQueue

	@Test
	public void TestPopWithNonEmptyQueue(){
		Task task1 = new Task("Task1", 1330, 10);
		UnboundPriorityQueue<Task> taskQueue = new UnboundPriorityQueue<Task>();

		taskQueue.enqueue(task1);
		AssertEquals("Task1", taskQueue.dequeue());
	
	}//end method TestPopWithNonEmptyQueue

	@Test
	public void TestPopBeforeAndAfterEmptyQueue(){
		Task task1 = new Task("Task1", 1330, 10);
		UnboundPriorityQueue<Task> taskQueue = new UnboundPriorityQueue<Task>();

		taskQueue.enqueue(task1);
		AssertEquals("Task1", taskQueue.dequeue());
		AssertEquals(null, taskQueue.dequeue());
			

	}//end method TestPopBeforeAndAfterEmptyQueue



//end UnboundPriorityQueueTest class
