package main;

import java.util.Scanner;

public class LaxSecurityHelper {
	
	int diffs, matches;
	int valNum, testNum;
	boolean found;
	
	public LaxSecurityHelper() {
		
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();  //number of valid pins
		int[] valids = new int[N];
		for (int i=0; i<N; i++) {
			valids[i] = scanner.nextInt();
		}
		
		int M = scanner.nextInt(); // number of pins to test
		int[] tests = new int[M];
		for (int i=0; i<M; i++) {
			tests[i] = scanner.nextInt();
		}
		
		for (int i=0; i<M; i++) {
			System.out.print(tests[i] + " ");
			check(valids, N, tests[i]);
		}
		
		System.out.print("END OF OUTPUT");
		
	}
	
	public void check(int[] pins, int numPins, int test) {
		int[] temp = new int[5];
		String stest = String.valueOf(test);
		found = false;
		outerloop:
			for (int j=0; j<numPins; j++) {
				diffs = 0;
				matches = 0;
				String valid = String.valueOf(pins[j]);
				for (int k = 0; k < 5; k++) {
					valNum = Character.getNumericValue(valid.charAt(k));
					testNum = Character.getNumericValue(stest.charAt(k));
					if (testNum == valNum) {
						temp[k] = testNum;
						matches++;
					} 
					else if (testNum == 1 && (valNum == 4 || valNum == 2)) {
						temp[k] = Character.getNumericValue(valid.charAt(k));
						matches++;
						diffs++;
					} 
					else if (testNum == 2 && (valNum == 1 || valNum == 3 || valNum == 5)) {
						temp[k] = Character.getNumericValue(valid.charAt(k));
						matches++;
						diffs++;
					} 
					else if (testNum == 3 && (valNum == 2 || valNum == 6)) {
						temp[k] = Character.getNumericValue(valid.charAt(k));
						matches++;
						diffs++;
					} 
					else if (testNum == 4 && (valNum == 1 || valNum == 5 || valNum == 7)) {
						temp[k] = Character.getNumericValue(valid.charAt(k));
						matches++;
						diffs++;
					} 
					else if (testNum == 5 && (valNum == 2 || valNum == 4 || valNum == 6 || valNum == 8)) {
						temp[k] = Character.getNumericValue(valid.charAt(k));
						matches++;
						diffs++;
					} 
					else if (testNum == 6 && (valNum == 3 || valNum == 5 || valNum == 9)) {
						temp[k] = Character.getNumericValue(valid.charAt(k));
						matches++;
						diffs++;
					} 
					else if (testNum == 7 && (valNum == 4 || valNum == 8)) {
						temp[k] = Character.getNumericValue(valid.charAt(k));
						matches++;
						diffs++;
					} 
					else if (testNum == 8 && (valNum == 7 || valNum == 5 || valNum == 9 || valNum == 0)) {
						temp[k] = Character.getNumericValue(valid.charAt(k));
						matches++;
						diffs++;
					} 
					else if (testNum == 9 && (valNum == 6 || valNum == 8)) {
						temp[k] = Character.getNumericValue(valid.charAt(k));
						matches++;
						diffs++;
					} 
					else if (testNum == 0 && (valNum == 8)) {
						temp[k] = Character.getNumericValue(valid.charAt(k));
						matches++;
						diffs++;
					}
				}
				if (diffs <= 1 && matches == 5) {
					found = true;
					System.out.print("VALID ");
					for (int q=0;q<5;q++) {
						System.out.print(temp[q]);
					}
					System.out.print("\n");
					break outerloop;
				}
			}
		//end outerloop
		if (!found) {
			System.out.print("INVALID\n");
		}
	}	
}





