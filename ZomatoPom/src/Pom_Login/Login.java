package Pom_Login;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {

	WebDriver driver;
	
	//Constructor that will be automatically called as soon as the object of the class is created
	public Login(WebDriver driver) {
          this.driver = driver;
	}
          
      	By loginanchor = By.linkText("Log in");
    	By logininput = By.xpath("//input[@placeholder='Phone number']");
    	By loginbtn = By.xpath("//span[normalize-space()='Send OTP']");
    	
    	public void loginAnchor() throws InterruptedException
    	{
    		
			driver.findElement(loginanchor).click();
    	
    		Thread.sleep(3000);
    	}
    	public void enterUsername() 
    	{
    		driver.findElement(logininput).sendKeys("8825283705");
    	}
    	public void clickLogin() throws InterruptedException 
    	{
    		WebElement lbtn = driver.findElement(loginbtn);
    		if (lbtn.isEnabled())
    		{
    			lbtn.click();
    		}
    		else{
    			System.out.println("the user is invalid");
    		}
    		System.out.println("Logged in");
    		Thread.sleep(30000);
    	}
    	
    	//public void close() throws InterruptedException 
    	//{
    		//driver.quit();
    		//Thread.sleep(5000);
    	//}
    	
    

}
