package pompackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import basepackage.BaseParabankClass;

public class Bill_Pay  extends BaseParabankClass{
	@FindBy(xpath = "//body/div[@id='mainPanel']/div[@id='bodyPanel']/div[@id='leftPanel']/div[@id='loginPanel']/form[1]/div[1]/input[1]")
	public WebElement username;
	@FindBy(xpath = "//body/div[@id='mainPanel']/div[@id='bodyPanel']/div[@id='leftPanel']/div[@id='loginPanel']/form[1]/div[2]/input[1]")
	public WebElement password;
	@FindBy(xpath = "//body/div[@id='mainPanel']/div[@id='bodyPanel']/div[@id='leftPanel']/div[@id='loginPanel']/form[1]/div[3]/input[1]")
	public WebElement L_button;
	@FindBy(xpath = "//a[contains(text(),'Bill Pay')]")
	public WebElement Bill_link;
	@FindBy(xpath = "//tbody/tr[1]/td[2]/input[1]")
	public WebElement Payee_name;
	@FindBy(xpath = "//tbody/tr[2]/td[2]/input[1]")
	public WebElement Address;
	@FindBy(xpath = "//tbody/tr[3]/td[2]/input[1]")
	public WebElement City;
	@FindBy(xpath = "//tbody/tr[4]/td[2]/input[1]")
	public WebElement State;
	@FindBy(xpath = "//tbody/tr[5]/td[2]/input[1]")
	public WebElement Zip_code;
	@FindBy(xpath = "//tbody/tr[6]/td[2]/input[1]")
	public WebElement Phone;
	@FindBy(xpath = "//tbody/tr[8]/td[2]/input[1]")
	public WebElement Account_no;
	@FindBy(xpath = "//tbody/tr[9]/td[2]/input[1]")
	public WebElement Veryfy_account_no;
	@FindBy(xpath = "//tbody/tr[11]/td[2]/input[1]")
	public WebElement Amount;
	@FindBy(xpath = "//tbody/tr[13]/td[2]/select[1]")
	public WebElement From_account;
	@FindBy(xpath = "//tbody/tr[14]/td[2]/input[1]")
	public WebElement Send_button;
	
	public Bill_Pay () {
		PageFactory.initElements(driver, this);
	}
	public void billpay() throws InterruptedException {
		username.sendKeys("Ruchi90");
		password.sendKeys("Ruchi1234");
		L_button.click();
		Thread.sleep(3000);
		Bill_link.click();
		Thread.sleep(3000);
		Payee_name.sendKeys("Ruchita");
		Address.sendKeys("92 Maple Valley Street");
		City.sendKeys("Brampton");
		State.sendKeys("Ontario");
		Zip_code.sendKeys("L6P 2H3");
		Phone.sendKeys("6476871405");
		Account_no.sendKeys("1234567");
		Veryfy_account_no.sendKeys("1234567");
		Amount.sendKeys("1000");
		Select From=new Select(From_account);
		From.selectByIndex(1);
		Send_button.click();
		Thread.sleep(3000);
		
	}
	
	
	
	
	
	
	
	
	
	
	

}

