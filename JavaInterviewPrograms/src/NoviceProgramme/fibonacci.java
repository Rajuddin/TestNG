package NoviceProgramme;

public class fibonacci {

	/*
	 * By definition, the first two numbers in the Fibonacci sequence are 0 and 1, 
	 * and each subsequent number is the sum of the previous two numbers
	 * 
	 */
	public static void main(String[] args) {

		fibonacci fb = new fibonacci();
		//fb.fibonacciWithArray(05);
		fb.fibonacciWithVariable(06);
	
	}
	
	public void fibonacciWithArray(int febcount)
	{
		int[] feb = new int[febcount];
		feb[0] = 0;
		feb[1] = 1;
		for(int i = 2; i<febcount ; i++)
		{
			feb[i] = feb[i-1] + feb[i-2];
			
		}
		for(int i = 0; i<febcount; i++)
		{
			System.out.print(feb[i] + " ");
		}
	}

	public void fibonacciWithVariable(int febcount)
	{

		int firstElement = 0;
		int secondElement = 1;
		int currentElement=0;
		System.out.print(firstElement + " " + secondElement +" ");
		for(int i = 1; i<febcount-2; i++)
		{
			currentElement = firstElement + secondElement;
			firstElement = secondElement;
			secondElement = currentElement;		
			System.out.print(currentElement + " ");
					
		}
		
		
	}
}
