import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.browser.Browser;
// this code is for clicking on create account
public class Login {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.zomato.com");
		
		driver.manage().window().maximize();

				driver.get("https://www.zomato.com");
				//driver.findElement(By.linkText("Sign up")).click();// for sign up
				driver.findElement(By.linkText("Log in")).click();// for login 
				//driver.findElement(By.id("Log in")).click();
				//driver.findElement(By.linkText("Create account")).click();
				 Thread.sleep(5000);
				  
				  driver.findElement(By.xpath("/html/body/div[6]/div/div[2]/section[2]/section/p[2]/span")).click();
				  driver.findElement(By.xpath("/html/body/div[6]/div/div[2]/section[2]/section/div[1]/section/section/input")).sendKeys("Rupesh");
				  driver.findElement(By.xpath("/html/body/div[6]/div/div[2]/section[2]/section/section/section/input")).sendKeys("rupesh99326@gmail.com");
				  driver.findElement(By.xpath("/html/body/div[6]/div/div[2]/section[2]/section/div[2]/label/input")).click();
				  WebElement userin = driver.findElement( By.xpath("//span[normalize-space()='Create account']"));
				  if(userin.isEnabled()) {
					  
					  userin.click();
					 
				  }
				  
				  else
				  {
					  System.out.println("the button is invalid ");
				  }
				  
				  System.out.println("Login Successful");
				  
				  
				Browser.close();
		
	}

}