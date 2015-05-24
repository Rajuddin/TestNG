package TestngPackage1;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameters1 {

	
	@Parameters({"first-name"})
	@Test
	public void parameter1(@Optional("optional value") String name)
	{
		System.out.println("This is parameter method: " + name);
		System.out.println("IVAPP-001");
	}
	
	
}
