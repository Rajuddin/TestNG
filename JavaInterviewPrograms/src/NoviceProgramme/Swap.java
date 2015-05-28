package NoviceProgramme;

public class Swap {

	public static void main(String[] args) {
		Swap swap = new Swap();
		swap.swapTemp(10,20);
	}
	
	public void swapTemp(int x, int y)
	{
		System.out.println("Before swapping");
		System.out.println("x= "+ x);
		System.out.println("y= "+ y);
		int temp =0;
		temp = x;
		x=y;
		y=temp;
		
		System.out.println("After swapping");
		System.out.println("x= "+ x);
		System.out.println("y= "+ y);
	}
	
	public void swapWithoutTemp(int x, int y)
	{
		System.out.println("Before swapping");
		System.out.println("x= "+ x);
		System.out.println("y= "+ y);
		x= x+y;
		y=x-y;
	    x=x-y;
	    System.out.println("After swapping");
		System.out.println("x= "+ x);
		System.out.println("y= "+ y);
	}

}
