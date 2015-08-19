package com.codingtask.main;

import java.lang.ProcessBuilder.Redirect;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import com.codingtask.entry.WordInfo;
import com.codingtask.filereader.SourceInerface;

public class FindVowelsService {
	
	Map<String, Float> vowelsCount;
	
	SourceInerface reader;
	
	public FindVowelsService(SourceInerface reader) {
		vowelsCount = new HashMap<>();
		this.reader  = reader;
	}
	
	public Map<String , Float> findVowels() {
		for (String word : getWords()) {
			
			WordInfo wi = new WordInfo(word);
			String entry = "(" + wi.getVowels() + "," + word.length() + ")";			
			
			if(vowelsCount.containsKey(entry)) {
				float resCoef= ( wi.getCoefficient() + vowelsCount.get(entry) ) / 2;
				vowelsCount.put(entry, resCoef);
			} else {
				vowelsCount.put(entry, wi.getCoefficient());
			}
				
		}
		return vowelsCount;
	}

	private List<String> getWords() {
		return reader.readWordsFromSource();
	}
}
