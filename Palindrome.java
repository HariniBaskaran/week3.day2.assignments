package week3.day2.assignments;

import java.util.ArrayList;
import java.util.Collections;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "madam";
		char[] chArr = str.toCharArray();
		ArrayList<Character> arr = new ArrayList<Character>();
		for(char ch:chArr)
			arr.add(ch);
		Collections.reverse(arr);	
		ArrayList<Character> revArr = new ArrayList<Character>();
		for(char ch:chArr)
			revArr.add(ch);
		if(revArr.equals(arr))
			System.out.println("Given string is palindrome");
		else
			System.out.println("Given string is not palindrome");
	}

}
