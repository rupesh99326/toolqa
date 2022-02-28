import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleMail {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.zomato.com");
		
		
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com");
		driver.findElement(By.linkText("Log in")).click();// for login 
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[6]/div/div[2]/section[2]/section/div[4]/div")).click(); // Click on login
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
driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/div/button/span")).click();
		//driver.close();
		}
		 
		}
	}

}
