package com.capgemini.fms.pi.testing;
import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.capgemini.fms.pi.testing.FlightsTestCases;
import com.capgemini.fms.dao.testing.FlightDAOImplTest;


@RunWith(Suite.class)

@SuiteClasses({
	FlightsTestCases.class,
	FlightDAOImplTest.class,
})
public class TestSuite {

		public static void main(String[] args) {

			Result results = JUnitCore.runClasses(TestSuite.class);
			
			System.out.println("Test Results:"+results.wasSuccessful());
			
			System.out.println("No.of Failures:"+results.getFailureCount());
			
			
			List<Failure> failures = results.getFailures();
			
			for(Failure f:failures) {
				System.out.println("Failure is:"+f);
			}
			
			
		}
	}



