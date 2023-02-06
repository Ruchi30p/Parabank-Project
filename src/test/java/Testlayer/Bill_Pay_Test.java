package Testlayer;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basepackage.BaseParabankClass;
import pompackage.Bill_Pay;

public class Bill_Pay_Test extends BaseParabankClass{
	Bill_Pay B;
	public Bill_Pay_Test() {
		super();
	}
	@BeforeMethod
	public void initsetup() {
		initiate();
		B=new Bill_Pay();
	}
	@Test
	public void bill_pay_TC() throws InterruptedException {
		B.billpay();
	}
	@AfterMethod
	public void close() {
		driver.close();
	}

}

