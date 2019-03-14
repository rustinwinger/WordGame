/* Rustin Winger
 * CS 211
 * Assignment 4
 * 10/17/2018
 */
package rstn;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class Word211 {
	
	static String q1 = null;

	//method to read file
	public static void readFile(String fileName)throws FileNotFoundException{ 
		
		Scanner sc = new Scanner(fileName);
		  
		while (sc.hasNextLine()) {
			String q1 = sc.next();
			String q1info = sc.next();
		}
	}
	
	//puts words into hashmap
	public static HashMap<String,String> nextWord(){
		  
		String q1 = "paple";
		String a1 = "apple";
		String q2 = "roange";
		String a2 = "orange";
		
		HashMap<String, String> hm = new HashMap<>();
		hm.put(q1, a1);
		hm.put(q2,a2);
		return hm;
	}
	
	//main method
	public static void main(String[] args) {
		HashMap<String, String> a = nextWord();
		for (String key : a.keySet()) {
			System.out.println(key + " " + a.get(key));
		}
		
		readFile("fruit.txt");
		nextRandom(question);
		String guess = null;
		Scanner scan = new Scanner(System.in);
		
//		System.out.print(question);
		System.out.println("What word do these letters make?");
		double startTime = System.currentTimeMillis();
		guess = scan.next();
		double endTime = System.currentTimeMillis();
		double totalTime = endTime - startTime;
		System.out.println("Response Time: " + totalTime/1000.0 + " sec");
		System.out.println(q1);

	}
}
