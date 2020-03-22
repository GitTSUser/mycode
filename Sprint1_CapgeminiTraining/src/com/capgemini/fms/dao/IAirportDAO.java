package com.capgemini.fms.dao;
import java.util.List;

import com.capgemini.fms.bean.Airports;
public interface IAirportDAO {
		
		public List<Airports> viewAirports();
		public Airports viewAirport(String code);
	}


