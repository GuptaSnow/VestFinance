package VestedFinanceProject.VestedFinanceProject;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import VestedFinanceProject.VestedFinanceProject.TestCasePage;
import junit.framework.TestCase;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.apache.commons.codec.binary.Base64;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestCaseTest {
	public WebDriver driver;
	TestCasePage obj_TestCasePage;
	
	@BeforeTest
	 public void login() throws InterruptedException {
		 //Login to the application
		System.setProperty("webdriver.chrome.driver","C:\\Users\\A575_o_AKSRATA\\Documents\\ChromeDriver\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://app.vested.co.in/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[text()='Login with Email']")).click();
        Thread.sleep(3000);
 
        //Providing decrypted password
        String password="U25vd2d1cHRhQDEyMDE="; 
        String decodedPassword= new String(Base64.decodeBase64(password.getBytes()));
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("snowgupta2015@gmail.com");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys(decodedPassword);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[3]/div[2]/div[2]/button/span")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"react-joyride-step-0\"]/div/div/div[1]/div[2]/div/button/span")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"react-joyride-step-1\"]/div/div/div[1]/div[2]/div/button[2]/span")).click();
        Thread.sleep(1000);
	 }
	 @Test
	 public void testcase() throws InterruptedException
	 {
		 TestCasePage obj_TestCasePage =new TestCasePage(driver);
		 obj_TestCasePage.ExploreTopMovers();
		 obj_TestCasePage.firstClickColumnHeader();
		 obj_TestCasePage.secondClickColumnHeader();
		 obj_TestCasePage.verifyColumnsSort();
		 obj_TestCasePage.clickWatchlist();
		 obj_TestCasePage.countWatchlist();
	 }
}
