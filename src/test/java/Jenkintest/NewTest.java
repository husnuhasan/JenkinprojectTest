package Jenkintest;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class NewTest {

	

	public class Login_Test {
		public WebDriver driver;
	    @BeforeClass
	    public void luanchApplication() {

			System.setProperty("webdriver.chrome.driver","C:\\Users\\HusnuSoudhaHasanAbdu\\Documents\\Automation training\\selenium jar files\\chromedriver_win32\\chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("http://demowebshop.tricentis.com/login");
	        
	    }
	    @Test(priority=1)
	    public void login() {
	        driver.findElement(By.id("Email")).sendKeys("manipal822@gmail.com");
	        driver.findElement(By.id("Password")).sendKeys("manipal123");
	        driver.findElement(By.xpath("//input[@type='submit'and @value='Log in']")).click();
	        String actualResult=driver.findElement(By.linkText("manipal822@gmail.com")).getText();
	        String expectedResult="manipal822@gmail.com";
	        Assert.assertEquals(actualResult, expectedResult);
	    }
	    @Test(priority=2)
	    public void clickLogout() {
	        driver.findElement(By.linkText("Log out")).click();
	    }
	    @AfterClass
	    public void closeApplication() {
	        driver.close();
	    }
	}

}
