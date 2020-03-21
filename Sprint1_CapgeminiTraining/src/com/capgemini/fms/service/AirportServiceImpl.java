package com.capgemini.fms.service;
	import java.util.ArrayList;
	import java.util.List;

import com.capgemini.fms.bean.Airports;
import com.capgemini.fms.dao.IAirportDAO;
    public class AirportServiceImpl implements IAirportDAO
	{
		 List<Airports> airports=new ArrayList<>();
		 List<Airports> al;
			public List<Airports> addAirports() 
			{
				airports.add(new Airports("Chaudhary Charan Singh Airport","LKW","Lucknow"));
				airports.add(new Airports("Indira Gandhi International Airport","DEL","New Delhi"));
				airports.add(new Airports("Cochin International Airport","COK","Cochin"));
				airports.add(new Airports("Bengaluru International Airport","BLR","Bengaluru"));
				return airports;
			}
			//Both customer and admin can view airport list
			public List<Airports> viewAirports()
			{
			    al=addAirports();
				return al;
			}
			//Airport details can be viewed by airport code 
			public Airports viewAirport(String code) 
			{
				al=addAirports();
				Airports airport=null;
				for(Airports port:al) {
			        if ((port.getAirportCode()).equals(code)) {
			        	airport = port;
			        	break;
			      }
			 }
			  return airport;
				
			}
	}



