package NoviceProgramme;

public class NumberSumRecursive {

	public static void main(String[] args) {
		NumberSumRecursive sum = new NumberSumRecursive();
		int sumOfNum = sum.calculateSumNumbers(12345);
		System.out.println("Sum is : " +sumOfNum);

	}
	
	public int calculateSumNumbers(int number)
	{
		int sum = 0;
		
		if(number==0)
		{
			return sum;
		}
		else {
			sum+=number%10;
			calculateSumNumbers(number/10);
			
		}
		return 0;
		
	}

}
