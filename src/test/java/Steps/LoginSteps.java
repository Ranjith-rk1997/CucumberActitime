package Steps;

import org.openqa.selenium.By;
import org.testng.Assert;

import Drivers.DriverInstance;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps extends DriverInstance{
	
  @When("user click the login button") 
  public void userClickTheLoginButton() {
  driver.findElement(By.xpath("//div[text()='Login ']")).click(); 
  }
 

@Then("login should be success")
public void loginShouldBeSuccess() throws InterruptedException {
	Thread.sleep(3000);
	String title = driver.getTitle();
	String etitle= "actiTIME - Enter Time-Track";
	Assert.assertEquals(etitle,title);
}
@Then("user should click the logout button")
public void userShouldClickTheLogoutButton() {
	driver.findElement(By.id("logoutLink")).click();
}

@When("login should fail")
public void loginShouldFail() throws InterruptedException {
	 String aErrMsg=  driver.findElement(By.xpath("//span[text()='Username or Password is invalid. Please try again.']")).getText();
	 String eErrMsg = "Username or Password is invalid. Please try again.";
	 Assert.assertEquals(aErrMsg, eErrMsg);
}

  @Given("user enters the username as {string}") public void
  userEntersTheUsernameAs(String username) {
  driver.findElement(By.id("username")).sendKeys(username);
  }
  
  @Given("user entered the password as {string}") public void
  userEnteredThePasswordAs(String password) {
  driver.findElement(By.name("pwd")).sendKeys(password);
  }
 


}
