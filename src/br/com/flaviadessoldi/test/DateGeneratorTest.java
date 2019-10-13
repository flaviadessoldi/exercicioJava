package br.com.flaviadessoldi.test;

import static org.junit.jupiter.api.Assertions.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import org.junit.jupiter.api.Test;
import br.com.flaviadessoldi.utils.DateGenerator;

/**
 * Class responsible for testing the methods of the class DateGenerator.
 * 
 * @author Flavia Giovana Dessoldi
 */

class DateGeneratorTest {
	
	DateGenerator dateGenerator = new DateGenerator();

	@Test
	public void mustReturnTrueIfItsWeekend() throws Exception {
		
		Date date = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH).parse("12/10/2019");
		assertTrue(dateGenerator.isWeekend(date));
	}
	
	@Test
	public void mustReturnFalseIfItsBusinessDay() throws Exception {
		
		Date date = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH).parse("15/10/2019");
		assertFalse(dateGenerator.isWeekend(date));
	}
}

