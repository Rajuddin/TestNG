package NoviceProgramme;

public class Palindrome {

	public static void main(String[] args) {
		String myString = "nayan";
		/*StringBuilder s = new StringBuilder(myString);
		//System.out.println(s.reverse());
		StringBuilder reversed = s.reverse();
		 
		if(myString==reversed)
		{
			System.out.println(s+" is palindrom");
		}

		String newString = "";
		for(int i = myString.length()-1; i>=0; i--)
		{
			newString += myString.charAt(i);
			System.out.println(myString.charAt(i));
		}
		if(newString==myString)
		{
			System.out.println("new String" + newString);
			System.out.println("my string" + myString);

			
			System.out.println("This String is Palindrome");
		}
		else 
		{
			System.out.println("new String" + newString);
			System.out.println("my string" + myString);
			System.out.println("This String is not Palindrome");
		}
			*/
		palindromeInteger();

	}
	
	public static void palindromeInteger()
	{
		int myNumber = 121;
		int num = myNumber ;
		int reversedNumber = 0;
		int remainder = 0 ;
		
		while(myNumber > 0)
		{
		remainder = myNumber%10;
		reversedNumber = reversedNumber*10+remainder;
		myNumber = myNumber/10;
		}
		if (num == reversedNumber) {
			System.out.println("Number is palindrome");
		}
		
	}
}
