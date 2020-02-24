package FlightMangamentSystem.Flights;
import java.math.BigInteger;
	//class Flights to fetch flight details
	public class Flights {
		  private BigInteger flightNumber;
		  private String flightModel;
		  private String carrierName;
		  private int seatCapacity;
	
      
	public Flights(BigInteger flightNumber, String flightModel, String carrierName, int seatCapacity) {
			super();
			this.flightNumber = flightNumber;
			this.flightModel = flightModel;
			this.carrierName = carrierName;
			this.seatCapacity = seatCapacity;
	}
	public BigInteger getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(BigInteger flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getFlightModel() {
		return flightModel;
	}

	public void setFlightModel(String flightModel) {
		this.flightModel = flightModel;
	}

	public String getCarrierName() {
		return carrierName;
	}

	public void setCarrierName(String carrierName) {
		this.carrierName = carrierName;
	}

	public int getSeatCapacity() {
		return seatCapacity;
	}

	public void setSeatCapacity(int seatCapacity) {
		this.seatCapacity = seatCapacity;
	}


	}




