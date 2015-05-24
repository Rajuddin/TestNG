package TestngPackage1;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Test
@Listeners(value = TestngPackage1.CustomListner.class)
public class Parameters2 {

	@Test(dataProvider="create", dataProviderClass = Parameter_dP1.class)
	public void dataProviderTest(Integer num)
	{
		System.out.println("Number using dataProviderAnotation is " + num);
	}
	
	public void customListnerMethod1()
	{
		System.out.println("Testing Custom Listner Method ");
	}
	
	
	@Test
	public void customListnerMethod2()
	{

			System.out.println("Testing Custom Listner Method2 ");
			Error e = null ;
			throw e;
		
		
	}
	public void customListnerMethod3()
	{
		System.out.println("Testing Custom Listner Method3 ");
	}
	
}
