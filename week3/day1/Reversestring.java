package week3.day1;

import java.util.Iterator;

public class Reversestring {

	public static void main(String[] args) {
		String s="Geetha";
		char[] charArray=s.toCharArray();
		for (int i =charArray.length-1;i>=0; i--) {
			System.out.println(charArray[i]);
			
		}
		
		

	}

}
