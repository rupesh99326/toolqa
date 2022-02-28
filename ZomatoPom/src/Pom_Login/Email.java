package Pom_Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Email {
	
	WebDriver driver;
	public Email(WebDriver driver) 
	{
        this.driver = driver;
	}
	
	By LoginEmail=By.linkText("Log in");
	By Email_btl=By.xpath("/html/body/div[6]/div/div[2]/section[2]/section/div[3]/span");
	By InputEmail=By.xpath("/html/body/div[6]/div/div[2]/section[2]/section/section/section/input");
	By EmailOtp=By.xpath("/html/body/div[6]/div/div[2]/section[2]/section/button/span");
	public void EmailLogin()
	{
		driver.findElement(LoginEmail).click();
	}
	public void ContinueWithMail()
	{
		driver.findElement(Email_btl).click();
	}
	
	public void LoginEmail() 
	{
		driver.findElement(InputEmail).sendKeys("rupesh99326@gmail.com");
	}
        
	public void  ClickEmail()
	{
		driver.findElement(EmailOtp).click();

	}
	public void close() 
	{
		driver.close();
	}

}
