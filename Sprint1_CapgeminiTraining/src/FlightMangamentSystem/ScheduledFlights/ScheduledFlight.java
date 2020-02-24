package FlightMangamentSystem.ScheduledFlights;
import FlightMangamentSystem.Flights.Flights;

//class ScheduledFlights to fetch Scheduled Flight details
public class ScheduledFlight {
	private Flights flight;
	 private int availableSeats;
	 private Schedule schedule;
	 
public ScheduledFlight(Flights flight, int availableSeats, Schedule schedule) {
		super();
		this.flight = flight;
		this.availableSeats = availableSeats;
		this.schedule = schedule;
	}

	public Flights getFlight() {
		return flight;
	}

	public void setFlight(Flights flight) {
		this.flight = flight;
	}

	public int getAvailableSeats() {
		return availableSeats;
	}

	public void setAvailableSeats(int availableSeats) {
		this.availableSeats = availableSeats;
	}

	public Schedule getSchedule() {
		return schedule;
	}

	public void setSchedule(Schedule schedule) {
		this.schedule = schedule;
	}
	
	 
}


