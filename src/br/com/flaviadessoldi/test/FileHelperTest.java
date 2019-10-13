package br.com.flaviadessoldi.test;


import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import br.com.flaviadessoldi.utils.FileHelper;

class FileHelperTest {
	
	@Test
	public void mustReadFromAnTxTFile() throws IOException {
		
				
		assertNotNull(FileHelper.readFile("file.txt"));
		
	}
	
	
	
	
	
}
