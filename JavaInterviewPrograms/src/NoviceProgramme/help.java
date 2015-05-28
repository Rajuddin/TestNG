package NoviceProgramme;

import java.util.ArrayList;
import java.util.List;

public class help {

	public static void main(String[] args)
	{
		List<Integer> number = new ArrayList<Integer>();
		for(int i= 0; i<10; i++)
		{
			number.add(i);
		}
			
	 for(int num:number)
	 {
		 System.out.println("hello "+ num);
	 }
	}
}
