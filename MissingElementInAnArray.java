package week3.day2.assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr=new ArrayList<Integer>(Arrays.asList(1,2,3,4,7,6,8));
		Collections.sort(arr);
		
		for(int i=1 ; i <= arr.size()+1; i++)
		{
				if(!arr.contains(i))
					System.out.println("Missing Element is "+ i);
		}
	}

}
