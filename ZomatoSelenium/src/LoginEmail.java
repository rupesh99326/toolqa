import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LoginEmail {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.zomato.com");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Log in")).click();// for login
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("/html/body/div[6]/div/div[2]/section[2]/section/div[1]/div/input")).sendKeys("8825283705");
		  WebElement userPhone = driver.findElement( By.xpath("//span[normalize-space()='Send OTP']"));
		  if (userPhone.isEnabled()) 
		  {
			  userPhone.click();
		  }
		  else
		  {
			  System.out.println("the user is invalid");
		  }
		  	
		  Thread.sleep(10000);
		 
		// WebElement userProfile =driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/header/nav/ul[2]/li[3]/div/div/div[1]/span"));
		// WebElement TxtBoxContent = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/header/nav/ul[2]/li[3]/div/div/div[1]/span"));
		//System.out.println("yyuoiuyter");
		//*[@id="navigation_ckw6xqi3x00010zqq24870cvk"]/li[3]/div/div/div[1]/span
		        // String actualText = TxtBoxContent.getText();
		// System.out.println("Hellow world");
		 driver.manage().window().maximize();
		//String actualprofile = "Geetanjali";
		WebElement txt = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/header/nav/ul[2]/li[3]/div/div/div[1]/span"));
		Actions act=new Actions(driver) ;
		act.moveToElement(txt).click().build().perform();



		String actualText1 = txt.getText();
		System.out.println(actualText1);
		// System.out.println(actualText1);
		//if(userProfile== actualprofile)
		// {
		// System.out.println("We are on correct profile page ");
		// }
		//else
		//{
		//System.out.println("we are not in correct file ");

		//}
			
	}
	
	

}
