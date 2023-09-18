package StepDef;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import POM.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HRMStep {

	WebDriver driver=null;
	
	LoginPage Lg=new LoginPage(driver);
	
	@Given("User is on login page")
	public void user_is_on_login_page() {
	    WebDriver driver = new EdgeDriver();
	    driver.get("https://www.facebook.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	    
	}

	@When("user enters username as {string}")
	public void user_enters_username_as(String User) {
	    Lg.User_Enters_Username(User);
	}

	@When("user enters password as {string}")
	public void user_enters_password_as(String Pass) {
	    Lg.User_Enters_Password(Pass);
	}

	@Then("User click on login button")
	public void user_click_on_login_button() {
	    Lg.user_Clicks_Login_Button();
	}
	
	@Then("user lands on Homepage")
	public void user_lands_on_Homepage() {
		String tt = driver.getTitle();
		System.out.println(tt);
	}
}
