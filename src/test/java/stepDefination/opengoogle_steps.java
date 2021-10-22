package stepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class opengoogle_steps {
	WebDriver driver = null;
	
	@Given("I lauch Google Chrome Browser")
	public void i_lauch_google_chrome_browser() {
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\cucumbertesting\\Driver\\chromedriver.exe");
	    driver = new ChromeDriver();
	   
	   
	}
	@When("I open Google Homepage")
	public void i_open_google_homepage() {
	    String baseurl = "https://www.google.com";
	    driver.get(baseurl);
	    driver.findElement(By.id("L2AGLb")).click();
	}
	@Then("Google Homepage is display")
	public void google_homepage_is_display() {
	   String expectedPageTitle = "Google";
	   String actualpageTitle = driver.getTitle();
	   Assert.assertEquals(expectedPageTitle, actualpageTitle);
	   System.out.println(actualpageTitle);
	}
	@Then("Google Search button is present")
	public void google_search_button_is_present() {
		String expectedResult = "Google Search";
	    String actualResult = driver.findElement(By.name("btnK")).getAttribute("aria-label");
	    Assert.assertEquals(actualResult, expectedResult);
	    System.out.println("Happy Ending");
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.close();
	    
	}




}
