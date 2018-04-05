package java;

import java.util.*;
import java.io.*;
public class StringIntro {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        System.out.println(A.length()+B.length());
        ArrayList<String> arr = new ArrayList<String>();
        arr.add(A);
        arr.add(B);
        arr.sort(null);
        if(arr.get(0).equals(A)){
        	System.out.println("No");
        	String c = A.substring(0, 1).toUpperCase()+A.substring(1, A.length());
        	String d = B.substring(0, 1).toUpperCase()+B.substring(1, B.length());
        	
            System.out.println( c+" "+ d);
        }else{
        	System.out.println("Yes");
        	String c = B.substring(0, 1).toUpperCase() +B.substring(1, B.length());
        	String d = A.substring(0, 1).toUpperCase() +A.substring(1, A.length());
        	System.out.println( c+" "+ d);
        }
          
        
        

	}

}
