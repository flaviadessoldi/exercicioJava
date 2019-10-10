package br.com.flaviadessoldi.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.com.flaviadessoldi.domain.Hotel;
import br.com.flaviadessoldi.domain.Price;
import br.com.flaviadessoldi.utils.DateGenerator;
import br.com.flaviadessoldi.utils.PriceCalculator;

public class MainClass {
	
	public static void main(String[] args) {
	
	String clientType = input("Please, tell us, are you a regular or reward client? (regular/reward)");
	String inputCheckin = input("Tell us your checkin date (DD/MM/YYYY)");
	String inputCheckout = input("Now, tell us your checkout date  (DD/MM/YYYY)");

	DateGenerator dateGenerator = new DateGenerator();

	Date checkinDate = dateGenerator.toDate(inputCheckin);
	Date checkoutDate = dateGenerator.toDate(inputCheckout);
	List<Date> bookingDate = dateGenerator.getDates(checkinDate, checkoutDate);

	ArrayList<Hotel> hotels = new ArrayList<Hotel>();
	hotels.add(new Hotel("The Carlyle", 3, 110d, 80d, 90d, 80d));
	hotels.add(new Hotel("The Plaza", 4, 160d, 110d, 60d, 50d));
	hotels.add(new Hotel("Royal Hotel", 5, 220d, 100d, 150d, 40d));
	


	PriceCalculator priceCalculator = new PriceCalculator();
	
	String bestPrice = priceCalculator.getBestPriceHotel(clientType, bookingDate, hotels);
	System.out.println("The best price you got is from: " + bestPrice.getHotel());
	
}

	private static String input(String info) {
	System.out.print(info + " ");
	try {
		BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
		String s = bufferRead.readLine();
		return s;
	} catch (IOException e) {
		e.printStackTrace();
	}
	return null;
}
	
	



}







