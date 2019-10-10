package br.com.flaviadessoldi.utils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.com.flaviadessoldi.domain.Hotel;
import br.com.flaviadessoldi.domain.Price;

public class PriceCalculator {
	
	
	
	private Hotel getHotelByName(String name, List<Hotel> hotels) {
		for (Hotel hotel : hotels) {
			if (hotel.getName().equals(name)) {
				return hotel;
			}
		}
		return null;
	}

	public  String getBestPriceHotel (String clientType, Date initialDate, Date finalDate,
		List<Hotel> hotels) {
	
	DateGenerator dateGenerator = new DateGenerator();
	
	List<Date> dates = (ArrayList<Date>)dateGenerator.getDates(initialDate, finalDate);
	
	double lowPrice = 100000;
	String cheapestHotel = null;

	for (Hotel hotel : hotels) {
		int s = 0;
		for (Date date : dates) {
			if (clientType.equals("regular")) {
				if (dateGenerator.isWeekend(date)) {
					s += hotel.getWeekendRegular();
				} else {
					s += hotel.getBusinessDayRegular();
				}
			} else if (clientType.equals("rewards")) {
				if (dateGenerator.isWeekend(date)) {
					s += hotel.getWeekendReward();
				} else {
					s += hotel.getBusinessDayReward();
				}
			}
		}
		
		if (s < lowPrice) {
			lowPrice = s;
			cheapestHotel = hotel.getName();
		} else if (s == lowPrice) {
			if (hotel.getClassification() > getHotelByName(cheapestHotel, hotels).getClassification()) {
				cheapestHotel = hotel.getName();
			}
						
		}
	}
	return cheapestHotel;
}
}