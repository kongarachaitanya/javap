package javap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Internetexplorer {
@Test
	public void ie() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.ie.driver", "E:/workspace/browserdrivers/IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();;
		driver.get( "http://testingmasters.com/hrm");
		String title= driver.getTitle();
		System.out.println(title);
		if(title.contentEquals("OrangeHRM"))
		{
			System.out.println("pass");
		}
		 else
		{
			System.out.println("fail");
		}
		
	    driver.findElement(By.id("txtUsername")).clear();
	    driver.findElement(By.id("txtUsername")).sendKeys("user02");
	    driver.findElement(By.id("txtPassword")).clear();
	    driver.findElement(By.id("txtPassword")).sendKeys("pass1234");
	    driver.findElement(By.id("btnLogin")).click();
	   
	    driver.findElement(By.linkText("Apply Leave")).click();
	   // driver.findElement(By.id("applyleave_txtLeaveType")).click();
	    new Select(driver.findElement(By.id("applyleave_txtLeaveType"))).
	    selectByVisibleText("Annual Leave");
	    
	    
	   driver.findElement(By.id("applyleave_txtFromDate")).click();

	    driver.findElement(By.linkText("10")).click();
	    driver.findElement(By.id("applyleave_txtComment")).clear();
	    driver.findElement(By.id("applyleave_txtComment")).sendKeys("i love life");
	    driver.findElement(By.id("applyBtn")).click();
	    String title1= driver.getTitle();
		System.out.println(title1);
		
	    driver.findElement(By.id("welcome")).click();
	    driver.findElement(By.linkText("Logout")).click();
	    if(title1.contentEquals("OrangeHRM"))
		{
			System.out.println("pass");
		}
		 else
		{
			System.out.println("fail");
		}
	  
	}

}
