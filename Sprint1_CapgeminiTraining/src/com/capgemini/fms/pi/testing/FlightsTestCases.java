package com.capgemini.fms.pi.testing;
	import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.math.BigInteger;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.*;

import com.capgemini.fms.exception.ValidateException;
import com.capgemini.fms.pi.AirportConsole;
import com.capgemini.fms.pi.MainController;
    import com.capgemini.fms.service.FlightServiceImpl;

	class FlightsTestCases {
		 FlightsTesting ob=new FlightsTesting();
		
		@Before
		 public void setup() {
			//ob=new Main();
		}
		
		@Test
		void checkUserChoice1()
		{
			Assert.assertEquals("Invalid Choice",ob.UserChoice(-1));
		}

		@Test
		void checkUserChoice2()
		{
			Assert.assertEquals("Passed",ob.UserChoice(2));
		}

		@Test
		void checkUserChoice3()
		{
			Assert.assertEquals("Invalid Choice",ob.UserChoice('A'));
		}
	    @Test
		void checkFlight1()
		{
			Assert.assertEquals(true,ob.validateFlightNumber(new BigInteger("101")));
		}
		@Test
		void checkFlight2()
		{
			Assert.assertEquals(false,ob.validateFlightNumber(new BigInteger("1234")));
		}
		
	    @Test
		void checkModel1()
		{
			Assert.assertEquals(true,ob.validateModel("Boeing123"));
		}
	    @Test
		void checkModel2()
		{
	    	Assert.assertEquals(false,ob.validateModel("3456"));
		}
	    @Test
		void checkCarrier1()
		{
	    	Assert.assertEquals(true,ob.validateCarrier("Indigo"));
		}
	    @Test
		void checkCarrier2()
		{
	    	Assert.assertEquals(true,ob.validateCarrier(""));
		}
	    @Test
		void checkSeats()
		{
	    	Assert.assertEquals(true,ob.validateSeats(150));
		}
	    @Test
		void checkSeats2()
		{
	    	Assert.assertEquals(true,ob.validateSeats(30));
		}
	    @Test
	    void checkAirportCode1()
	    {
	    	Assert.assertEquals("Passed",ob.validateAirportCode("DEL"));
	    }
	    @Test
	    void checkAirportCode2()
	    {
	    	Assert.assertEquals("Passed",ob.validateAirportCode("blr"));
	    }
	    @Test
	    void checkAirportCode3()
	    {
	    	Assert.assertEquals("Invalid Code",ob.validateAirportCode("abcd"));
	    }
	    @After
	    public void cleanup() {
	    	ob=null;
	    }
	}

