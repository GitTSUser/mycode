package com.capgemini.fms.dao.testing;
import java.io.IOException;
import java.math.BigInteger;
import java.util.List;

import org.junit.After;
	import org.junit.Assert;
	import org.junit.Before;
	import org.junit.jupiter.api.*;

import com.capgemini.fms.bean.Flights;
import com.capgemini.fms.dao.FlightDAOImpl;
import com.capgemini.fms.exception.ValidateException;

	    public class FlightDAOImplTest {
			FlightsDaoImplTesting test=new FlightsDaoImplTesting();
			
			@Before
			public void setup() {
				//new FlightDAOImpl();
			}
			@Test
			void checkFlights1() throws ValidateException, IOException
			{
				BigInteger b=new BigInteger("101");
				Assert.assertEquals("New Flight updated",test.displayFlightNumbers(b));
			}
			@Test
			void checkFlights2() throws ValidateException, IOException
			{
				BigInteger b=new BigInteger("121");
				Assert.assertEquals("Sorry, Flight number does not exist",test.displayFlightNumbers(b));
			}
			@Test
			void checkFlights3() throws ValidateException, IOException
			{
				BigInteger b=new BigInteger("103");
				Assert.assertEquals("Sorry, Flight number does not exist",test.displayFlightNumbers(b));
			}
			
}

	    