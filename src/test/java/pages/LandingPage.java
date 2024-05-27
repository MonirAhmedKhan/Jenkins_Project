package pages;

import org.openqa.selenium.By;

import base.Base;

public class LandingPage extends Base {
	// Locators
	   public static final By menuLogin = By.xpath("//a[text()='LOG IN']");
	   
	// Action
	   public void clickLogingMenu() {
		   click(menuLogin);
	   }
}
