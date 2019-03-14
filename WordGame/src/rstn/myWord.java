/* Rustin Winger
 * CS 211
 * Assignment 4
 * 10/17/2018
 */
package rstn;

import java.util.HashMap;

//constructor class for words
public class myWord {
	
	 Word211 word = new Word211();
	 word.readFile("fruit.txt");
	 
	
	 HashMap<String, String> w = Word211.nextWord(); {
 
		 for (String q : w.keySet()) {
			 String question = q;
			 String answer = w.get(question);
	 	}
	}
}
