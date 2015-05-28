package NoviceProgramme;

public class PrimeNumbers {

	public static void main(String args[])
	{
		//int num = getPrimeNumbers(17);
		//System.out.println(num);
		int num = 23;
		if(isPrime(num))
		{
			System.out.println(num + " is a prime number");
		}
		else 
			System.out.println(num + " is not a prime number");
		//System.out.println(Math.sqrt(17));
	}
	
	
	/*
	 * A prime number has only two factors, namely one and itself. To determine whether a given number is prime, 
	 * we need to check if it has factors others than one and itself. If we are able to find atleast one other factor, 
	 * then we can conclude that the number is not prime. 
	 * To check if a number is a factor of the given number ( hereafter referred to as n ),
	 *  we obtain the remainder on dividing n by the number. 
	 *  If the remainder is zero, then the number is a factor. 
	*/
	
	public static boolean isPrime(int number)
	{
		if(number<=1)
		{
			return false;			
		}
		
		for(int i = 2; i<=number/2/*Math.sqrt(number)*/; i++)
		{
			if(number%i==0)
			{
				return false;
			}
		}
		return true;
	}
	/*public static int getPrimeNumbers(int primeNumbers)
	{
		int x=0;
		if(x != primeNumbers)
		{
			for(int i =1; i<=primeNumbers; i++)
			{
				for(int y=2 ; y<=i/2; i++)
				{
					if(i%y==0)
					{
						
					}
					else x++;
				}
				
				x++;
			}
		}
		
		return 0;
	}*/
}
