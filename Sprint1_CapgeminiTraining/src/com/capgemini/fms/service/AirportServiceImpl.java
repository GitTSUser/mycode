package com.capgemini.fms.service;
	import java.util.ArrayList;
	import java.util.List;

import com.capgemini.fms.bean.Airports;
import com.capgemini.fms.dao.AirportDAOImpl;
import com.capgemini.fms.dao.IAirportDAO;
    
public class AirportServiceImpl implements IAirportDAO
{
        AirportDAOImpl airportDao=new  AirportDAOImpl();
	    List<Airports> airports=new ArrayList<>();
		
		    public List<Airports> viewAirports()
			{
			   return airportDao.viewAirports();
			}
			//Airport details can be viewed by airport code 
			public Airports viewAirport(String code) 
			{
				Airports airport=null;
				airport= airportDao.viewAirport(code);
			  
			return airport;
			}
}



