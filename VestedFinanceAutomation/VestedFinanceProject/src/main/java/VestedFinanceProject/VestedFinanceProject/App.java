package VestedFinanceProject.VestedFinanceProject;

import org.apache.commons.codec.binary.Base64;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App 
{   

	
		WebDriver driver;
		
		public App(WebDriver driver)
		{
			this.driver = driver;
		}
		
		public void ExploreTopMovers() throws InterruptedException
		{    
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
			driver.findElement(By.xpath("//*[text()='Top Movers']")).click();
		    String title = driver.findElement(By.xpath("//*[text()='Top Movers']")).getText();
		    System.out.println(title);
		    driver.findElement(By.xpath("//*[text()='Top Movers']//following-sibling::p[text()='Show All']")).click();
		}
	

	
}
