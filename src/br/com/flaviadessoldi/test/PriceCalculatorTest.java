package br.com.flaviadessoldi.test;

import static org.junit.Assert.assertEquals;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import br.com.flaviadessoldi.domain.Hotel;
import br.com.flaviadessoldi.utils.PriceCalculator;

class PriceCalculatorTest {

	@BeforeEach
	public void setup() {
		PriceCalculator priceCalculator = new PriceCalculator();
	}

	@Test
	public void ifItWorksMustReturnBridgewood() throws ParseException {

		List<Hotel> mockHoteis;

		mockHoteis = new ArrayList<Hotel>();
		mockHoteis.add(new Hotel("Lakewood", 3, 110d, 80d, 90d, 80d));
		mockHoteis.add(new Hotel("Bridgewood", 4, 160d, 110d, 60d, 50d));
		mockHoteis.add(new Hotel("Ridgewood", 5, 220d, 100d, 150d, 40d));

		Date checkinDate = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse("11/10/2019");
		Date checkoutDate = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse("13/10/2019");

		String hotelCorrect = "Bridgewood";

		String client = "regular";

		String result = PriceCalculator.getBestPriceHotel(client, checkinDate, checkoutDate, mockHoteis);

		assertEquals(result, hotelCorrect);
	}

	@Test
	public void ifItWorksMustReturnRidgewood() throws ParseException {

		List<Hotel> mockHoteis= new ArrayList<Hotel>();
		mockHoteis.add(new Hotel("Lakewood", 3, 110d, 80d, 90d, 80d));
		mockHoteis.add(new Hotel("Bridgewood", 4, 160d, 110d, 60d, 50d));
		mockHoteis.add(new Hotel("Ridgewood", 5, 220d, 100d, 150d, 40d));

		Date checkinDate = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse("11/10/2019");
		Date checkoutDate = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse("13/10/2019");

		String hotelCorrect = "Ridgewood";

		String client = "reward";

		String result = PriceCalculator.getBestPriceHotel(client, checkinDate, checkoutDate, mockHoteis);

		assertEquals(result, hotelCorrect);
	}

}
