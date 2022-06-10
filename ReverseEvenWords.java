package week3.day2.assignments;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "I am a software tester"; 
		String[] arrTest = test.split(" ");
		ArrayList<String> hs = new ArrayList<String>();
		for(String str:arrTest)
			hs.add(str);
		for(int i = 0; i<arrTest.length ; i++) {
			if(i%2==0) {
				char[] ch=hs.get(i).toCharArray();
				ArrayList<Character> chArr = new ArrayList<Character>();
				for(Character chr:ch)
					chArr.add(chr);
				Collections.reverse(chArr);
				for(Character chr:chArr)
					System.out.print(chr);
			}
			else
				System.out.print(" " + hs.get(i) + " ");
		}
			
		
	}

}
