import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.browser.Browser;

public class Email {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.zomato.com");
		
		
		driver.manage().window().maximize();

				driver.get("https://www.zomato.com");
				driver.findElement(By.linkText("Log in")).click();// for login 
				Thread.sleep(5000);
				driver.findElement(By.xpath("/html/body/div[6]/div/div[2]/section[2]/section/div[3]/span")).click();
				driver.findElement(By.xpath("/html/body/div[6]/div/div[2]/section[2]/section/section/section/input")).sendKeys("rupesh99326@gmail.com");
				driver.findElement(By.xpath("/html/body/div[6]/div/div[2]/section[2]/section/button/span")).click();
				Thread.sleep(5000);
				
				driver.close();
				
		
	}

}
