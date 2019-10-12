package br.com.flaviadessoldi.test;

import java.io.IOException;

import br.com.flaviadessoldi.main.MainClass;
import br.com.flaviadessoldi.utils.FileReaderAndConverter;

public class teste {
	
	public static void main(String[] args) throws IOException {
	
	
		FileReaderAndConverter fileReaderAndConverter = new FileReaderAndConverter();
		
		String f = fileReaderAndConverter.takeCheckoutDate();
		String d = fileReaderAndConverter.takeCheckinDate();
		
		System.out.println(f);
		System.out.println(d);
	
	
}
}
