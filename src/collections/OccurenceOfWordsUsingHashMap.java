package collections;

import java.util.HashMap;

public class OccurenceOfWordsUsingHashMap 
{

	public static void main(String[] args) 
	{
		String str = "Clean World Green World Happy World";
		String[] words = str.split(" "); // Split the text into words
		
		// Create a HashMap to store word counts
		HashMap<String,Integer> word_counts = new HashMap<>();
		
		
		/* LOGIC 1
		// Count the occurrences of each word
		for(String word:words)
		{
			// If the word is already in the HashMap, increment its count
			word_counts.put(word, word_counts.getOrDefault(word, 0)+1);
		}
		
		// Print the word counts
		for(String word: word_counts.keySet())
		{
			System.out.println(word+":"+word_counts.get(word));
		}*/

			
		
		//LOGIC 2
		int count=0;
		for(String word:words)
		{
			count = word_counts.getOrDefault(word, 0);
			word_counts.put(word, count+1);
		}
		
		System.out.println(word_counts);
	}		

}
