package com.capgemini.fms.exception;


import java.math.BigInteger;

public class ValidateException extends Exception {
   public ValidateException() {
	   super();
   }

public static void flightNumberException()throws Exception {
	// TODO Auto-generated method stub
	System.out.println("Invalid Flight Number");
	 
}

public static boolean ModelException(String model)throws Exception {
	// TODO Auto-generated method stub
	if(model.length()==0)
		throw new Exception("Invalid Model Name");
	else
		return true;
	
}
public static boolean seatingCapacityException(int seats) throws Exception {
	// TODO Auto-generated method stub
	if(seats<=50 || seats>=300)
		throw new Exception("Number of seats should be >= fifty and <=300");
	else
		return true;
}

public static boolean CarrierException(String carrier)throws Exception {
	// TODO Auto-generated method stub
	if(carrier.length()==0)
		throw new Exception("Invalid Carrier Name");
	else
		return true; 
	// TODO Auto-generated method stub
	
}

public static void AirportException(String code) throws Exception {
	// TODO Auto-generated method stub
	throw new Exception("Invalid Code Entered."); 
	
}


}



