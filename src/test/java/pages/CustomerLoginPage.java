package pages;

import org.openqa.selenium.By;

import base.Base;

public class CustomerLoginPage extends Base {
	
	private static final By customerUserId = By.xpath("//input[@name='mailuid']");
	private static final By customerUserPass = By.xpath("//input[@name='pwd']");
	private static final By customerLoginButton = By.xpath("//input[@name='login-submit']");

	public void customerUserId(String userId) {
		sendKeys(customerUserId,userId);
	}
	public void CustomerUserPass(String userpass) {
		sendKeys(customerUserPass,userpass);
	}
	public void CustomerLoginButton() {
		click(customerLoginButton);
	}

}
