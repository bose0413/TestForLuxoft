package com.codingtask.map;

import java.util.Iterator;
import java.util.Map;

import com.codingtask.filereader.FileReaderService;
import com.codingtask.main.FindVowelsService;

public class MainClass {
	public static void main(String[] args) {
		FileReaderService f = new FileReaderService("D:\\input.txt");		
		FindVowelsService service = new FindVowelsService(f);
		Map<String, Float> result = service.findVowels();
		
		for(Map.Entry<String, Float> entry : result.entrySet()) {
			System.out.println(entry);
		}
	}
}
