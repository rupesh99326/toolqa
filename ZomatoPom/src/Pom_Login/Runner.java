package Pom_Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Runner {

	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.zomato.com/");
		driver.manage().window().maximize();
		Login zomLogin= new Login(driver);
		Email zomMail= new Email(driver);
		 zomLogin=new Login(driver);
		
		zomLogin.loginAnchor();
	zomLogin.enterUsername();
	zomLogin.clickLogin();
	//zomLogin.close();
	System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
	WebDriver driver2=new ChromeDriver();
	driver2.get("https://www.zomato.com/");
	Thread.sleep(7000);

		zomMail.EmailLogin();
		Thread.sleep(5000);
		zomMail.ContinueWithMail();
		zomMail.LoginEmail();
		zomMail.ClickEmail();
	
	}

}
