package com.codingtask.test;

import static org.junit.Assert.*;

import java.util.Map;

import org.junit.Test;

import com.codingtask.filereader.FileReaderService;
import com.codingtask.main.FindVowelsService;

public class FindVowelsServiceTest {

	@Test
	public void test() {
		//TODO
		FileReaderService f = new FileReaderService("D:\\input.txt");		
		FindVowelsService service = new FindVowelsService(f);
		Map<String, Float> result = service.findVowels();
		
		String expectedResult = "{({[a, o]},6)=2.5, ({[a, o]},5)=2.0, ({[e, a]},4)=2.0}";
		assertEquals( expectedResult , result.toString());
		
	}

}
