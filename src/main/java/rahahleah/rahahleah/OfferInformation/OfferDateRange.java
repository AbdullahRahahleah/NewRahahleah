package rahahleah.rahahleah.OfferInformation;
import java.util.List;

public class OfferDateRange {

	private List<String> travelStartDate;
	private List<String> travelEndDate;
	private String lengthOfStay;

	public List<String> getTravelStartDate() {
		return travelStartDate;
	}

	public void setTravelStartDate(List<String> travelStartDate) {
		this.travelStartDate = travelStartDate;
	}

	public List<String> getTravelEndDate() {
		return travelEndDate;
	}

	public void setTravelEndDate(List<String> travelEndDate) {
		this.travelEndDate = travelEndDate;
	}

	public String getLengthOfStay() {
		return lengthOfStay;
	}

	public void setLengthOfStay(String lengthOfStay) {
		this.lengthOfStay = lengthOfStay;
	}

	public OfferDateRange() {
	}
}