package NoviceProgramme;

public class FactorialTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int number = 5;
		int result=1;
		
		for(int i =1; i<=number; i++)
		{
		result = result*i;
		
		}
		System.out.println("factorial of "+number + " is : "+ result);

		
	}

}
