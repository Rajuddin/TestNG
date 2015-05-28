package NoviceProgramme;

public class MaxNumberArray {

	public static void main(String[] args) {

		int a[] = {2,15,8,10};
		MaxNumberArray max = new MaxNumberArray();
		max.findMaxNumber(a);

	}
	
	public void findMaxNumber(int[] number)
	{
		int one=0;
		int two=0;
		
		for(int n:number)
		{
			if(two<n)
			{
				one = two;
				two = n;
			}
			else if(one<n)
			{
				
				one = n;
			}
		}
		System.out.println("maximum number is "+ one);
		System.out.println("maximum number is "+ two);
	}

}
