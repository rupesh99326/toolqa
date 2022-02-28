package Pom_Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Runner1 {

	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.zomato.com/");
		driver.manage().window().maximize();
		Login zomLogin= new Login(driver);
		Email zomMail= new Email(driver);
		zomMail.EmailLogin();
		Thread.sleep(5000);
		zomMail.ContinueWithMail();
		zomMail.LoginEmail();
		zomMail.ClickEmail();
	
	}

}