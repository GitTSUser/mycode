package FlightManagementSystem;

import java.math.BigInteger;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import FlightMangamentSystem.Airports.AirportConsole;
import FlightMangamentSystem.Flights.FlightServiceImpl;
import FlightMangamentSystem.Flights.Flights;

public class FlightConsole {
	static FlightServiceImpl fservice=new FlightServiceImpl();
	Flights flight=null;
	 Scanner sc=new Scanner(System.in);
	AirportConsole ac=new AirportConsole();
	
 public void startApplication() {
    int mod=0,choice1 = 0;
    System.out.println("Enter User Type(1/2): 1. Admin 2. Customer");
    int user=sc.nextInt();
    if(user==1) {
    System.out.println("                            #####SELECT MODULE:######");
    while(mod!=4) {
    System.out.println("1.Flights || 2.Scheduled Flights || 3.Airport || 4.Exit");
    System.out.println("ENTER YOUR CHOICE:");
    mod=sc.nextInt();
     if(mod==1) {
     	while(choice1!=6) {
     	   System.out.println("1. Add Flight");
     	   System.out.println("2. Modify Flight");
     	   System.out.println("3. View Flight");
     	   System.out.println("4. View Flights");
     	   System.out.println("5. Delete Flight");
     	   System.out.println("6. Exit");
     	   System.out.println();
     	   System.out.println("1. ENTER YOUR CHOICE:");
     	   choice1=sc.nextInt();
     	  switch(choice1) {
     	  case 1:
     		  addFlight();
     		  break;
     	  case 2:
     		  updateFlight();
     		  break;
     	  case 3:
     		  viewFlight();
     		  break;
     	  case 4:
     		  viewFlights();
     		  break;
     	  case 5:
     		  deleteFlight();
     		  break;
     	  case 6:
     		  break;
     	  default:
     		  System.out.println("INVALID CHOICE......TRY AGAIN!! ");
     	  }
     	}	 
     	}
        else if(mod==2) {
    	  //sc.scheduledFlightservice(); 
        }
     	else if(mod==3) {
     	  ac.AirportService(sc);	
     	}
     	else
     		break;
        
     }}}
 
      public void addFlight() {//throws InputMismatchException {
     	  System.out.println("Enter Flight number:");
   		  BigInteger number = sc.nextBigInteger();
   		  System.out.println("Enter Flight model:");
   		  String model=sc.next();
   		  System.out.println("Enter Carrier name:");
   		  String carrier=sc.next();
   		  System.out.println("Enter Seating Capacity:");
   		  int capacity=(int)sc.nextInt();
   		  //validateFlight(number,model,carrier,capacity);
   		  flight=new Flights(number,model,carrier,capacity);
   		  if(fservice.addFlight(flight) != null)
   			  System.out.println("******Flight added sucessfully!!*****");
     	}
       public void updateFlight() {
    	   
       }
       public void viewFlight() {
    	 System.out.println("Enter the flight number to view flight details:");
    	 BigInteger number = sc.nextBigInteger();
    	 System.out.println("                      ######### FLIGHT DETAILS ##########");
    	 Flights fs= fservice.viewFlight(number);
    	 System.out.println("Flight Number\t Flight Model\tCarrier Name\tSeating Capacity");
    	 System.out.println(fs.getFlightNumber()+"\t\t"+flight.getFlightModel()+"\t\t"+flight.getCarrierName()+"\t\t"+flight.getSeatCapacity()); 
    	 System.out.println();
       }
       
       public void viewFlights() {
    	 System.out.println("                      ######### FLIGHT DETAILS ##########");
  		 List<Flights> lis= fservice.viewFlights();
  		 System.out.println("Flight Number\t Flight Model\tCarrier Name\tSeating Capacity");
  		 for(int i=0;i<lis.size();i++)
  		 {
  		   System.out.println(flight.getFlightNumber()+"\t\t"+flight.getFlightModel()+"\t\t"+flight.getCarrierName()+"\t\t"+flight.getSeatCapacity()); 	 
  		 }
  		 System.out.println();
       }
       
       public void deleteFlight() {
      	 System.out.println("Enter the flight number to delete flight:");
      	 BigInteger number = sc.nextBigInteger();
      	 System.out.println("                      ######### FLIGHT DETAILS ##########");
      	 fservice.deleteFlight(number);
      	 }
       
       public void validateFlight(int number,String model,String carrier,int capacity) {
    	  try {
    		  if(number>=0 && number<=999) {
    			  
    			  
    		  }
    	  }finally {
       }
       }
}
    





