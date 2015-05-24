package TestngPackage1;

import org.testng.annotations.Test;

public class GroupsExplore {
	
	@Test(groups = {"group1", "group2"})
	public void method1()
	{
		System.out.println("This is method 1");
	}

	@Test(groups = {"group1"})
	public void method2()
	{
		System.out.println("This is method 2");
	}

	@Test(groups = {"group2"})
	public void method3()
	{
		System.out.println("This is method 3");
	}

	@Test(groups = {"group2"})
	public void method4()
	{
		System.out.println("This is method 4");
	}

}
