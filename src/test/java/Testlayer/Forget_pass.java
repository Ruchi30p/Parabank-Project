package Testlayer;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basepackage.BaseParabankClass;

public class Forget_pass extends BaseParabankClass {
		Forget_pass F;
		public Forget_pass() {
			super();
		}
		@BeforeMethod
		public void initsetup() {
			initiate();
			F=new Forget_pass();
		}
		@Test
		public void forget_password() throws InterruptedException {
			F.forget_password();
		}
		@AfterMethod
		public void close() {
			driver.close();
		}

	}

