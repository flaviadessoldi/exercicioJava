package br.com.flaviadessoldi.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class FileReaderAndConverter {

	public String ReadAndConverterStrings() throws IOException {

		try (BufferedReader br = new BufferedReader(new FileReader("file.txt"))) {
			String line = br.readLine();

			return line;

		}

	}

	public String takeClientType() throws IOException {
		String line = ReadAndConverterStrings();
		String[] parts = line.split(":");
		String clientType = parts[0];

		return clientType;
	}

	public String takeCheckinDate() throws IOException {
		String dates = ReadAndConverterStrings();
		String[] parts = dates.split(":");
		String date = parts[1];
		String[] cutDates = date.split(",");
		String firstDate = cutDates[0];
		String convertDate = firstDate.substring(1, 10);
		String checkinDate = changeDate(convertDate);
		
		StringBuilder sb = new StringBuilder(checkinDate);
		sb.insert(2, '/');
		sb.insert(5, '/');
		
		return sb.toString();
				
	}
	


	public String takeCheckoutDate() throws IOException {
		String dates = ReadAndConverterStrings();
		String[] parts = dates.split(":");
		String date = parts[1];
		String[] cutDates = date.split(",");
		String lastDate = cutDates[cutDates.length - 1];
		String convertDate = lastDate.substring(1, 10);
		String checkoutDate = changeDate(convertDate);
		
		
		StringBuilder sb = new StringBuilder(checkoutDate);
		sb.insert(2, '/');
		sb.insert(5, '/');
		
		return sb.toString();
		
	}

	public String changeDate(String month) throws IOException {
	
		if (month.contains("Jan")) {
			return month.replace("Jan", "01");
		} else if (month.contains("Fev")) {
			return month.replace("Fev", "02");
		} else if (month.contains("Mar")) {
			return month.replace("Mar", "03");
		} else if (month.contains("Apr")) {
			return month.replace("Apr", "04");
		} else if (month.contains("May")) {
			return month.replace("May", "05");
		} else if (month.contains("Jun")) {
			return month.replace("Jun", "06");
		} else if (month.contains("Jul")) {
			return month.replace("Jul", "07");
		} else if (month.contains("Aug")) {
			return month.replace("Aug", "08");
		} else if (month.contains("Set")) {
			return month.replace("Set", "09");
		} else if (month.contains("Out")) {
			return month.replace("Out", "10");
		} else if (month.contains("Nov")) {
			return month.replace("Nov", "11");
		} else if (month.contains("Dez")) {
			return month.replace("Dez", "12");
		}

		return "erro";
	}
	
	

}
