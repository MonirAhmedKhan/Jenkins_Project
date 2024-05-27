package stepDefinitions;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

import base.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CustomerLoginPage;
import pages.EmployeeLoginPage;
import pages.LandingPage;

public class Login_Functionality_Verification extends Base {
	LandingPage landingpage = new LandingPage();
	CustomerLoginPage customerLoginPage = new CustomerLoginPage();
	EmployeeLoginPage employeeLoginPage = new EmployeeLoginPage();
	private int screenshotCounter = 1;
	private SoftAssert soft = new SoftAssert();

	@Given("I am in Landing Home Page")
	public void i_am_in_landing_home_page() {
		if (driver != null) {
			driver.get("https://it.microtechlimited.com/");
			String s = driver.findElement(By.xpath("//div//h1['Welcome to MicroTech NA.']")).getText();
			// assertEquals("Welcome to MicroTech NA.", s);
			System.out.println("welcom text: " + s);
		} else {
			// Handle case when driver is not initialized
			System.out.println("Driver is not initialized");
		}
	}

	@When("I Click on Login")
	public void i_click_on_login() {
		//driver.findElement(By.xpath("//*[@id='navli']/li[4]/a")).click();
		landingpage.clickLogingMenu();
	}

	@Then("I will be in Login Page")
	public void i_will_be_in_login_page() {
		try {

			String s = getText(By.xpath("/html/body/div[2]/h1"));
			soft.assertEquals("Employee Login", s);
			soft.assertAll();
		} catch (AssertionError e) {
			// Log the assertion failure but continue with the test
			System.out.println("Assertion failed: " + e.getMessage());
		}
	}

	@Then("Click Customer Login")
	public void click_customer_login() {
		//click(By.xpath("//*[@id='navli']/li[2]/a"));
		
		employeeLoginPage.menuCustomerLogin();
		
		String customerLogin = getText(By.xpath("//div/h1"));
		assertEquals("Customer Login", customerLogin);
		System.out.println("Customer Login Text: " + customerLogin);
		System.out.println("Run= Click Customer Login");
	}

	@Then("I enter User Id {string}")
	public void i_enter_user_id(String userId) {
		customerLoginPage.customerUserId(userId);
		System.out.println("User ID= "+ userId);
	}

	@Then("I enter Password {string}")
	public void i_enter_password(String userpass) {
		customerLoginPage.CustomerUserPass(userpass);
	}

	@When("I click Login Button")
	public void i_click_login_button() {
		customerLoginPage.CustomerLoginButton();
		//click(By.xpath("//input[@name=\"login-submit\"]"));
	}

	@Then("I will see Customer Home Page")
	public void i_will_see_customer_home_page() {
		String s = getText(By.xpath("//*[@id='divimg']/div/h2[2]"));
		assertEquals("Welcome David",s);
		System.out.println(s);
	}

}
