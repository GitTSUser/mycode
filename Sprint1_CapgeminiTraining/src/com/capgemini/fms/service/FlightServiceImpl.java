package com.capgemini.fms.service;
    import java.io.IOException;
import java.math.BigInteger;
	import java.util.ArrayList;
	import java.util.List;
import com.capgemini.fms.bean.Flights;
import com.capgemini.fms.dao.FlightDAOImpl;
import com.capgemini.fms.dao.IFlightDAO;
import com.capgemini.fms.exception.ValidateException;

public class FlightServiceImpl implements IFlightDAO {
		 List<Flights> flights=new ArrayList<>();
		 FlightDAOImpl flightDao=new FlightDAOImpl();
	   
	   //Adds Flight object to list
	   public Flights addFlight(Flights flight)
	   {
		   if(flightDao.addFlight(flight) != null)
	   			  System.out.println("******Flight added sucessfully!!*****");
	              System.out.println("==========================================================================================================");
				
	      return flight;
	   }
	   //Updates the list
	   public boolean updateFlight(BigInteger flightId) throws ValidateException, IOException 
	   {
		 boolean flag= flightDao.updateFlight(flightId);
		  return flag;
	   }
	   //View the flight details for given Flight Number
	   public Flights viewFlight(BigInteger flightId) 
	   {
		  Flights f=null;
	      f= flightDao.viewFlight(flightId);
		  return f;  
	   }
	   //View list of Flights
	   public List<Flights> viewFlights()
	   {
		    return flightDao.viewFlights();
	   }
	   //Deletes the flight details by given flight number 
	   public void deleteFlight(BigInteger flightId) 
	   {
	       flightDao.deleteFlight(flightId);
	   }
	//For Testing Class
	   public boolean validateFlightNumber(String s) {
		 boolean f=true;
		 BigInteger b=new BigInteger(s);
		 if(!(s.length()!=0 || b.intValue()<=111 || b.intValue()>=999)) 
			 f=false;
		 return f;
	}
	   public boolean validateModel(String model) {
		if(model.length()!=0) 
			 return true;
		 else
			 return false;
	}
	   public boolean validateCarrier(String carrier) {
	 	if(carrier.length()!=0) 
			 return true;
		 else
			 return false;
	}
	   public boolean validateSeats(int seats) {
			if(seats>=50 && seats<=300) 
				 return true;
			 else
				 return false;
		}
	}

	    


	   



