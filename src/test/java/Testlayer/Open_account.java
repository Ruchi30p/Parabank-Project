package Testlayer;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basepackage.BaseParabankClass;

public class Open_account extends BaseParabankClass{

		Open_account O;
		public Open_account() {
			super();
		}
		@BeforeMethod
		public void initsetup() {
			initiate();
			O=new Open_account();
		}
		@Test
		public void checking_account() throws InterruptedException {
			O.checking_account();
			
		}
		@Test
		public void savings_account() throws InterruptedException {
			O.savings_account();
		}
		@AfterMethod
		public void close() {
			driver.close();
		}
	}
		



