package FlightMangamentSystem.Airports;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import FlightMangamentSystem.Flights.Flights;
import FlightMangamentSystem.Airports.Airport;
import FlightMangamentSystem.Airports.AirportServiceImpl;


public class AirportConsole {
	AirportServiceImpl as=new AirportServiceImpl();
	
	public void AirportService(Scanner in) {
		int choice=0;
		while(choice!=4) {
			System.out.println("1. Add Airport");
			System.out.println("2. View Airport Details");
			System.out.println("3. View Airports List");
			System.out.println("4. Exit");
			System.out.println();
			System.out.println("ENTER YOUR CHOICE:");
		    choice=in.nextInt();
		     switch(choice) {
		     case 1:
		    	 System.out.println("Enter Airport name:");
		    	 String airportName=in.next();
		    	 System.out.println("Enter Airport code:");
                 String airportCode=in.next();
                 System.out.println("Enter Airport location:");
                 String loc=in.next();
                 as.addAirports();
                 break;
		     case 2:
		    	 System.out.println("Enter the Airport Code to view details:");
		    	 String code = in.next();
		    	 System.out.println("                      ######### AIRPORT DETAILS ##########");
		    	 Airport port= as.viewAirport(code);
		    	 System.out.println("\tAirportName\tAirportCode\tAirportLocation");
		    	 System.out.println(port.getAirportName()+"\t\t"+port.getAirportCode()+"\t\t"+port.getAirportLocation()); 
		    	 System.out.println();
		    	 break;
		     case 3:
		    	 System.out.println("                      ######### AIRPORTS LIST ##########");
		  		 List<Airport> lis= as.viewAirports();
		  		 System.out.println("AirportName\tAirportCode\tAirportLocation");
		  		 for(int i=0;i<lis.size();i++)
		  		 {
		  			 System.out.println(lis.get(i).getAirportName()+"\t\t"+lis.get(i).getAirportCode()+"\t\t"+lis.get(i).getAirportLocation());  
		  		 }
		  		 System.out.println();
		  		 break;
		     case 4:
		    	 break;
		    	 default:
		    		 System.out.println("INVALID CHOICE......TRY AGAIN!!");
		     }
		  		 
		}
	     
	}
}

		
