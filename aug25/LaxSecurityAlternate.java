package aug25;

import java.util.Scanner;

public class LaxSecurityAlternate {
	
	public static void main(String[] args) {
		
		int totalValid = 0;
		int totalTest = 0;
		boolean valid = false;
		
		Scanner input = new Scanner(System.in);
		totalValid = Integer.parseInt(input.next());
		
		int[] valids = new int[totalValid];
		int validCount = 0;
		String temp;
		int tempcount;
		
		//storing the input
		for (int i = 0; i < totalValid; i++) {
			valids[i] = input.nextInt();
		}
		totalTest = Integer.parseInt(input.next());
		int[] tests = new int[totalTest];
		for (int i = 0; i < totalTest; i++) {
			tests[i] = input.nextInt();
		}
		
		//make array with alternatives
		
		//comparing the PINs
		for (int i = 0; i < totalTest; i++) {
			System.out.print(tests[i] + " ");
			int j = 0;
			for (j = 0; j < totalValid; j++) {
				if (tests[i] == valids[j]) {
					valid = true;
					break;
				}
				else {valid = false;}
			}
			if (valid) {System.out.print("VALID ");}
			else {System.out.print("INVALID ");}
			System.out.print(valids[j]);
		}
	}
}
