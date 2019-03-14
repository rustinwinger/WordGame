/* Rustin Winger
 * CS 211
 * Assignment 4
 * 10/17/2018
 */
package rstn;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//random class
public class newRandom {

	//turns string into array and shuffles letters
	public static void nextRandom(String question) {
	
	String answer = null;

	List<String> qTemp = Arrays.asList(answer.split(""));
	Collections.shuffle(qTemp);
	String question = String.valueOf(qTemp);
	question = String.join(question);
	System.out.println(question);
	System.out.println(answer);
	
	}
	
	public static void main(String[] args) {
		nextRandom();
	}
}
	
	


