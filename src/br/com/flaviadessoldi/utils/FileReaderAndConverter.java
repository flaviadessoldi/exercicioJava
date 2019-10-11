package br.com.flaviadessoldi.utils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderAndConverter {
	
	public static void main(String[] args) throws FileNotFoundException, IOException {

		try (BufferedReader br = new BufferedReader(new FileReader("file.txt"))) {
			String line = br.readLine();

			String[] parts = line.split(":");
			String clientType = parts[0];
			String dates = parts[1];
			String[] cutDates = dates.split(",");
			String firstDate =cutDates[0];
			String secondDate = cutDates[1];
			String thirdDate = cutDates[2];
			
//			String takeDate [] = cleanDates.split("(");
//			String finalDate= takeDate[0];
//			
			System.out.println(firstDate);
			System.out.println(secondDate);
			System.out.println(thirdDate);
			System.out.println(clientType);
			
			
			

		}

	}

}
