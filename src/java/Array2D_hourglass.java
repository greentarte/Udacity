package java;

import java.util.Scanner;

public class Array2D_hourglass {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
	        int arr[][] = new int[6][6];
	        for(int i=0; i < 6; i++){
	            for(int j=0; j < 6; j++){
	                arr[i][j] = in.nextInt();
	            }
	        }
		int[] result = new int[4];
		int sum = 0;
		for (int j = 0; j < arr.length - 2; j++) {
			int max = arr[j][0] + arr[j][1] + arr[j][2] + arr[j + 1][1] + arr[j + 2][0] + arr[j + 2][1] + arr[j + 2][2];
			result[j] = max;
			for (int i = 1; i < arr[i].length - 2; i++) {
				sum = arr[j][i] + arr[j][i + 1] + arr[j][i + 2] + arr[j+1][i + 1] + arr[j+2][i] + arr[j+2][i + 1]
						+ arr[j+2][i + 2];
				if (result[j] <= sum) 
					result[j]=sum;
			}
		}
		int last = result[0];
		for (int i = 0; i < result.length - 1; i++) {
			if (last > result[i + 1]) {
			} else if (last < result[i + 1]) {
				last = result[i + 1];
			} else {
				last = result[i];

			}
		}
		System.out.println(last);
		in.close();
	}

}
