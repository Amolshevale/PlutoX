package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	WebDriver driver;

	@FindBy(id="txtUsername")
	private WebElement username;

	@FindBy(xpath="//*[@id='txtPassword']")
	private WebElement password;
		
	@FindBy(xpath="//*[@id='btnLogin']")
	private WebElement loginButton;

		public Loginpage(WebDriver driver) {
			
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		
		public void login(String user, String pass) {
			
			username.sendKeys(user);
			password.sendKeys(pass);
			loginButton.click();
		}
		

}
