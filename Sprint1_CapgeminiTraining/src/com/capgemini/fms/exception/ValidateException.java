package com.capgemini.fms.exception;


import java.math.BigInteger;

public class ValidateException extends Exception {
   public ValidateException() {
	   super();
   }

public static boolean flightNumberException(Boolean b)throws Exception {
	// TODO Auto-generated method stub
	if(b==true)
		throw new Exception("Invalid Flight Number");
	else
		return false;
	 
}

public static boolean ModelException(Boolean b)throws Exception {
	// TODO Auto-generated method stub
	if(b==true)
		throw new Exception("Invalid Model Name");
	else
		return false;
	
}
public static boolean seatingCapacityException(Boolean b) throws Exception {
	// TODO Auto-generated method stub
	if(b==true)
		throw new Exception("Number of seats should be >= fifty and <=300");
	else
		return false;
}

public static boolean CarrierException(Boolean b)throws Exception {
	// TODO Auto-generated method stub
	if(b==true)
		throw new Exception("Invalid Carrier Name");
	else
		return false; 
	// TODO Auto-generated method stub
	
}

public static void AirportException(String code) throws Exception {
	// TODO Auto-generated method stub
	throw new Exception("Invalid Code Entered."); 
	
}


}



