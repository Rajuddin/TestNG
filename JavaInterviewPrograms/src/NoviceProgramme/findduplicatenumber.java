package NoviceProgramme;

import java.util.ArrayList;
import java.util.List;

public class findduplicatenumber {

	public static void main(String[] args) {

		List<Integer> numbers = new ArrayList<Integer>();
		for(int i =1; i<10; i++)
		{
			numbers.add(i);
		}
		numbers.add(8);	
		numbers.add(9);	
		List<Integer> withoutdupes = new ArrayList<Integer>();
		for(Integer i:numbers){
		System.out.println("withoutdupes"+ withoutdupes);
		if(withoutdupes.contains(i))
		System.out.println( "This is duplicate"+i);
		else withoutdupes.add(i);
		}
	}

}
