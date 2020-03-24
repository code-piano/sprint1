package testing;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.capg.greatoutdoors.controller.test.ControllerTest;
import com.capg.greatoutdoors.dao.test.DaoTest;

@RunWith(Suite.class)

@SuiteClasses({
	ControllerTest.class,
	DaoTest.class
	})

	public class GoTestSuites 
	{

		public static void main(String[] args) 
		{
	
			Result results = JUnitCore.runClasses(GoTestSuites.class);
			
			System.out.println("Test Result:"+results.wasSuccessful());
			
			System.out.println("No.of Failures:"+results.getFailureCount());
			
			
			List<Failure> failures = results.getFailures();
			
			for(Failure f:failures) 
			{
				System.out.println("Failure is:"+f);
			}		
		}

	}
