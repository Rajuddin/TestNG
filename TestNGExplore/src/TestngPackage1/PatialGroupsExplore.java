package TestngPackage1;

import org.testng.annotations.Test;

@Test(groups= {"classLevelGroups"})
public class PatialGroupsExplore {

	@Test(groups = {"methodLevelGroups"})
	public void testP1()
	{
		System.out.println("Hello this is partial test1");
	}
	
	@Test
	public void testP2()
	{
		System.out.println("Hello this is partial test2");
	}
}
