package week3.day2.assignments;

import java.util.ArrayList;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "changeme";
		char[] testArr=test.toCharArray();
		ArrayList<Character> arrList=new ArrayList<Character>();
		
		for(char c:testArr)
			arrList.add(c);
		
		for(char c:arrList)
			System.out.print(c);
		
		System.out.println("Changing Odd Index To Upper Case");
		
		for(int i=0;i<arrList.size();i++)
			if(i%2 != 0 )
				arrList.set(i, Character.toUpperCase(arrList.get(i)));
		
		for(char c:arrList)
			System.out.print(c);
	}

}
