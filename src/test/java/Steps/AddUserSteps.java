package Steps;

import org.openqa.selenium.By;

import Drivers.DriverInstance;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class AddUserSteps extends DriverInstance {
	
	@Given("user should login as {string} and {string}")
	public void userShouldLoginAsAnd(String username, String password) {
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
	}

	@Given("user should click on user button")
	public void userShouldClickOnUserButton() {
		 driver.findElement(By.xpath("//div[@id='container_users']")).click();
	}

	@Given("user should click on new user button")
	public void userShouldClickOnNewUserButton() throws InterruptedException {
		driver.findElement(By.xpath("//div[text()='New User']")).click();
	}

	@Given("user create user as {string},{string} and {string}")
	public void userCreateUserAsAnd(String firstname, String lastname, String email) throws InterruptedException {
		Thread.sleep(2000);
		  driver.findElement(By.xpath("(//input[@name='firstName'])[2]")).sendKeys(firstname);
		  driver.findElement(By.xpath("(//input[@name='lastName'])[2]")).sendKeys(lastname);
		  driver.findElement(By.xpath("//input[@id='createUserPanel_emailField']")).sendKeys(email);
		  driver.findElement(By.xpath("//div[text()='Save & Send Invitation']")).click();
	}
	
	@Given("user should click on close button")
	public void userShouldClickOnCloseButton() {
	   driver.findElement(By.xpath("(//span[text()='Close'])[1]")).click();
	}

	@Then("user should logout")
	public void userShouldLogout() throws InterruptedException {
		Thread.sleep(1000);
		 driver.findElement(By.xpath("//a[text()='Logout']")).click();
	}
}
