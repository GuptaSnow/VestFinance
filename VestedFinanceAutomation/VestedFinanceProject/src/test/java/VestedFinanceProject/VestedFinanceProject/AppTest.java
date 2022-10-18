package VestedFinanceProject.VestedFinanceProject;

import org.testng.annotations.Test;

import VestedFinanceProject.VestedFinanceProject.App;
import static org.testng.AssertJUnit.assertTrue;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.codec.binary.Base64;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;



public class AppTest 
{ 
	public WebDriver driver;
	App obj_AppPage;

	 @BeforeTest
	 public void login() throws InterruptedException {
		 //Login to the application
		
		 
		// ChromeOptions o = new ChromeOptions();
       //  o.addArguments("--disable-notifications");
	       
        System.setProperty("webdriver.chrome.driver","C:\\Users\\A575_o_AKSRATA\\Documents\\ChromeDriver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
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


      driver.findElement(By.xpath("//*[text()='Top Movers']")).click();
      String title = driver.findElement(By.xpath("//*[text()='Top Movers']")).getText();
       System.out.println(title);
      driver.findElement(By.xpath("//*[text()='Top Movers']//following-sibling::p[text()='Show All']")).click();
      Thread.sleep(5000);
      
      /*List<WebElement> columns = driver.findElements(By.xpath("//table/thead/tr/th"));

      // Loop through the columns and click on each one to sort
      for (WebElement column : columns) {

      // Click on the column header to sort
     column.click();
     }*/
      // Check Name validation for Descending Order
     WebElement nameCol = driver.findElement(By.xpath("//table/thead/tr/th[text()='Name'][1]"));
     nameCol.click();
     
     String val1 = driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div[3]/div[2]/div/div[1]/table/tbody/tr[1]/td[2]/a")).getText();
     System.out.println(val1);
     String val2 = driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div[3]/div[2]/div/div[1]/table/tbody/tr[2]/td[2]/a")).getText();
     System.out.println(val2);
    // if (val1 < val2)
    	 if (val1.compareTo(val2) > 0)
    	 System.out.println("descending order");
     else
    	 System.out.println("ascending order");
     // Check Name validation for Descending Order    	
         nameCol.click();
         String val3 = driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div[3]/div[2]/div/div[1]/table/tbody/tr[1]/td[2]/a")).getText();
         System.out.println(val3);
         String val4 = driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div[3]/div[2]/div/div[1]/table/tbody/tr[2]/td[2]/a")).getText();
         System.out.println(val4);
        	 if (val3.compareTo(val4) > 0)
        	 System.out.println("descending order");
         else
        	 System.out.println("ascending order");
         
     
        	 // Check Symbol validation for Ascending Order 
        	 WebElement symCol = driver.findElement(By.xpath("//table/thead/tr/th[text()='Symbol']"));
        	     symCol.click();       	     
        	     String sym1 = driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div[3]/div[2]/div/div[1]/table/tbody/tr[1]/td[3]/a")).getText();
        	     System.out.println(sym1);
        	     String sym2 = driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div[3]/div[2]/div/div[1]/table/tbody/tr[2]/td[3]/a")).getText();
        	     System.out.println(sym2);
        	    	 if (sym1.compareTo(sym2) > 0)
        	    	 System.out.println("descending order");
        	         else
        	    	 System.out.println("ascending order");
        	     // Check Symbol validation for Descending Order    	
        	    	 symCol.click();
        	    	String sym3 = driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div[3]/div[2]/div/div[1]/table/tbody/tr[1]/td[3]/a")).getText();
        	        System.out.println(sym3);
        	         String sym4 = driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div[3]/div[2]/div/div[1]/table/tbody/tr[2]/td[3]/a")).getText();
        	         System.out.println(sym4);
        	        	 if (sym3.compareTo(sym4) > 0)
        	        	 System.out.println("descending order");
        	             else
        	        	 System.out.println("ascending order");
        	        	 
        	        	 
        	    // Check Price validation for Ascending Order 
        	        	 WebElement priceCol =  driver.findElement(By.xpath("//table/thead/tr/th[text()='Price']"));
        	        	 priceCol.click();       	     
        	        	     String price1 = driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div[3]/div[2]/div/div[1]/table/tbody/tr[1]/td[4]")).getText();
        	        	     System.out.println(price1);
        	        	     String price2 = driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div[3]/div[2]/div/div[1]/table/tbody/tr[2]/td[4]")).getText();
        	        	     System.out.println(price2);
        	        	     int compareResult = price1.compareTo(price2);
   	        	          if  (compareResult < 0)
   	        	      	 System.out.println("descending order");
	        	          else if (compareResult > 0)
     	        	    	 System.out.println("ascending order");
	        	          
        	   // Check Price validation for Descending Order    	
        	        	    	 priceCol.click();
        	        	         String price3 = driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div[3]/div[2]/div/div[1]/table/tbody/tr[1]/td[4]")).getText();
        	        	         System.out.println(price3);
        	        	         String price4 = driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div[3]/div[2]/div/div[1]/table/tbody/tr[2]/td[4]")).getText();
        	        	         System.out.println(price4);
        	        	         int compareResult2 = price3.compareTo(price4);
        	        	         if  (compareResult2 < 0)
        	   	        	      	 System.out.println("ascending order");
        		        	          else if (compareResult2 > 0)
        	     	        	    	 System.out.println("descending order");
        	        	         
   // Check daily-change validation for Ascending Order 
         WebElement dchangeCol = driver.findElement(By.xpath("//table/thead/tr/th[text()='Daily Change']"));
         dchangeCol.click();       	     
                	        	     String dchange1 = driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div[3]/div[2]/div/div[1]/table/tbody/tr[1]/td[5]")).getText();
                	        	     System.out.println(dchange1);
                	        	     String dchange2 = driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div[3]/div[2]/div/div[1]/table/tbody/tr[2]/td[5]")).getText();
                	        	     System.out.println(dchange2);
                	        	     int compareChange = dchange1.compareTo(dchange2);
           	        	          if  (compareChange < 0)
           	        	      	 System.out.println("ascending order");
        	        	          else if (compareChange > 0)
             	        	    	 System.out.println("descending order");
        	        	          
                	   // Check daily-change validation for Descending Order    	
           	        	       dchangeCol.click();
                	        	         String dchange3 = driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div[3]/div[2]/div/div[1]/table/tbody/tr[1]/td[5]")).getText();
                	        	         System.out.println(dchange3);
                	        	         String dchange4 = driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div[3]/div[2]/div/div[1]/table/tbody/tr[2]/td[5]")).getText();
                	        	         System.out.println(dchange4);
                	        	         int compareChange2 = dchange3.compareTo(dchange4);
                	        	         if  (compareChange2 < 0)
                	   	        	      	 System.out.println("descending order");
                		        	          else if (compareChange2 > 0)
                	     	        	    	 System.out.println("ascending order");
                	        	         
        // Check Market-Cap validation for Ascending Order 
                	        	         WebElement mcapCol = driver.findElement(By.xpath("//table/thead/tr/th[text()='Market Cap']"));
                	        	         mcapCol.click();       	     
                	        	                	        	     String mcap1 = driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div[3]/div[2]/div/div[1]/table/tbody/tr[1]/td[6]")).getText();
                	        	                	        	     System.out.println(mcap1);
                	        	                	        	     String mcap2 = driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div[3]/div[2]/div/div[1]/table/tbody/tr[2]/td[6]")).getText();
                	        	                	        	     System.out.println(mcap2);
                	        	                	        	     int comparemcap = mcap1.compareTo(mcap2);
                	        	           	        	          if  (comparemcap < 0)
                	        	           	        	      	 System.out.println("descending order");
                	        	        	        	          else if (comparemcap > 0)
                	        	             	        	    	 System.out.println("ascending order");
                	        	        	        	          
                	        	                	   // Check Market-Cap validation for Descending Order    	
                	        	           	        	       mcapCol.click();
                	        	                	        	         String mcap3 = driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div[3]/div[2]/div/div[1]/table/tbody/tr[1]/td[6]")).getText();
                	        	                	        	         System.out.println(mcap3);
                	        	                	        	         String mcap4 = driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div[3]/div[2]/div/div[1]/table/tbody/tr[2]/td[6]")).getText();
                	        	                	        	         System.out.println(mcap4);
                	        	                	        	         int comparemcap2 = mcap3.compareTo(mcap4);
                	        	                	        	         if  (comparemcap2 < 0)
                	        	                	   	        	      	 System.out.println("ascending order");
                	        	                		        	          else if (comparemcap2 > 0)
                	        	                	     	        	    	 System.out.println("descending order");
                	        	                	        	         
                	        	                	        	         // Check P/E Ration validation for Ascending Order 
                	        	                	        	         WebElement perCol = driver.findElement(By.xpath("//table/thead/tr/th[text()='P/E Ratio'][1]"));
                	        	                	        	         perCol.click();       	     
                	        	                	        	                	        	     String per1 = driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div[3]/div[2]/div/div[1]/table/tbody/tr[1]/td[7]")).getText();
                	        	                	        	                	        	     System.out.println(per1);
                	        	                	        	                	        	     String per2 = driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div[3]/div[2]/div/div[1]/table/tbody/tr[2]/td[7]")).getText();
                	        	                	        	                	        	     System.out.println(per2);
                	        	                	        	                	        	     int compareper = per1.compareTo(per2);
                	        	                	        	           	        	          if  (compareper < 0)
                	        	                	        	           	        	      	 System.out.println("ascending order");
                	        	                	        	        	        	          else if (compareper > 0)
                	        	                	        	             	        	    	 System.out.println("descending order");
                	        	                	        	        	        	          
                	        	                	        	                	   // Check P/E Ration validation for Descending Order    	
                	        	                	        	           	        	       perCol.click();
                	        	                	        	                	        	         String per3 = driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div[3]/div[2]/div/div[1]/table/tbody/tr[1]/td[7]")).getText();
                	        	                	        	                	        	         System.out.println(per3);
                	        	                	        	                	        	         String per4 = driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div[3]/div[2]/div/div[1]/table/tbody/tr[2]/td[7]")).getText();
                	        	                	        	                	        	         System.out.println(per4);
                	        	                	        	                	        	         int compareper2 = per3.compareTo(per4);
                	        	                	        	                	        	         if  (compareper2 < 0)
                	        	                	        	                	   	        	      	 System.out.println("descending order");
                	        	                	        	                		        	          else if (compareper2 > 0)
                	        	                	        	                	     	        	    	 System.out.println("ascending order"); 
     
    /* Thread.sleep(1000);
     driver.findElement(By.xpath("//table/thead/tr/th[text()='Symbol']")).click();
     driver.findElement(By.xpath("//table/thead/tr/th[text()='Price']")).click();
     driver.findElement(By.xpath("//table/thead/tr/th[text()='Daily Change']")).click();
     driver.findElement(By.xpath("//table/thead/tr/th[text()='Market Cap']")).click();
     driver.findElement(By.xpath("//table/thead/tr/th[text()='P/E Ratio'][1]")).click();*/
   
}
	 @Test
	 public void pageclasses() throws InterruptedException {
		 
			
		// obj_AppPage = new App(driver);
		// obj_AppPage.ExploreTopMovers();
		   
		  }
		
		/*@AfterTest 
		  public void closeBrowser()
		  {
			  driver.close();
		  }*/
		
			
	
}

