package TestngPackage1;

import java.util.Collection;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.IResultMap;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;

public class CustomListner implements IInvokedMethodListener, ISuiteListener, ITestListener {

	@Override
	public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
		System.out.println("Before Method " + method.getTestMethod().getMethodName());		
	}

	@Override
	public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
		System.out.println("After Method " + method.getTestMethod().getMethodName());		
	}

	@Override
	public void onStart(ISuite suite) {

		System.out.println("Opened the browser");		
	}

	@Override
	public void onFinish(ISuite suite) {
		 System.out.println("closed the browser");
		 System.out.println("All test methods in the suite are" + suite.getAllMethods());
		
	}

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
			IResultMap passedTests = context.getPassedTests();
			IResultMap failedTests = context.getFailedTests();
			Collection<ITestNGMethod> passedTestMethods = passedTests.getAllMethods();
			Collection<ITestNGMethod> failedTestMethods = failedTests.getAllMethods();
			
			/**
			 * The method removes duplicate entries from list of passed tests and failed
			 * tests. If a test is found in both passed and failed lists, we consider
			 * the same as failed.
			 */
	/*		for (ITestNGMethod method : failedTestMethods)
			{
				if (passedTestMethods.contains(method))
				{
					passedTestMethods.remove(method);
				}
			}
				*/
			
				System.out.println("Total number of Passed Test Methods are :" + passedTestMethods.size());
				for (ITestNGMethod method : passedTestMethods)
				{
					System.out.println(method.getMethodName());
				}
			System.out.println("Total number of failed Test Methods are :" + failedTestMethods.size());
			
			for (ITestNGMethod method : failedTestMethods)
			{
				System.out.println(method.getMethodName());
			}

	}

}
