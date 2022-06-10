package week3.day2.assignments;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {4,6,7,2,3,1,9,10,8,8,6,2};
		Set<Integer> s=new TreeSet<Integer>();
		for(int i:numbers)
			s.add(i);
		System.out.println(s);
		
		int j=1;
		Iterator<Integer> iter = s.iterator();
		while(iter.hasNext()) {
			if(j != iter.next()) {
				System.out.println("Missing number is " + j);
				break;
			}
			j++;
		}
	}

}
