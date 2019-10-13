package br.com.flaviadessoldi.test;


import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import br.com.flaviadessoldi.utils.FileReaderAndConverter;


/**
 * Class responsible for testing the methods of the class FileReaderAndConverter.
 * 
 * @author Flavia Giovana Dessoldi
 */

class FileReaderAndConverterTest {

	@Test
	public void mustReadFromAnTxTFileAndReturnTheClientTypeRegular() throws IOException {
		
		FileReaderAndConverter fileReaderAndConverter = new FileReaderAndConverter();
		
		assertNotNull(fileReaderAndConverter.takeClientType());
		
	}
	
	@Test
	public void mustReadFromAnTxTFileAndReturnTheCheckinDate() throws IOException {
		
		FileReaderAndConverter fileReaderAndConverter = new FileReaderAndConverter();
		
		assertNotNull(fileReaderAndConverter.takeCheckinDate());
		
	}
	
	@Test
	public void mustReadFromAnTxTFileAndReturnTheCheckoutDate() throws IOException {
		
		FileReaderAndConverter fileReaderAndConverter = new FileReaderAndConverter();
		
		assertNotNull(fileReaderAndConverter.takeCheckoutDate());
		
	}


}
