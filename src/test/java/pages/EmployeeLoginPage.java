package pages;

import org.openqa.selenium.By;

import base.Base;

public class EmployeeLoginPage extends Base{
	// Locator
	public static  By menuCustomerLogin =By.xpath("//a[text()='Customer Login']");

    public static  By menuEmployeeLogin = By.xpath("//a[@href='elogin.php']");

    public static  By EmpUserId = By.xpath("//input[@name='mailuid']");

    public static  By EmpUserPass = By.xpath("//input[@name='pwd']");

    public static  By butnEmpLogin = By.xpath("//input[@name='login-submit']");
    
    
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
//    public void empUserPass(String pass) {
//  		sendKeys(EmpUserId,pass);
//  	}
    
//    public void employeeLoginButton() {
//    	click(butnEmpLogin);
//    }
    
}
