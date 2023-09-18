package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	//Declaration
	
	@FindBy(xpath="//*[@id='email']") WebElement UN; // (//*[@id='email'])
	@FindBy(xpath="//*[@id='pass']") WebElement PWD;
	@FindBy(xpath="//*[@id=\"u_0_5_9B\"]") WebElement LoginBtn;
	
	//initialization
	
	public LoginPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	//Utilization
	public void User_Enters_Username(String User) {
		UN.sendKeys(User);
	}
	
	public void User_Enters_Password(String Pass) {
		PWD.sendKeys(Pass);
	}
	
   public void user_Clicks_Login_Button() {
	   LoginBtn.click();
   }
	
	
}
