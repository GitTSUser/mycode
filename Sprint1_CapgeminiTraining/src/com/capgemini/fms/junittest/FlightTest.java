/*package com.capgemini.fms.junittest;
	import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.*;
    import com.capgemini.fms.pi.MainController;
    import com.capgemini.fms.service.FlightServiceImpl;

	class FlightTest {
		 MainController ob=new MainController();
		@Before
		 public void setup() {
			//ob=new Main();
		}
		@Test
		void checkFlight1()
		{
			Assert.assertEquals(true,ob.validateFlight.("234"));
		}
		@Test
		void checkFlight2()
		{
			Assert.assertEquals(true,ob.validateFlightNumber("-123"));
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
		void checkCarrier()
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
	    @After
	    public void cleanup() {
	    	ob=null;
	    }
	}

*/