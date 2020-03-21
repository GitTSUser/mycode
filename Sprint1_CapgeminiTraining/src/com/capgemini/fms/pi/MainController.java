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
	       flightDao.FlightDetails();
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
 boolean flag;
 System.out.println("Enter Flight Number to update Flight Details:");
    String s=br.readLine();
    BigInteger number=new BigInteger(s.toString());
    flag= fservice.updateFlight(number); 
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
 flight= fservice.viewFlight(number);
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
    	Boolean b=false;
	  System.out.println("Enter Flight number:");
	  String s=br.readLine();
	  BigInteger number = new BigInteger(s.toString());
	    b= validateFlightNumber(number);  //ValidateException.flightNumberException(number);  
	  System.out.println("Enter Flight model:");
	  String model=br.readLine();
	     b=   ValidateException.ModelException(model);
	  System.out.println("Enter Carrier name:");
	  String carrier=br.readLine();
	      b=  ValidateException.CarrierException(carrier);
	  System.out.println("Enter Seating Capacity:");
	  int capacity=Integer.parseInt(br.readLine());
	       b=  ValidateException.seatingCapacityException(capacity);
	  if(b==true) {
	      ob=new Flights(number,model,carrier,capacity);}
    }
    catch(Exception e) {
    	System.out.println(e);
    }
   
	   return ob;
}
//For Testing Class
  public boolean validateFlightNumber(BigInteger b) throws Exception  {
	 boolean f=true;
	 String st;
	 
	 if(!(b.toString().length()!=0 || b.intValue()<=111 || b.intValue()>=999||!(b.intValue()<0))) 
		  ValidateException.flightNumberException();
	 else
		 f=false;
	 return f;
}
  public boolean validateModel(String model) {
	   boolean flag=true;
	   for(int i=0;i<model.length();i++)
	   {
		   if((model.charAt(i)>='0' && model.charAt(i)<='9') && !(model.charAt(i)>='A' && model.charAt(i)<='Z') ||!(model.charAt(i)>='a' && model.charAt(i)<='a'))
			   flag=false;
	   }
	if(model.length()!=0 || flag==true) 
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




public static void main(String[] args) throws Exception {
	   
	   System.out.println("********************************************************************************************************");
	   System.out.println("                              WELCOME TO FLIGHT MANAGEMENT SYSTEM");
	   System.out.println("********************************************************************************************************");
	  
	    MainController main=new MainController();
		main.startApplication();
		
   }
   }
