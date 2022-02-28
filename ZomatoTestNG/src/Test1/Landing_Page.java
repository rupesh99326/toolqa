package Test1;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Landing_Page {
	WebDriver driver;
	
	@BeforeMethod
	public void initialCode() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.get("https://www.zomato.com/");
		driver.manage().window().maximize();
	}
	
	@Test(priority=1)
	public void Login_Val() throws InterruptedException
	{
		driver.findElement(By.linkText("Log in")).click();// for login
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("/html/body/div[6]/div/div[2]/section[2]/section/div[1]/div/input")).sendKeys("8777855082");
		  WebElement userPhone = driver.findElement( By.xpath("//span[normalize-space()='Send OTP']"));
		  if (userPhone.isEnabled()) 
		  {
			  userPhone.click();
			  Thread.sleep(40000);
		  }
		  else
		  {
			  System.out.println("the user is invalid");
			  Thread.sleep(20000);
		  }
		  	
		 
		  driver.quit();
	}
	@Test(priority=2)
	public void Gmail_Login() throws InterruptedException //Login with email 
	{
		driver.findElement(By.linkText("Log in")).click();// for login 
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[6]/div/div[2]/section[2]/section/div[4]/div")).click();
		String parent=driver.getWindowHandle();
		System.out.println(parent);
		Set<String>s=driver.getWindowHandles();
		Iterator<String> I1= s.iterator();
		 
		while(I1.hasNext())
		{
		 
		String child_window=I1.next();
		 

		if(!parent.equals(child_window))
		{
		driver.switchTo().window(child_window);
		 
		System.out.println(driver.switchTo().window(child_window).getTitle());
driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div/div[1]/div/div[1]/input")).sendKeys("rupesh99326@gmail.com");
	driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();
		}
		}
	}
	
	@Test(priority=3)
	public void Social_Login() throws InterruptedException
	{
		driver.findElement(By.linkText("Log in")).click();// for login 
		Thread.sleep(5000);
		 driver.findElement(By.xpath("/html/body/div[6]/div/div[2]/section[2]/section/p[2]/span")).click();
		 
		 
		 
		driver.findElement(By.xpath("/html/body/div[6]/div/div[2]/section[2]/section/div[1]/section/section/input")).sendKeys("Rupesh");
		  driver.findElement(By.xpath("/html/body/div[6]/div/div[2]/section[2]/section/section/section/input")).sendKeys("rupesh99326@gmail.com");
		  driver.findElement(By.xpath("/html/body/div[6]/div/div[2]/section[2]/section/div[2]/label/input")).click();
		WebElement userin = driver.findElement( By.xpath("//span[normalize-space()='Create account']"));
		  if(userin.isEnabled()) 
		  {
			  
			  userin.click();
		  }
		  
		  else
		  {
			  System.out.println("the button is invalid ");
		  }
	}
	@AfterTest
	public void closeBrowser()
	{
		driver.close();
		
	}
}
	