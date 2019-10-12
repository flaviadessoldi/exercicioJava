package br.com.flaviadessoldi.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderAndConverter {

	public static String ReadAndConverterStrings() throws IOException {

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

		StringBuilder sb = new StringBuilder(convertDate);
		sb.insert(2, '-');
		sb.insert(6, '-');

		String checkintDate = sb.toString();
		return checkintDate;

	}

	public String takeCheckoutDate() throws IOException {
		String dates = ReadAndConverterStrings();
		String[] parts = dates.split(":");
		String date = parts[1];
		String[] cutDates = date.split(",");
		String lastDate = cutDates[cutDates.length - 1];
		String convertDate = lastDate.substring(1, 10);

		StringBuilder sb = new StringBuilder(convertDate);
		sb.insert(2, '-');
		sb.insert(6, '-');

		String checkoutDate = sb.toString();
		return checkoutDate;

	}

}
