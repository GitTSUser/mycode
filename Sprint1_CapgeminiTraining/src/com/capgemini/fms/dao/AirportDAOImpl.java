package com.capgemini.fms.dao;

import java.util.ArrayList;
import java.util.List;

import com.capgemini.fms.bean.Airports;

public class AirportDAOImpl {
	 List<Airports> airports=new ArrayList<>();
	 List<Airports> al;
		public AirportDAOImpl()
		{
			airports.add(new Airports("Chaudhary Charan Singh Airport","LKW","Lucknow"));
			airports.add(new Airports("Indira Gandhi International Airport","DEL","New Delhi"));
			airports.add(new Airports("Cochin International Airport","COK","Cochin"));
			airports.add(new Airports("Bengaluru International Airport","BLR","Bengaluru"));
			
		}
		//Both customer and admin can view airport list
		public List<Airports> viewAirports()
		{
		    return airports;
		}
		//Airport details can be viewed by airport code 
		public Airports viewAirport(String code) 
		{
		    Airports airport=null;
			for(int i=0;i<airports.size();i++) {
		        if ((airports.get(i).getAirportCode()).equals(code)) {
		        	airport = airports.get(i);
		        	break;
		      }
		    // System.out.println(airport);   
		 }
		  return airport;
}
}
