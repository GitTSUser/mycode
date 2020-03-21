package com.capgemini.fms.service;

import java.util.List;

import com.capgemini.fms.bean.Airports;

public interface IAirportService {
	public List<Airports> addAirports();
	public List<Airports> viewAirports();
	public Airports viewAirport(String code);
}

