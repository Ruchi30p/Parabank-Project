package Testlayer;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basepackage.BaseParabankClass;

public class Register extends BaseParabankClass {


	Register R;
	public Register() {
		super();
	}
	@BeforeMethod
	public void initsetup() {
		initiate();
		R=new Register();
	}
	@Test
	public void Register_T() throws InterruptedException {
		Thread.sleep(2000);
		R.Register_T();
		Thread.sleep(4000);
		
		
	}
	@AfterMethod
	public void close() {
		driver.close();
	}

}

