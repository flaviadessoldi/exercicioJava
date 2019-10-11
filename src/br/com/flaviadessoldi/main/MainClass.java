package br.com.flaviadessoldi.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.com.flaviadessoldi.domain.Hotel;
import br.com.flaviadessoldi.utils.DateGenerator;
import br.com.flaviadessoldi.utils.PriceCalculator;

public class MainClass {
	
	public static void main(String[] args) {

		List<Hotel> hotels = new ArrayList<Hotel>();
		hotels.add(new Hotel("Lakewood", 3, 110d, 80d, 90d, 80d));
		hotels.add(new Hotel("Bridgewood", 4, 160d, 110d, 60d, 50d));
		hotels.add(new Hotel("Ridgewood", 5, 220d, 100d, 150d, 40d));

		String clientType = userInput("Please, tell us, are you a regular or reward client? (regular/reward)");
		String inputCheckin = userInput("Tell us your checkin date (DD/MM/YYYY)");
		String inputCheckout = userInput("Now, tell us your checkout date  (DD/MM/YYYY)");

		DateGenerator dateGenerator = new DateGenerator();
		Date checkinDate = dateGenerator.formatDate(inputCheckin);
		Date checkoutDate = dateGenerator.formatDate(inputCheckout);

		PriceCalculator priceCalculator = new PriceCalculator();
		String bestPrice = PriceCalculator.getBestPriceHotel(clientType, checkinDate, checkoutDate, hotels);
		System.out.println("The best rate you got on these dates was at: " + bestPrice);

	}

	private static String userInput(String info) {
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
