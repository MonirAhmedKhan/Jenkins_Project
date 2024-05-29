package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.Base;

public class EmployeeLoginPage extends Base{
	// Locator
	public static  By menuCustomerLogin =By.xpath("//a[text()='Customer Login']");

    public static  By menuEmployeeLogin = By.xpath("//a[@href='elogin.php']");

    public static  By EmpUserId = By.xpath("//input[@name='mailuid']");

    public static  By EmpUserPass = By.xpath("//input[@name='pwd']");

    public static  By butnEmpLogin = By.xpath("//input[@name='login-submit']");
    
//    public EmployeeLoginPage (WebDriver driver) {
//    this.driver = driver;
//    }
    
    // Actions
    
    public void menuCustomerLogin() {
    	click(menuCustomerLogin);
    }
    public void menuEmployeeLogin() {
    	click(menuEmployeeLogin);
    }
    public void empUserId(String userId) {
		sendKeys(EmpUserId,userId);
	}

}
