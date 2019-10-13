package br.com.flaviadessoldi.main;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.com.flaviadessoldi.domain.Hotel;
import br.com.flaviadessoldi.utils.DateHelper;
import br.com.flaviadessoldi.utils.FileHelper;
import br.com.flaviadessoldi.utils.PriceCalculator;

public class MainClass {

	public static void main(String[] args) throws IOException {

		List<Hotel> hotels = new ArrayList<Hotel>();
		hotels.add(new Hotel("Lakewood", 3, 110d, 80d, 90d, 80d));
		hotels.add(new Hotel("Bridgewood", 4, 160d, 110d, 60d, 50d));
		hotels.add(new Hotel("Ridgewood", 5, 220d, 100d, 150d, 40d));

		FileHelper fileHelper = new FileHelper();
		String fileContent = FileHelper.readFile("file.txt");

		String clientType = fileHelper.takeClientType(fileContent);
		String inputCheckin = fileHelper.takeCheckinDate(fileContent);
		String inputCheckout = fileHelper.takeCheckoutDate(fileContent);

		DateHelper dateHelper = new DateHelper();
		Date checkinDate = dateHelper.formatDate(inputCheckin);
		Date checkoutDate = dateHelper.formatDate(inputCheckout);

		String bestPrice = PriceCalculator.getBestPriceHotel(clientType, checkinDate, checkoutDate, hotels);
		System.out.println(bestPrice);

	}

}
