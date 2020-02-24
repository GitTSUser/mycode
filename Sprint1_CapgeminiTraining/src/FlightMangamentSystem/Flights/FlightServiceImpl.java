package FlightMangamentSystem.Flights;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import FlightManagementSystem.FlightConsole;
//import FlightManagementSystem.FlightManagement;
public class FlightServiceImpl  {
	static List<Flights> flights=new ArrayList<>();
	
   public Flights addFlight(Flights flight)
   {
	   flights.add(flight);
	   return flight;
   }
   public Flights updateFlight(int i,Flights flight) {
	   flights.set(i, flight);
	   return flight;
   }
   public Flights viewFlight(BigInteger flightId) {
		// TODO Auto-generated method stub
	      Flights f=null;
		  for (int i=0;i<flights.size();i++) {
	           if ((flights.get(i).getFlightNumber()).equals(flightId)) {
	        	   //System.out.println(flights.get(i));
	               f = flights.get(i);
	        	   break;
	              // break;
	           }
	       }
	       return f;
		
	}
   public List<Flights> viewFlights() {
	   
	
	   return flights;
   }
   public void deleteFlight(BigInteger flightId) {
	   Flights f = null;
	   Boolean flag=false;
	   for (int i=0;i<flights.size();i++) {
           if ((flights.get(i).getFlightNumber()).equals(flightId)) {
        	   flag=true;
               flights.remove(i);
        	   break;
           }
         if(flag==true)
        	 System.out.println("*****Flight removed sucessfully!!******");
         else
        	 System.out.println("Sorry, No such Flight found!!");
       }
   }


   {
	   
   }
}


   

