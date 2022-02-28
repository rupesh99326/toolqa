package StepDefinition59;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Zom_Login {
    WebDriver driver = null;
	@Before public void setUp(){
		System.setProperty("webdriver.chrome.driver", "F:\\over\\chromedriver.exe");
		driver = new ChromeDriver();
    }
    @Given("^Zom_User is on Home Page$")
    public void user_is_on_home_page() {
        driver.get("https://www.zomato.com/");
        driver.manage().window().maximize();
        System.out.println("Background is printed");
    }
    

    
    @When("^Zom_User Navigate to Login PopUp$")
    public void user_navigate_to_login_popup() throws InterruptedException {
        //Login Starts
        driver.findElement(By.linkText("Log in")).click();
        System.out.println("Smoke is executed");
        Thread.sleep(5000);
    }


    @And("^Zom_User enters \"(.*)\"$")
    public void user_enters_and(String mobilenumber) throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[6]/div/div[2]/section[2]/section/div[1]/div/input")).sendKeys(mobilenumber);

        WebElement userPhone = driver.findElement(By.xpath("//span[normalize-space()='Send OTP']"));
        if (userPhone.isEnabled()) {
            userPhone.click();

            Thread.sleep(30000);
        } else {
            System.out.println("the user is invalid");
        }
    }

    @Then("^Message displayed Login Successfully$")
    public void message_displayed_login_successfully() {
        System.out.println("Logged in");
        driver.quit();
        //Login Ends
        
    }
    
    
    
    
    
    
    
    // Login Completed with phone number //
    // Login with Email//
    @Given("^user is on login1 page$")
    public void user_is_on_login1_page() {
        driver.get("https://www.zomato.com/");
        System.out.println("Regression test is executing");
        driver.manage().window().maximize();
        
}
    @When("^user clicks on loginbutton1$")
    public void user_clicks_on_loginbutton1() throws InterruptedException
    {
		driver.findElement(By.linkText("Log in")).click();// for login
		Thread.sleep(5000);
		
    }
    
    @When("^user clicks on continue with email")
    public void user_clicks_on_continue_with_email()
    {
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
		}
		}
    }
    @And("^user enters \"(.*)\"$")
    public void user_enters(String email)
    {
    	driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div/div[1]/div/div[1]/input")).sendKeys(email);
    		System.out.println("Enterd email");
    }
    @Then("^user Click_OTP$")
    public void user_Click_OTP()
    {
    	driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/div/button/span")).click();
    	System.out.println("Loginedd in email");
    }
    
 // continue with email
    @Given("^user is on login2 page$")
    public void user_is_on_login2_page()  {
        driver.get("https://www.zomato.com/");
        System.out.println("Regression and Smoke test executed");
        driver.manage().window().maximize();
    }
    @When("^user click on loginbutton2$")
    public void user_click_on_loginbutton2() throws InterruptedException
    {
    	driver.findElement(By.linkText("Log in")).click();// for login 
		Thread.sleep(5000);
    }
    @When("^user click on continue with mail$")
    public void user_click_on_continue_with_mail()
    {
    	driver.findElement(By.xpath("/html/body/div[6]/div/div[2]/section[2]/section/div[3]/span")).click();
    }
    @And ("user enter \"(.*)\"$")
    public void user_enter(String gmailid)
    {
		driver.findElement(By.xpath("/html/body/div[6]/div/div[2]/section[2]/section/section/section/input")).sendKeys(gmailid);

    }
    @Then("clicks on Next")
    public void clicks_on_Next() throws InterruptedException
    {
		driver.findElement(By.xpath("/html/body/div[6]/div/div[2]/section[2]/section/button/span")).click();
		Thread.sleep(5000);
		
		driver.close();

    }
}