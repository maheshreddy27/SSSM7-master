package script;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Result;

public class DemoA extends BaseTest{
	@Test
	public void testA(){
		Reporter.log("Executing testA",true);
		Assert.fail();
		
		}
	
	@Test
	public void testB(){
		Reporter.log("Executing testB",true);
		Assert.fail();
	}
}
