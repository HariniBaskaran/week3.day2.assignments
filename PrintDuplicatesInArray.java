package week3.day2.assignments;

import java.util.HashSet;
import java.util.Set;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		Set<Integer> s = new HashSet<Integer>();
		System.out.print("Duplicate values in Array are ");
		for(int i:arr)
			if(!s.add(i))
				System.out.print(i + " ");
	}

}
