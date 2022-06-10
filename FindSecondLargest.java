package week3.day2.assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr=new ArrayList<Integer>(Arrays.asList(3,2,11,4,6,7));
		Collections.sort(arr);
		System.out.println(arr.get(arr.size()-2));	
	}

}
