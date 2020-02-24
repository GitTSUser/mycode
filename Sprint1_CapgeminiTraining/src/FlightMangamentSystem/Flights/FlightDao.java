package FlightMangamentSystem.Flights;

import java.math.BigInteger;
import java.util.List;

public interface FlightDao {
	 public Flights addFlight(Flights flight);
	 public Flights updateFlight(int i,Flights flight);
	 public Flights viewFlight(BigInteger flightId);
	 public List<Flights> viewFlights();
	 public void deleteFlight(BigInteger flightId);
	 public void validateFlight(Flights f);
}
