package br.com.flaviadessoldi.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Class responsible for receiving and converting the text file information.
 * 
 * @author Flavia Giovana Dessoldi
 */

public class FileHelper {

	public static String readFile(String filePath) throws IOException {

		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
			String line = br.readLine();

			return line;

		}

	}
	
	
	public String takeClientType(String content) throws IOException {
		String[] parts = content.split(":");
		String clientType = parts[0];

		return clientType;
	}
	
	private String[] getStringDate(String content){
		String[] parts = content.split(":");
		String date = parts[1];
		String[] cutDates = date.split(",");

		return cutDates;
	}

	public String takeCheckinDate(String content) throws IOException {
		String[] cutDates = getStringDate(content);
		String firstDate = cutDates[0];
		String convertDate = firstDate.substring(1, 10);

		StringBuilder sb = new StringBuilder(convertDate);
		sb.insert(2, '-');
		sb.insert(6, '-');

		String checkintDate = sb.toString();
		return checkintDate;

	}

	public String takeCheckoutDate(String content) throws IOException {
		String[] cutDates = getStringDate(content);
		String lastDate = cutDates[cutDates.length - 1];
		String convertDate = lastDate.substring(1, 10);

		StringBuilder sb = new StringBuilder(convertDate);
		sb.insert(2, '-');
		sb.insert(6, '-');

		String checkoutDate = sb.toString();
		return checkoutDate;
	}

}
