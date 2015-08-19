package com.codingtask.filereader;

import java.util.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileReaderService implements SourceInerface {
	
	private String path;
	
	public FileReaderService(String path) {
		this.path = path;
	}
	
	@Override
	public List<String> readWordsFromSource() {
		List<String> listOfWords = new ArrayList<>();
		try (BufferedReader br = new BufferedReader(new FileReader(path)))
		{

			String sCurrentLine;
			while ((sCurrentLine = br.readLine()) != null) {
				for(String s : sCurrentLine.split("[,\\s\\-:\\?\\.]")) {
					if(!s.isEmpty()) {
						listOfWords.add(s.toLowerCase());
					}
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		} 
		return listOfWords;
	}
	
}
