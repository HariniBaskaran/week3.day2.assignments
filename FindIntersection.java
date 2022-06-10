package week3.day2.assignments;

import java.util.Arrays;
import java.util.HashSet;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<Integer> s1 = new HashSet<Integer>(Arrays.asList(3,2,11,4,6,7));
		HashSet<Integer> s2 = new HashSet<Integer>(Arrays.asList(1,2,8,4,9,7));
		
		for(int ar1:s1) {
			for(int ar2:s2 ) {
				if(ar1 == ar2)
					System.out.print(ar1 + " ");
			}
				
		}
	}

}
