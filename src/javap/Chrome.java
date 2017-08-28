package javap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;



public class Chrome {
@Test
	public  void tstng() throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:/workspace/browserdrivers/chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		driver.get( "http://testingmasters.com/hrm");
	    driver.findElement(By.id("txtUsername")).clear();
	    driver.findElement(By.id("txtUsername")).sendKeys("user02");
	    driver.findElement(By.id("txtPassword")).clear();
	    driver.findElement(By.id("txtPassword")).sendKeys("pass1234");
	  Thread.sleep(2000);
	    driver.findElement(By.id("btnLogin")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.linkText("Apply Leave")).click();
	    driver.findElement(By.id("applyleave_txtLeaveType")).click();
	    new Select(driver.findElement(By.id("applyleave_txtLeaveType"))).
	    selectByVisibleText("Annual Leave");
	    
	    
	    driver.findElement(By.id("applyleave_txtFromDate")).click();

	    driver.findElement(By.linkText("10")).click();
	    driver.findElement(By.id("applyleave_txtComment")).clear();
	    driver.findElement(By.id("applyleave_txtComment")).sendKeys("i love life");
	    driver.findElement(By.id("applyBtn")).click();
	   
	    driver.findElement(By.id("welcome")).click();
	    By option = By.linkText("Logout");
	    Thread.sleep(3000);
	    driver.findElement(option).click(); 
	    System.out.println("successfully executed");
	    driver.quit();
	}

}
