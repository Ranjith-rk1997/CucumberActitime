package hooks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import Drivers.DriverInstance;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.AfterStep;
import cucumber.api.java.Before;
import cucumber.api.java.BeforeStep;

public class Hooks extends DriverInstance {
	@BeforeStep
	public void beforeStep(Scenario scenario) {
		scenario.write("Start-execution");
	}
	@AfterStep
	public void afterStep(Scenario scenario) {
		scenario.write("finished - execution");
	}
	@Before
	public void beforeScenario(Scenario scenario) {
			System.setProperty("webdriver.chrome.driver","src/main/resources/driver/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.get("https://demo.actitime.com/login.do");
//		String name = scenario.getName();
//		System.out.println("Scenario name: "+name);
	}
	@After
	public void afterScenario(Scenario scenario) {
		boolean result = scenario.isFailed();
		System.out.println(result);
//		if(result==true) {
		t = (TakesScreenshot)driver;
		byte[]	res = t.getScreenshotAs(OutputType.BYTES);
		scenario.embed(res,"image/png");
//		}
		driver.quit();
	}
}
