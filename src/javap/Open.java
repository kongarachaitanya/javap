
			
			package javap;

			import org.openqa.selenium.By;
			import org.openqa.selenium.WebDriver;
			import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


			public class Open {

				public static void main(String[] args) {
					// TODO Auto-generated method stub
					System.setProperty("webdriver.chrome.driver","E:/workspace/browserdrivers/chromedriver.exe");
					WebDriver driver= new ChromeDriver();
					driver.get( "http://testingmasters.com/hrm");
				    driver.findElement(By.id("txtUsername")).clear();
				    driver.findElement(By.id("txtUsername")).sendKeys("user02");
				    driver.findElement(By.id("txtPassword")).clear();
				    driver.findElement(By.id("txtPassword")).sendKeys("pass1234");
				    driver.findElement(By.id("btnLogin")).click();
				    driver.findElement(By.cssSelector("div.quickLaunge > a > img")).click();
				    
				    WebElement mySelectElement = driver.findElement(By.id("applyleave_txtLeaveType"));
				    Select dropdown= new Select(mySelectElement);
				    dropdown.selectByVisibleText("Annual Leave");
				    driver.findElement(By.cssSelector("img.ui-datepicker-trigger")).click();
				    driver.findElement(By.linkText("8")).click();
				    driver.findElement(By.id("applyleave_txtComment")).clear();
				    driver.findElement(By.id("applyleave_txtComment")).sendKeys("none");
				    driver.findElement(By.id("applyBtn")).click();
				}

			}
