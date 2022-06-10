package week3.day2.assignments;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;


public class RemoveDuplicates {
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "We learn java basics as part of java sessions in java week1";
		String[] s=text.split(" ");
		Set<String> mySet= new LinkedHashSet<String>();
		for(String str:s){
			mySet.add(str);
		}		
		
		//using enhanced for loop
		for(String str:mySet){
			System.out.print(str+" ");
		}
		System.out.println();
		//using iterator
		Iterator<String> it= mySet.iterator();
		while(it.hasNext())
			System.out.print(it.next() + " ");
	}

}
