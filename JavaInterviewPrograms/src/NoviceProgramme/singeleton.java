package NoviceProgramme;

public class singeleton {

	private static singeleton s;
	private singeleton()
	{
		
	}
	static{
	s = new singeleton();
	}
	public static singeleton getInstance()
	{
		return s;
	}
	public static void main(String[] args) {

	}

}
