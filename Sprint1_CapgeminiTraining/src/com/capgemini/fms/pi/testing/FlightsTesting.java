package com.capgemini.fms.pi.testing;

import java.math.BigInteger;

public class FlightsTesting {
	
	
	public String UserChoice(int ch) {
		String st;
        if(ch==1 ||ch==2||ch==3 ||ch==4||ch==5||ch==6) 
    		st="Passed";
    	else
    	    st="Invalid Choice";
        return st;
    }
	public boolean validateFlightNumber(BigInteger b)  {
	 boolean flag=true;
	 String st;
	 if(!(b.toString().length()!=0 )||!(b.intValue()>=111 && b.intValue()<=999)||!(b.intValue()<0))
		flag=false;
	 
	 return flag;
	}
	 
  public boolean validateModel(String model) {
	   boolean flag=true;
	   if(!(model.length()!=0 )|| (model.charAt(0)>='0' && model.charAt(0)<='9'))
	     flag=false;
       
	return flag;
 }
  public boolean validateCarrier(String carrier) {
	  boolean flag=true;
    if(carrier.length()!=0) 
		 flag=false;
    
    return flag; 
	
 }
  public boolean validateSeats(int seats) {
	  boolean flag=true;
	  if(!(seats>=50 && seats<=300)|| (seats<0)) 
			 flag=false;
		 
	return flag;
	}
  public String validateAirportCode(String code) {
	  String st;
	  if(code.equals("DEL")||code.equals("LKW")||code.equals("BLR")||code.equals("HYD")) 
  		st="Passed";
  	else
  	    st="Invalid Code";
      return st;
  }
}
