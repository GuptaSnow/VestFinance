package VestedFinanceProject.VestedFinanceProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestCasePage {
  public WebDriver driver;

  By TopMovers = By.xpath("//*[text()='Top Movers']");
  By ShowAll = By.xpath("//*[text()='Top Movers']//following-sibling::p[text()='Show All']");
  By Name = By.xpath("//table/thead/tr/th[text()='Name'][1]");
  By Symbol = By.xpath("//table/thead/tr/th[text()='Symbol']");
  By Price = By.xpath("//table/thead/tr/th[text()='Price']");
  By DailyChange = By.xpath("//table/thead/tr/th[text()='Daily Change']");
  By MarketCap = By.xpath("//table/thead/tr/th[text()='Market Cap']");
  By PERatio = By.xpath("//table/thead/tr/th[text()='P/E Ratio'][1]");
  By NameFirstRow = By.xpath("//*[@id=\"main\"]/div/div/div[3]/div[2]/div/div[1]/table/tbody/tr[1]/td[2]/a");
  By NameSensondRow = By.xpath("//*[@id=\"main\"]/div/div/div[3]/div[2]/div/div[1]/table/tbody/tr[2]/td[2]/a");
  By SymbolFirstRow = By.xpath("//*[@id=\"main\"]/div/div/div[3]/div[2]/div/div[1]/table/tbody/tr[1]/td[3]/a");
  By SymbolSecondRow = By.xpath("//*[@id=\"main\"]/div/div/div[3]/div[2]/div/div[1]/table/tbody/tr[2]/td[3]/a");
  By PriceFirstRow = By.xpath("//*[@id=\"main\"]/div/div/div[3]/div[2]/div/div[1]/table/tbody/tr[1]/td[4]");
  By PriceSecondRow = By.xpath("//*[@id=\"main\"]/div/div/div[3]/div[2]/div/div[1]/table/tbody/tr[2]/td[4]");
  By DailyChangeFirstRow = By.xpath("//*[@id=\"main\"]/div/div/div[3]/div[2]/div/div[1]/table/tbody/tr[1]/td[5]");
  By DailyChangeSecondRow = By.xpath("//*[@id=\"main\"]/div/div/div[3]/div[2]/div/div[1]/table/tbody/tr[2]/td[5]");
  By MarketCapFirstRow = By.xpath("//*[@id=\"main\"]/div/div/div[3]/div[2]/div/div[1]/table/tbody/tr[1]/td[6]");
  By MarketCapSecondRow = By.xpath("//*[@id=\"main\"]/div/div/div[3]/div[2]/div/div[1]/table/tbody/tr[2]/td[6]");
  By PERatioFirstRow = By.xpath("//*[@id=\"main\"]/div/div/div[3]/div[2]/div/div[1]/table/tbody/tr[1]/td[7]");
  By PERatioSecondRow = By.xpath("//*[@id=\"main\"]/div/div/div[3]/div[2]/div/div[1]/table/tbody/tr[2]/td[7]");
  By Watchlist = By.xpath("//*[@id=\"main\"]/div/div/div[3]/div[2]/div/div[1]/table/tbody/tr[1]/td[8]");
  By ClickStock = By.xpath("//*[@id=\"main\"]/div/div/div[3]/div[2]/div/div[1]/table/tbody/tr[1]/td[2]");
  By AddedWatchlist = By.xpath("//*[@id=\"main\"]/div/div[2]/div[2]/div[2]/p[2]");
  By Home = By.xpath("//span[text() = 'Home']");
  By ShowAllWatchlist = By.xpath("//*[@class='css-nk74yh ejmjp4a37']//*[@class=\"css-1l4w6pd ejmjp4a38\"]");
  By Watchlistfetch = By.xpath("//*[@id=\"main\"]/div/div[2]/div[3]/div[1]/div[2]");
  By WatchListverify = By.xpath("//p[text()='Watchlist']");
  By stk1 = By.xpath("//*[@id=\"main\"]/div/div/div[3]/div[2]/div/div[1]/table/tbody/tr[1]/td[8]");
  By stk2 = By.xpath("//*[@id=\"main\"]/div/div/div[3]/div[2]/div/div[1]/table/tbody/tr[2]/td[8]");
  By stk3 = By.xpath("//*[@id=\"main\"]/div/div/div[3]/div[2]/div/div[1]/table/tbody/tr[3]/td[8]");
  By stk4 = By.xpath("//*[@id=\"main\"]/div/div/div[3]/div[2]/div/div[1]/table/tbody/tr[4]/td[8]");
  By stk5 = By.xpath("//*[@id=\"main\"]/div/div/div[3]/div[2]/div/div[1]/table/tbody/tr[5]/td[8]");
  By stk6 = By.xpath("//*[@id=\"main\"]/div/div/div[3]/div[2]/div/div[1]/table/tbody/tr[6]/td[8]");
  By stk7 = By.xpath("//*[@id=\"main\"]/div/div/div[3]/div[2]/div/div[1]/table/tbody/tr[7]/td[8]");
  By stk8 = By.xpath("//*[@id=\"main\"]/div/div/div[3]/div[2]/div/div[1]/table/tbody/tr[8]/td[8]");
  By stk9 = By.xpath("//*[@id=\"main\"]/div/div/div[3]/div[2]/div/div[1]/table/tbody/tr[9]/td[8]");
  By stk10 = By.xpath("//*[@id=\"main\"]/div/div/div[3]/div[2]/div/div[1]/table/tbody/tr[10]/td[8]");
  By stk11 = By.xpath("//*[@id=\"main\"]/div/div/div[3]/div[2]/div/div[1]/table/tbody/tr[11]/td[8]");
  By stk12 = By.xpath("//*[@id=\"main\"]/div/div/div[3]/div[2]/div/div[1]/table/tbody/tr[12]/td[8]");
  public TestCasePage(WebDriver driver) {
    this.driver = driver;
  }

  // 2. Go to Dashboard > Explore > Top Movers and click on View all

  public void ExploreTopMovers() throws InterruptedException {
    driver.findElement(TopMovers).click();
    System.out.println("Test Case-1 Start");
    String title = driver.findElement(TopMovers).getText();
    // System.out.println(title);
    driver.findElement(ShowAll).click();
    System.out.println("Test Case-1 End");

  }

  // 3. On Explore page, click on the various column header to verify sort is working as expected.

  //Clicking on the name column should sort the values from A to Z on the first click 

  public void firstClickColumnHeader() throws InterruptedException {
    System.out.println("Test Case-3 Start");
    driver.findElement(Name);
    Thread.sleep(1000);
    driver.findElement(Symbol);
    Thread.sleep(1000);
    driver.findElement(Price);
    Thread.sleep(1000);
    driver.findElement(DailyChange);
    Thread.sleep(1000);
    driver.findElement(MarketCap);
    Thread.sleep(1000);
    driver.findElement(PERatio);
  }
  //Clicking on the name column should sort the values Z to A on the second click
  public void secondClickColumnHeader() throws InterruptedException {
    driver.findElement(Name);
    Thread.sleep(1000);
    driver.findElement(Symbol);
    Thread.sleep(1000);
    driver.findElement(Price);
    Thread.sleep(1000);
    driver.findElement(DailyChange);
    Thread.sleep(1000);
    driver.findElement(MarketCap);
    Thread.sleep(1000);
    driver.findElement(PERatio);
    System.out.println("Test Case-3 End");

  }

  //4. Verify Sort for column names - Name, Symbol, Price, Daily Change, Market Cap, P/E Ratio
  public void verifyColumnsSort() throws InterruptedException {
    // Check Name validation for Descending Order
    System.out.println("Test Case-4 Start");
    driver.getCurrentUrl();
    Thread.sleep(2000);
    WebElement nameCol = driver.findElement(Name);
    nameCol.click();
    String val1 = driver.findElement(NameFirstRow).getText();
    System.out.println(val1);
    String val2 = driver.findElement(NameSensondRow).getText();
    System.out.println(val2);
    // if (val1 < val2)
    if (val1.compareTo(val2) > 0)
      System.out.println("descending order");
    else
      System.out.println("ascending order");

    // Check Name validation for Descending Order    	
    nameCol.click();
    String val3 = driver.findElement(NameFirstRow).getText();
    System.out.println(val3);
    String val4 = driver.findElement(NameSensondRow).getText();
    System.out.println(val4);
    if (val3.compareTo(val4) > 0)
      System.out.println("descending order");
    else
      System.out.println("ascending order");

    // Check Symbol validation for Ascending Order 
    WebElement symCol = driver.findElement(Symbol);
    symCol.click();
    String sym1 = driver.findElement(SymbolFirstRow).getText();
    System.out.println(sym1);
    String sym2 = driver.findElement(SymbolSecondRow).getText();
    System.out.println(sym2);
    if (sym1.compareTo(sym2) > 0)
      System.out.println("descending order");
    else
      System.out.println("ascending order");
    // Check Symbol validation for Descending Order    	
    symCol.click();
    String sym3 = driver.findElement(SymbolFirstRow).getText();
    System.out.println(sym3);
    String sym4 = driver.findElement(SymbolSecondRow).getText();
    System.out.println(sym4);
    if (sym3.compareTo(sym4) > 0)
      System.out.println("descending order");
    else
      System.out.println("ascending order");

    // Check Price validation for Ascending Order 
    WebElement priceCol = driver.findElement(Price);
    priceCol.click();
    String price1 = driver.findElement(PriceFirstRow).getText();
    System.out.println(price1);
    String price2 = driver.findElement(PriceSecondRow).getText();
    System.out.println(price2);
    int compareResult = price1.compareTo(price2);
    if (compareResult < 0)
      System.out.println("descending order");
    else if (compareResult > 0)
      System.out.println("ascending order");

    // Check Price validation for Descending Order    	
    priceCol.click();
    String price3 = driver.findElement(PriceFirstRow).getText();
    System.out.println(price3);
    String price4 = driver.findElement(PriceSecondRow).getText();
    System.out.println(price4);
    int compareResult2 = price3.compareTo(price4);
    if (compareResult2 < 0)
      System.out.println("ascending order");
    else if (compareResult2 > 0)
      System.out.println("descending order");

    // Check daily-change validation for Ascending Order 
    WebElement dchangeCol = driver.findElement(DailyChange);
    dchangeCol.click();
    String dchange1 = driver.findElement(DailyChangeFirstRow).getText();
    System.out.println(dchange1);
    String dchange2 = driver.findElement(DailyChangeSecondRow).getText();
    System.out.println(dchange2);
    int compareChange = dchange1.compareTo(dchange2);
    if (compareChange < 0)
      System.out.println("ascending order");
    else if (compareChange > 0)
      System.out.println("descending order");

    // Check daily-change validation for Descending Order    	
    dchangeCol.click();
    String dchange3 = driver.findElement(DailyChangeFirstRow).getText();
    System.out.println(dchange3);
    String dchange4 = driver.findElement(DailyChangeSecondRow).getText();
    System.out.println(dchange4);
    int compareChange2 = dchange3.compareTo(dchange4);
    if (compareChange2 < 0)
      System.out.println("descending order");
    else if (compareChange2 > 0)
      System.out.println("ascending order");

    // Check Market-Cap validation for Ascending Order
    WebElement mcapCol = driver.findElement(MarketCap);
    mcapCol.click();
    String mcap1 = driver.findElement(MarketCapFirstRow).getText();
    System.out.println(mcap1);
    String mcap2 = driver.findElement(MarketCapSecondRow).getText();
    System.out.println(mcap2);
    int comparemcap = mcap1.compareTo(mcap2);
    if (comparemcap < 0)
      System.out.println("descending order");
    else if (comparemcap > 0)
      System.out.println("ascending order");

    // Check Market-Cap validation for Descending Order    	
    mcapCol.click();
    String mcap3 = driver.findElement(MarketCapFirstRow).getText();
    System.out.println(mcap3);
    String mcap4 = driver.findElement(MarketCapSecondRow).getText();
    System.out.println(mcap4);
    int comparemcap2 = mcap3.compareTo(mcap4);
    if (comparemcap2 < 0)
      System.out.println("ascending order");
    else if (comparemcap2 > 0)
      System.out.println("descending order");

    // Check P/E Ration validation for Ascending Order 

    WebElement perCol = driver.findElement(PERatio);
    perCol.click();
    String per1 = driver.findElement(PERatioFirstRow).getText();
    System.out.println(per1);
    String per2 = driver.findElement(PERatioSecondRow).getText();
    System.out.println(per2);
    int compareper = per1.compareTo(per2);
    if (compareper < 0)
      System.out.println("ascending order");
    else if (compareper > 0)
      System.out.println("descending order");

    // Check P/E Ration validation for Descending Order    	
    perCol.click();
    String per3 = driver.findElement(PERatioFirstRow).getText();
    System.out.println(per3);
    String per4 = driver.findElement(PERatioSecondRow).getText();
    System.out.println(per4);
    int compareper2 = per3.compareTo(per4);
    if (compareper2 < 0)
      System.out.println("descending order");
    else if (compareper2 > 0)
      System.out.println("ascending order");
    System.out.println("Test Case-4 End");
  }
  /* 5. Click on the "heart" against the stock to Watchlist,
     6. Open the stock page to verify the stock has been “added to watchlist”. */

  public void clickWatchlist() throws InterruptedException {
    System.out.println("Test Case-5,6 Start");
    driver.getCurrentUrl();
    Thread.sleep(3000);
    driver.findElement(Watchlist).click();
    driver.findElement(ClickStock).click();
    Thread.sleep(2000);
    String value1 = driver.findElement(AddedWatchlist).getText();
    //System.out.println(value1);
    String value2 = "ADDED TO WATCHLIST";

    if (value1.equals(value2))

      System.out.println("Added to watchlist successfully");
    else
      System.out.println("Not added to watchlist");
    System.out.println("Test Case-5,6 End");

  }

  //7. Verify that there are 20 stocks displayed in the table
  public void countWatchlist() throws InterruptedException {
    System.out.println("Test Case-7 Start");
    driver.findElement(Home).click();
    Thread.sleep(4000);
    driver.findElement(TopMovers).click();
    String title = driver.findElement(TopMovers).getText();
    driver.findElement(ShowAll).click();
    Thread.sleep(2000);
    driver.findElement(stk1).click();
    Thread.sleep(2000);
    driver.findElement(stk2).click();
    Thread.sleep(2000);
    driver.findElement(stk3).click();
    Thread.sleep(2000);
    driver.findElement(stk4).click();
    Thread.sleep(2000);
    driver.findElement(stk5).click();
    Thread.sleep(2000);
    driver.findElement(stk6).click();
    Thread.sleep(2000);
    driver.findElement(stk7).click();
    Thread.sleep(2000);
    driver.findElement(stk8).click();
    Thread.sleep(2000);
    driver.findElement(stk9).click();
    Thread.sleep(2000);
    driver.findElement(stk10).click();
    Thread.sleep(2000);
    driver.findElement(stk11).click();
    Thread.sleep(2000);
    driver.findElement(stk12).click();
    Thread.sleep(2000);
    driver.findElement(Home).click();
    Thread.sleep(2000);
    driver.findElement(Home).click();
    Thread.sleep(5000);
    driver.findElement(ShowAllWatchlist).click();
    System.out.println("OPen Show All");
    List < WebElement > links = driver.findElements(By.xpath("//a[@class = 'css-1sg6e0p eebo0bc1']"));
    int count = links.size();
    if (count >= 20)
      System.out.println("Number of Stocks in watchlist is equal to or more than 20");
    else
      System.out.println("Number of Stocks in watchlist = " + count);
    System.out.println("Test Case-7 End");
  }

}