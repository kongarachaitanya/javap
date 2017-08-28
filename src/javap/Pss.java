package javap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Pss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:/workspace/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		//WebDriver driver= new FirefoxDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.name("firstname")).sendKeys("kongara");
		driver.findElement(By.name("lastname")).sendKeys("sahithi");
		driver.findElement(By.name("reg_email__")).sendKeys("konsnsis@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("konsnsis@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Kpass@123");
		WebElement day= driver.findElement(By.name("birthday_day"));
		Select sel_day= new Select(day);
		sel_day.selectByVisibleText("12");
		WebElement month= driver.findElement(By.name("birthday_month"));
		Select sel_month= new Select(month);
		sel_month.selectByVisibleText("Jun");
		WebElement year= driver.findElement(By.name("birthday_year"));
		Select sel_year= new Select(year);
		sel_year.selectByVisibleText("2000");
		
		driver.findElement(By.id("u_0_i")).click();
		
		driver.findElement(By.name("websubmit")).click();


		
	}

}
