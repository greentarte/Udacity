package java;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Static {
	
		static Scanner sc = new Scanner(System.in);
		static int b = sc.nextInt();
		static int h = sc.nextInt();
		static int B;
		static int H;
		static boolean flag = true;
		static{
			if(b>0 && h>0){
				B=b;
				H = h;	
			}else{
				sc.close();
				System.out.println("java.lang.Exception: Breadth and height must be positive" );
				System.exit(0);
			}
		}		
	public static void main(String[] args) {
		if(flag){
			int area=B*H;
			System.out.print(area);
		}

	}

}
