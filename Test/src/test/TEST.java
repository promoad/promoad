package test;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TEST 
{
	@Test
	public void te()
	{
		Reporter.log("sffs", true);
	}
	@Test
	public void m()
	{
		Reporter.log("sjkhhk", true);
		Assert.fail();
		
	}
}
 