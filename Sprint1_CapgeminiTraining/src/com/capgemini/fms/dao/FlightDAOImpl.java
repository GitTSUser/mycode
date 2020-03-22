package com.capgemini.fms.dao;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import com.capgemini.fms.bean.Flights;
import com.capgemini.fms.dao.IFlightDAO;
import com.capgemini.fms.exception.ValidateException;
import com.capgemini.fms.pi.MainController;

public class FlightDAOImpl implements IFlightDAO {
	        // MainController control=new  MainController();
			 List<Flights> flights=new ArrayList<>();
			 
			 
		   public FlightDAOImpl()
		   {
			 flights.add(new Flights(new BigInteger("101"),"Boeing 123","Air India",250));
		     flights.add(new Flights(new BigInteger("102"),"AirBus 770","Indigo",200));
		     flights.add(new Flights(new BigInteger("103"),"Boeing 101","Jet Airways",150));
		     
		   }
			//Adds Flight object to list
		   public Flights addFlight(Flights flight)
		   {
			   //FlightDetails();
			   flights.add(flight);
			   
			   return flight;
		   }
		   //Updates the list
		   public boolean updateFlight(BigInteger number,Flights flight) throws ValidateException, IOException 
		   {
			  boolean flag=false;
			  for(int i=0;i<flights.size();i++) {
				 if(flights.get(i).getFlightNumber().equals(number)) {
			      flights.set(i, flight);
			      flag=true;
			      break;
				 }
			  }
			 
			 return flag;
			}
		   //View the flight details for given Flight Number
		   public Flights viewFlight(BigInteger flightId) 
		   {   Boolean flag=false;
			   Flights f=null;
			   //FlightDetails();
				 for (int i=0;i<flights.size();i++) {
			          if ((flights.get(i).getFlightNumber()).equals(flightId)) {
			        	  f = flights.get(i);
			        	  flag=true;
			        	   break;
			           }
			     }
				 if(flag==false)
					 System.out.println("Sorry, Flight number does not exist");
			     return f;
		   }
		   //View list of Flights
		   public List<Flights> viewFlights()
		   {
			  //FlightDetails();
			  return flights;
		   }
		   //Deletes the flight details by given flight number 
		   public void deleteFlight(BigInteger flightId) 
		   {
			   Flights f = null;
		       //FlightDetails();
			   Boolean flag=false;
			   for (int i=0;i<flights.size();i++) {
		           if ((flights.get(i).getFlightNumber()).equals(flightId)) {
		        	   flag=true;
		               flights.remove(i);
		        	   break;
		           }
			   }
		        if(flag==true)
		        	System.out.println("*****Flight removed sucessfully!!******");
		        else
		        	System.out.println("Sorry, No such Flight exists!!");
		   }
		
}
		   




