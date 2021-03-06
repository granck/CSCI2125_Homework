import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class JunitRunner{
	
	public static void main(String[] args){
		Result result = JUnitCore.runClasses(UnboundedPriorityQueueTest.class);
		for(Failure fail : result.getFailures()){
			System.out.println(fail.toString());
		}//end for

		if(result.wasSuccessful())
			System.out.println("All tests finished successfully.");

	}//end main method

}//end class JunitRunner
