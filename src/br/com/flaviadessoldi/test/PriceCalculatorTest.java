package br.com.flaviadessoldi.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;

import br.com.flaviadessoldi.domain.Price;
import br.com.flaviadessoldi.utils.PriceCalculator;

class PriceCalculatorTest {

	@Test
		public void mustReturnRoyalHotel() throws ParseException {

			List<Date> dates = new ArrayList<Date>();
			dates.add(new SimpleDateFormat("dd/MM/yyyy").parse("12/10/2019"));
			dates.add(new SimpleDateFormat("dd/MM/yyyy").parse("13/10/2019"));
			dates.add(new SimpleDateFormat("dd/MM/yyyy").parse("14/10/2019"));

			Price priceCorrect = Price(mockHoteis.get(1), 280d);
			
			PriceCalculator priceCalculator = new PriceCalculator();
			
			String client = "regular";

			assertThat(priceCalculator.getBestPriceHotel(client, dates, mockHoteis), is(priceCorrect));
		}
	}

}
