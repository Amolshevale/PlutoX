package testNg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObject.Loginpage;



public class Testclass {
	
	public static WebDriver driver;
	Loginpage lp;
	@BeforeClass
	public void init() {
		
		
		WebDriverManager.chromedriver().setup();
		
		//Step-1
		driver =new ChromeDriver();
		
		//step-2
		driver.manage().window().maximize();
		
		//step-3
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		//step-4 Implicitly waits
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		
		lp=new Loginpage(driver);
		
		}
		
	
	@Test 
	  public void login() throws InterruptedException {
	
			
			lp.login("Admin", "admin123");
			
	  }
	  
	 
	  
	  @AfterClass
	  public void tearDown() {
		  
		  driver.close();
	  }


}
