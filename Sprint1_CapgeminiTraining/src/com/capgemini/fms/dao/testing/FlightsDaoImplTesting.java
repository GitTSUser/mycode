package com.capgemini.fms.dao.testing;

import java.math.BigInteger;
import java.util.List;

import com.capgemini.fms.bean.Flights;
import com.capgemini.fms.dao.FlightDAOImpl;

public class FlightsDaoImplTesting {
	 BigInteger brr[]= {new BigInteger("101"),new BigInteger("102"),new BigInteger("103")};
	 
	 public String displayFlightNumbers(BigInteger b)
	 {      String st="";
	    for(int i=0;i<brr.length;i++) {
	    	if(brr[i].equals(b))
				   st= "New Flight Updated";
				else
				   st="Sorry, Flight Number does not exists";
		        break;
	    }
		   return st;	
	 }
}
