package br.com.flaviadessoldi.test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.junit.jupiter.api.Test;

import br.com.flaviadessoldi.utils.DateHelper;

class DateHelperTest {

	DateHelper dateHelper = new DateHelper();

	@Test
	public void mustReturnTrueIfItsWeekend() throws Exception {
		
		Date date = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH).parse("12Out2019");
		dateHelper.isWeekend(date);
		
		assertTrue(dateHelper.isWeekend(date));
	}
	
	@Test
	public void mustReturnFalseIfItsBusinessDay() throws Exception {
		
		Date date = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH).parse("15Out2019");
		assertFalse(dateHelper.isWeekend(date));
	}
	
	
@Test	
public void mustReceiveStringAndReturnDate() throws Exception {
	
	String dateString = "12Out2019";
	dateHelper.formatDate(dateString);
	
	Date date = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH).parse("12Out2019");
		
		assertEquals(date, dateString);
	}

	
	public void deveRetornarPeriodoDeDatas(){
		Date checkinDate = dateHelper.formatDate("12Out2019");
		Date checkoutDate = dateHelper.formatDate("15Out2019");
		List <Date> result = dateHelper.getDates(checkinDate, checkoutDate);
		
		assertEquals(dateHelper.getDates(checkinDate, checkoutDate), result);
	}

}
