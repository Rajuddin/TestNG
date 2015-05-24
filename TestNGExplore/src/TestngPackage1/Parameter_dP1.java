package TestngPackage1;

import org.testng.annotations.DataProvider;

public class Parameter_dP1 {

	@DataProvider(name="create")
	public static Object[][] mydata()
	{
		return new Object[][]
				{
				new Object[] {new Integer(42)}
				};
	}
}
