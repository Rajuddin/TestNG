package NoviceProgramme;

import java.util.ArrayList;
import java.util.List;

public class duplicateCharacter {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("J");
		list.add("A");
		list.add("V");
		list.add("A");
		list.add("H");
		list.add("F");
		
		List<String> list1 = new ArrayList<String>();
		for(String i : list)
		{
			System.out.println("This is character"+i);
			if(list1.contains(i))
			{
				System.out.println("This is dupicate character"+i);
			}
			else
			list1.add(i);
		}

		
	}

}
