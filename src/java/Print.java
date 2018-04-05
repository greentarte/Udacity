package java;

import java.util.ArrayList;
import java.util.Scanner;

public class Print {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<String> arr = new ArrayList<String>();

		while (sc.hasNext()) {
			arr.add(sc.nextLine());
		}
		int i= 1;
		for(String arry : arr){
			System.out.println((i++)+" " +arry);
		}
		sc.close();
	}

}
