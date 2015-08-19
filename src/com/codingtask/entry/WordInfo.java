package com.codingtask.entry;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import com.codingtask.resources.Constants;

public class WordInfo {
	private String word;
	private Set<Character> vowels = new HashSet<>();
	private int vowelsCount;
	private float coefficient;

	public String getWord() {
		return word;
	}
	
	public String getVowels() {
		return "{" + vowels + "}";
	}
	
	public int getVowelsCount(String word2) {
		return vowelsCount;
	}

	public WordInfo(String word) {
		this.word = word;
		countInfo(word);
	}
	
	private void countInfo(String word) {
		foundVowels(word);
		countCoefficient();
	}

	private void countCoefficient() {
		coefficient = word.length()/vowelsCount;
	}

	public float getCoefficient() {
		return coefficient;
	}

	private void foundVowels(String word2) {
		for(Character c : word2.toCharArray()) {
			if(Constants.VOWELS_LIST.contains(c)) {
				vowelsCount++;
				vowels.add(c);
				
			}
		}
	}

	
	
}
