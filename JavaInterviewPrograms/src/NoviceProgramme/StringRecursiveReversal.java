package NoviceProgramme;

public class StringRecursiveReversal {

	   String reverse = "";
	public static void main(String[] args) {

		String myString = "Hello";
		String reverse="";
			
		for(int i = myString.length()-1; i>=0;)
		{
			System.out.println("hello");
			reverse = reverse + myString.charAt(i);
			System.out.println("reversed str;ing is : "+ reverse);
			i--;
		}
		
	}
	
}
