package com.capgemini.fms.pi;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.List;
import java.util.Scanner;

import com.capgemini.fms.bean.Flights;
import com.capgemini.fms.dao.FlightDAOImpl;
import com.capgemini.fms.exception.ValidateException;
import com.capgemini.fms.service.FlightServiceImpl;

public class MainController {
	 FlightServiceImpl fservice=new FlightServiceImpl();
	 Flights flight=null;
	 InputStreamReader r=new InputStreamReader(System.in);    
	 BufferedReader br=new BufferedReader(r);
	 AirportConsole ac=new AirportConsole();
	 FlightDAOImpl flightDao=new FlightDAOImpl();
	 
	 public void startApplication() throws Exception {
	       int mod=0,choice1 = 0;
	       System.out.println("Enter User Type(1/2): 1. Admin 2. Customer");
	       int user=Integer.parseInt(br.readLine());
	       while(mod!=3) {
	        System.out.println("                            #####SELECT MODULE:######");
	        System.out.println("1.Flights || 2.Airports || 3.Exit");
	        System.out.println("ENTER YOUR CHOICE:");
	        mod=Integer.parseInt(br.readLine());
	        if(mod==1) { //Flights module is selected 
	        	if(user==1) {  //if user type is admin
	     	      while(choice1!=6) {
	     	        System.out.println("1. Add Flight");
	     	        System.out.println("2. Modify Flight");
	     	        System.out.println("3. View Flight");
	     	        System.out.println("4. View Flights");
	     	        System.out.println("5. Delete Flight");
	     	        System.out.println("6. Exit");
	     	        System.out.println();
	     	        System.out.println("1. ENTER YOUR CHOICE:");
	     	        choice1=Integer.parseInt(br.readLine());
	     	        switch(choice1) {
	     	         case 1: //Case 1:To call addFlight
	     	        	flight=validateFlight();
	     	 	        fservice.addFlight(flight);
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
	     	}}
	     	else if(user==2) {
	     		//when user type is Customer
	     		int choice2=0;
	     		while(mod!=3) {
	     		   //mod=Integer.parseInt(br.readLine());
	     		  while(choice2!=3) {
	     			   System.out.println("1. View Flight by Flight Number");
	     	     	   System.out.println("2. View Flights");
	     	     	   System.out.println("3. Exit");
	     	     	   System.out.println();
	     	     	   System.out.println("ENTER YOUR CHOICE:");
	     	     	   choice2=Integer.parseInt(br.readLine());
	     	     	  switch(choice2) {
	     	     	  case 1:
	     	     		  viewFlight();
	     	     		  break;
	     	     	  case 2:
	     	     		  viewFlights();
	     	     		  break;
	     	     	  case 3:
	     	     		 break;
	     	     	  default:
	     	     	  		  System.out.println("INVALID CHOICE......TRY AGAIN!! ");
	     		}}
	     		}}}
	        else if(mod==2) 
	     	    ac.AirportService(br);	
	     	else {
	     		System.out.println("############################################### THANK YOU!! ###########################################");
	     		break;
	     	}
	       }}
	      
//Case 2:To call UpdateFlight
public void updateFlight() throws Exception {
 boolean flag=false;
 System.out.println("Enter Flight Number to update Flight Details:");
    String s=br.readLine();
    BigInteger number=new BigInteger(s.toString());
    List<Flights> lis=viewFlights();
    for (int i=0;i<lis.size();i++) {
       if ((lis.get(i).getFlightNumber()).equals(number)) {
       	 System.out.println("Enter New Details to be Updated:");
         flight=validateFlight();
         flag= fservice.updateFlight(number,flight); 
       }
    }
     if(flag==true)
       	System.out.println("******New Flight Updated!!********");
     else {
       	System.out.println("Sorry,Flight Number does not exists!!");
           System.out.println();
       }
       System.out.println("==========================================================================================================");
    }
//Case 3:To call viewFlight
public Flights viewFlight() throws IOException {

 System.out.println("Enter the flight number to view flight details:");
 String s2=br.readLine();
 BigInteger number = new BigInteger(s2.toString());
// System.out.println(fservice.viewFlights());
 flight = fservice.viewFlight(number);
 if(flight!=null) {
 System.out.println("                      ######### FLIGHT DETAILS ##########");
 System.out.println("Flight Number\t Flight Model\tCarrier Name\tSeating Capacity");
 System.out.println(flight.getFlightNumber()+"\t\t"+flight.getFlightModel()+"\t\t"+flight.getCarrierName()+"\t\t"+flight.getSeatCapacity()); 
 System.out.println();
 System.out.println("==========================================================================================================");
 }
 return flight;
}
//Case 4:To call viewFlights to view list
public List viewFlights() {
 System.out.println("                      ######### FLIGHT DETAILS ##########");
	 List<Flights> lis= fservice.viewFlights();
	 System.out.println("Flight Number\t Flight Model\tCarrier Name\tSeating Capacity");
	 for(Flights fl:lis) {
	   System.out.println(fl.getFlightNumber()+"\t\t"+fl.getFlightModel()+"\t\t"+fl.getCarrierName()+"\t\t"+fl.getSeatCapacity()); 	 
	 }
	 System.out.println();
	 System.out.println("==========================================================================================================");
	return lis;
}
//Case 5:To call deleteFlight to delete flight details
public void deleteFlight() throws IOException {
	 System.out.println("Enter the flight number to delete flight:");
	 String s=br.readLine();
	 BigInteger number = new BigInteger(s.toString());
	 fservice.deleteFlight(number);
	 System.out.println("==========================================================================================================");
	}
//Flight Validation method
public Flights validateFlight() throws ValidateException, IOException {
   	Flights ob=null;
    try {
    	Boolean b=true;
    	Boolean bool = true;
	  System.out.println("Enter Flight number:");
	  String s=br.readLine();
	  BigInteger num = new BigInteger(s.toString());
	   // b= validateFlightNumber(number); 
	    if(!(num.toString().length()!=0 )||!(num.intValue()>=111 && num.intValue()<=999)||(num.intValue()<0))
			bool= ValidateException.flightNumberException(b);
	    else 
	    	bool=true;
		System.out.println("Enter Flight model:");
	    String model=br.readLine();
	    if(!(model.length()!=0 )|| (model.charAt(0)>='0' && model.charAt(0)<='9'))
	     bool=   ValidateException.ModelException(b);
	    else 
	    	bool=true;
	  System.out.println("Enter Carrier name:");
	  String carrier=br.readLine();
	  if(!(carrier.length()!=0))
	      bool=  ValidateException.CarrierException(b);
	  else 
	    	bool=true;
	  System.out.println("Enter Seating Capacity:");
	  int capacity=Integer.parseInt(br.readLine());
	  if(!(capacity>=50 && capacity<=300)|| (capacity<0))
	       bool=  ValidateException.seatingCapacityException(b);
	  else 
	    	bool=true;
	  if((bool==true)) {
	      ob=new Flights(num,model,carrier,capacity);
	   }
    }
    catch(Exception e) {
    	System.out.println(e);
    }
   
	   return ob;
}

public static void main(String[] args) throws Exception {
	   
	   System.out.println("********************************************************************************************************");
	   System.out.println("                              WELCOME TO FLIGHT MANAGEMENT SYSTEM");
	   System.out.println("********************************************************************************************************");
	  
	    MainController main=new MainController();
		main.startApplication();
		
   }
   }
