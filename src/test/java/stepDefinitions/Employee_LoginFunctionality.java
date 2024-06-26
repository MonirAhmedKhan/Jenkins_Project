package stepDefinitions;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import base.Base;
import io.cucumber.java.en.Then;


import pages.EmployeeLoginPage;

public class Employee_LoginFunctionality extends Base{
	EmployeeLoginPage employeeLoginPage= new EmployeeLoginPage();
	
	@Then("Click Employee Login")
	public void click_employee_login() {
		//click(By.xpath("//*[@id='navli']/li[3]/a"));
		
		employeeLoginPage.menuEmployeeLogin();
		String EMPTag = getText(By.xpath("/html/body/div[2]/h1"));
		assertEquals("Employee Login", EMPTag);
		System.out.println("EMP Login Text: " + EMPTag);
	}

	@Then("I enter User Id as {string}")
	public void i_enter_user_id_as(String userId) {
		employeeLoginPage.empUserId(userId);
		System.out.println("EMP user Id= "+userId );
	}

	@Then("I will see Employee Home Page")
	public void i_will_see_employee_home_page() {
		String WelcomeTag = getText(By.xpath("//h2[contains(text(),'Welcome')]"));
		assertEquals("Welcome Test", WelcomeTag);
		System.out.println(WelcomeTag);
	}

}
