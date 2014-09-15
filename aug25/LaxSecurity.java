package aug25;

import java.util.Scanner;

public class LaxSecurity {
	
	public static void main(String[] args) {
        
        //THIS IS A CHANGE
		
		int totalValid = 0;
		int totalTest = 0;
		
		Scanner input = new Scanner(System.in);
		totalValid = Integer.parseInt(input.next());
		
		int[][] valids = new int[totalValid][5];
		int[][] tests = new int[totalTest][5];
		int validCount = 0;
		int[] temps = new int[5];
		String temp;
		int tempcount;
		
		//storing the input
		for (int i = 0; i < totalValid; i++) {
			temp = input.next();
			for (int j = 0; j < 5; j++) {
				valids[i][j] = temp.charAt(j) - '0';
			}
		}
		totalTest = Integer.parseInt(input.next());
		for (int i = 0; i < totalTest; i++) {
			temp = input.next();
			for (int j = 0; j < 5; j++) {
				tests[i][j] = temp.charAt(j) - '0';
			}
		}
		
		//comparing the PINs
		for (int i = 0; i < totalTest; i++) {
			
		}
	}
	
	public int compare(int[] test, int[][] val, int totalVal) {
		for (int j = 0; j < totalVal; j++) {
			for (int i = 0; i < 5; i++) {
				if (test[i] == val[j][i]) {
					
				}
			}
		}
		
		return 0;
	}
}
