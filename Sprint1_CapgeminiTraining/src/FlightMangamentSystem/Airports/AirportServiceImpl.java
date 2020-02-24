package FlightMangamentSystem.Airports;

import java.util.ArrayList;
import java.util.List;

import FlightMangamentSystem.Flights.Flights;
import FlightMangamentSystem.Airports.AirportConsole;
import FlightMangamentSystem.Airports.Airport;
public class AirportServiceImpl {
	//Admin can add new airports
	 static List<Airport> airports=new ArrayList<>();
	 List<Airport> al;
		public List<Airport> addAirports() {
		
			airports.add(new Airport("Chaudhary Charan Singh Airport","LKW","Lucknow"));
			airports.add(new Airport("Indira Gandhi Airport","DEL","New Delhi"));
			airports.add(new Airport("Rajiv Gandhi International Airport","HYD","Hyderabad"));
			airports.add(new Airport("Bengaluru International Airport","BLR","Bengaluru"));
			return airports;
		}
		//Both customer and admin can view airport list
		public List<Airport> viewAirports(){
			 al=addAirports();
			return al;
		}
		//Airport details can be viewed by airport code 
		public Airport viewAirport(String code) {
			 al=addAirports();
			 Airport airport=null;
			  for (int i=0;i<al.size();i++) {
		           if ((al.get(i).getAirportCode()).equals(code)) {
		        	   //System.out.println(flights.get(i));
		               airport = al.get(i);
		        	   break;
		              // break;
		           }
		       }
		       return airport;
			
		}
	}


