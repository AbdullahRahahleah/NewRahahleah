package rahahleah.rahahleah.HotelInformation;
import rahahleah.rahahleah.OfferInformation.Destination;
import rahahleah.rahahleah.OfferInformation.OfferDateRange;
/*
 * This class to get full hotel information, it has some children like OfferDateRange,HotelUrgencyInfo,Destination ..etc
 *
 * Here we define getter and setter for each local variable to let the JSON define it's value and let the JSP to display it's value
 */
public class Hotel {
	private OfferDateRange offerDateRange;
	private HotelUrgencyInfo hotelUrgencyInfo;
	private Destination destination;
	private HotelInfo hotelInfo;
	private HotelPricingInfo hotelPricingInfo;
	private HotelUrls hotelUrls;
	private HotelScores hotelScores;
	
	public OfferDateRange getOfferDateRange() {
		return offerDateRange;
	}

	public void setOfferDateRange(OfferDateRange offerDateRange) {
		this.offerDateRange = offerDateRange;
	}

	public HotelUrgencyInfo getHotelUrgencyInfo() {
		return hotelUrgencyInfo;
	}

	public void setHotelUrgencyInfo(HotelUrgencyInfo hotelUrgencyInfo) {
		this.hotelUrgencyInfo = hotelUrgencyInfo;
	}

	public Destination getDestination() {
		return destination;
	}

	public void setDestination(Destination destination) {
		this.destination = destination;
	}

	public HotelInfo getHotelInfo() {
		return hotelInfo;
	}

	public void setHotelInfo(HotelInfo hotelInfo) {
		this.hotelInfo = hotelInfo;
	}

	public HotelPricingInfo getHotelPricingInfo() {
		return hotelPricingInfo;
	}

	public void setHotelPricingInfo(HotelPricingInfo hotelPricingInfo) {
		this.hotelPricingInfo = hotelPricingInfo;
	}

	public HotelUrls getHotelUrls() {
		return hotelUrls;
	}

	public void setHotelUrls(HotelUrls hotelUrls) {
		this.hotelUrls = hotelUrls;
	}

	public HotelScores getHotelScores() {
		return hotelScores;
	}

	public void setHotelScores(HotelScores hotelScores) {
		this.hotelScores = hotelScores;
	}
	public Hotel() {
	}
}