package week3.day2.assignments;

import java.util.HashSet;
import java.util.Set;

public class PrintOnlyUniqueCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "babu";
		char[] chArr=input.toCharArray();
		Set<Character> s=new HashSet<Character>();
		for(char ch : chArr) {
			if(!(s.add(ch))){
				s.remove(ch);
			}
		}
		System.out.println(s);
		
	}

}
