package sept8;

import java.util.Scanner;

public class WordMorphing {
	
	public static void main(String[] args) {
		
		/* Initializations */
		
		String start, end, test;
		char currS, currE;
				
		/* Store input */
		
		Scanner input = new Scanner(System.in);
		int dictSize = Integer.parseInt(input.next());
		String[] dict = new String[dictSize];
		
		for (int i = 0; i < dictSize; i++) {
			dict[i] = input.next();
		}
		
		int testSize = Integer.parseInt(input.next());
		String[] tests = new String[testSize];
		
		for (int i = 0; i < 2*testSize; i++) {
			tests[i] = input.next();
		}

		/* Perform action */
		
		start = tests[0];
		end = tests[1];
		
		int diff = 0;
		
		for (int j = 0; j < start.length(); j++) {
			currS = start.charAt(j);
			currE = end.charAt(j);
			if (currS != currE) {
				for (int d = 0; d < dictSize; d++) {
					if (dict[d].charAt(0) == end.charAt(0)) {
						diff++;
					}
					if (dict[d].charAt(1) == end.charAt(1)) {
						diff++;
					}
					if (dict[d].charAt(2) == end.charAt(2)) {
						diff++;
					}
					if (dict[d].charAt(3) == end.charAt(3)) {
						diff++;
					}
					if (dict[d].charAt(4) == end.charAt(4)) {
						diff++;
					}
					if (diff == 0) {
						System.out.println(dict[d]);
						break;
					}
					else if (diff == 1) {
						System.out.println(dict[d]);
					
					}
				}
				
			}
		}
		

		
//		if (currS !=)
		
		
//		totalValid = Integer.parseInt(input.next());

	}
	
	
	
}
