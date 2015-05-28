package NoviceProgramme;

public class PerfectNumber {

	public static void main(String[] args) {

		/*
		 * Perfect Number : Perfect number is a positive integer 
		 * that is equal to the sum of its positive divisors excluding the number itself
		 * 
		 * 
		 */

		int number = 29;
		int tmp = 0 ;
		for(int i = 1; i <=number/2; i++)
		{
			if(number%i==0)
			{
				tmp+=i;
			}
		}
		if(tmp == number)
		{
			System.out.println("This is a perfect number" + number);
		}
		else
		{
			System.out.println("This is a not a perfect number : " + number);
		}
	}

}
