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
			// FlightDAOImpl flightDao=new FlightDAOImpl();
			 
		   public List<Flights> FlightDetails() 
		   {
			 flights.add(new Flights(new BigInteger("101"),"Boeing 123","Air India",250));
		     flights.add(new Flights(new BigInteger("123"),"AirBus 770","Indigo",200));
		     return flights;
		   }
			//Adds Flight object to list
		   public Flights addFlight(Flights flight)
		   {
			   //FlightDetails();
			   flights.add(flight);
			   
			   return flight;
		   }
		   //Updates the list
		   public boolean updateFlight(BigInteger number) throws ValidateException, IOException 
		   {
			   Boolean flag=true;
			  // FlightDetails();
			   Flights flight=null;
			   List<Flights> lis=viewFlights();
			    for (int i=0;i<lis.size();i++) {
			       if ((lis.get(i).getFlightNumber()).equals(number)) {
			       	System.out.println("Enter New Details to be Updated:");
			       	System.out.println("Enter the Model:");
			       	//	flight=control.validateFlight();
			         flights.set(i, flight);
			         flag=true;
			         break;
			        }}
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
			          else {
			        	  f=null;
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
		        	System.out.println("Sorry, No such Flight found!!");
		   }
		
}
		   




