package br.com.flaviadessoldi.utils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class FileReaderAndConverter {
	
	public void ReaderAndConverterFileTxt () {

		try (BufferedReader br = new BufferedReader(new FileReader("file.txt"))) {
			String line = br.readLine();

			String[] parts = line.split(":");
			String clientType = parts[0];
			String dates = parts[1];
			String[] cutDates = dates.split(",");
			
			for (String s : cutDates) {
				s.split("(");				
			}
			
			String checkinDate = cutDates[0];
					
			String checkoutDate = cutDates[cutDates.length-1];
			
			System.out.println(checkinDate);
			System.out.println(checkoutDate);
			
			//substring no checkin e checkout
			
			//formatDate neles
			
			
						
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
	
	public Date formatDate(String dateString) {
		try { 
			Calendar cal = Calendar.getInstance(); 
			cal.setTime(new SimpleDateFormat("ddMMMyyyy").parse("24Nov2002")); 
			SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
			System.out.println(sdf.format(cal.getTime())); 
			} catch (ParseException e) { e.printStackTrace(); }
		return null;
		
		}

}
