package com.capgemini.fms.dao;
import java.io.IOException;
import java.math.BigInteger;
import java.util.List;
import com.capgemini.fms.bean.Flights;
import com.capgemini.fms.exception.ValidateException;
	//Flight Interface
	public interface IFlightDAO {
		 public Flights addFlight(Flights flight);
		 public boolean updateFlight(BigInteger flightId) throws ValidateException, IOException;
		 public Flights viewFlight(BigInteger flightId);
		 public List<Flights> viewFlights();
		 public void deleteFlight(BigInteger flightId);
		
	}


