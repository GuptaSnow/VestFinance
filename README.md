# VestFinance
Vest Fianance Automation Project

# Description of the Project
This project used to login into the application, explore stocks, and verify the user is able to sort the list and add a stock to the watchlist.
Created the maven project and used Page Object Model to create the framework and run the test script through TestNg.
Created the TestCasePage.java for Page class and TestCaseTest.java for Test Class.
In TestCasePage.java, created all the methods for the steps to perform the test and called the page class methods in test class.


#Dependencies
a)As created the project in Maven, all the dependencies added automatically. Some of the required dependencies added in pom.xml file through maven repositories website.
b)Used chromedriver for running the project in Chrome browser. I have downloaded the chromedriver.exe (Version - 106.0.5249.61) and placed it at the PC location.
(Note-Please download the chromedriver.exe according to your chrome browser and change the path line number 30 in the code(TestCaseTest.java)  accordingly.)

#Steps to run the project
a)After pulling the project from GITHUB, Please download the chromedriver.exe according to your chrome browser and change the path in the code(TestCaseTest.java) accordingly.
b)Right click on the testng.xml -> Select Run as -> Select TestNg Suite.
c)When test suite complete, check the report in test-output folder with name as emailable-report.html
8
