package Testlayer;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basepackage.BaseParabankClass;
import pompackage.Login;

public class LoginModuleTest  extends BaseParabankClass {
	Login L;
	public LoginModuleTest() {
		super();
	}
	@BeforeMethod
	public void initsetup() {
		initiate();
		L=new Login();
	}
	@Test
	public void login_TC() throws InterruptedException {
		Thread.sleep(2000);
		L.login();
		Thread.sleep(2000);
	}
	@AfterMethod
	public void close() {
		driver.close();
	}


}









