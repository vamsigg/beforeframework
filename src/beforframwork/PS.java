package beforframwork;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class PS {

	public void dothis()
	{
		System.out.println("i am here");
	}
	
	@BeforeMethod
	public void beforerun()
	{
		System.out.println("run me first");
	}
	
	@AfterMethod
	public void afterrun()
	{
		System.out.println("run me last");
	}
}
