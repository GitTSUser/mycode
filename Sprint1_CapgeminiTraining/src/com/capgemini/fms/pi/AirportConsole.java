package com.capgemini.fms.pi;
import java.io.BufferedReader;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.capgemini.fms.bean.Airports;
import com.capgemini.fms.exception.ValidateException;
import com.capgemini.fms.service.AirportServiceImpl;

public class AirportConsole {
		AirportServiceImpl aservice=new AirportServiceImpl();
		 Airports port=null;
		
		public void AirportService(BufferedReader br) throws ValidateException, Exception {
			int choice=0;
			while(choice!=3) {
				System.out.println("1. View Airport Details");
				System.out.println("2. View Airports List");
				System.out.println("3. Exit");
				System.out.println();
				System.out.println("ENTER YOUR CHOICE:");
			    choice=Integer.parseInt(br.readLine());
			     switch(choice) {
			     
			     case 1:
			    	 try {
			    	 System.out.println("1. DEL");
			    	 System.out.println("2. LKW");
			    	 System.out.println("3. BLR");
			    	 System.out.println("4. HYD");
			    	 System.out.println("Enter Airport Code from above List:");
			    	 String code = br.readLine();
			    	 if(code.equals("DEL")||code.equals("LKW")||code.equals("BLR")||code.equals("HYD")) {
			    	 System.out.println("                      ######### AIRPORT DETAILS ##########");
			    	 port= aservice.viewAirport(code);
			    	 System.out.println("\tAirportName\tAirportCode\tAirportLocation");
			    	 System.out.println(port.getAirportName()+"\t\t"+port.getAirportCode()+"\t\t"+port.getAirportLocation()); 
			    	 System.out.println("==========================================================================================================");
		
			    	 System.out.println();
			    	 }
			    	 else
			    	   ValidateException.AirportException(code);
			    	 }catch(Exception e) {
			    		 System.out.println(e);
			    	 }
			    	 break;
			     
			     case 2:
			    	 System.out.println("                      ######### AIRPORTS LIST ##########");
			  		 List<Airports> lis= aservice.viewAirports();
			  		 System.out.println("AirportName\t\t\tAirportCode\t\tAirportLocation");
			  		 for(int i=0;i<lis.size();i++)
			  		 {
			  			 System.out.println(lis.get(i).getAirportName()+"\t\t"+lis.get(i).getAirportCode()+"\t\t"+lis.get(i).getAirportLocation());  
			  		 }
			  		System.out.println("==========================================================================================================");
			  		 System.out.println();
			  		 break;
			    
			     case 3:
			    	 break;
			    	 default:
			    		 System.out.println("INVALID CHOICE......TRY AGAIN!!");
			     }
			  		 
			}
		     
		}
	}

			


