package MySelenium.login;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver-win64\\chromedriver.exe");
//		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//Program 2: Registration		 sunday
		/*driver.get("https://demo.nopcommerce.com/");
		
        // Maximize browser window
        driver.manage().window().maximize();
        
		Thread.sleep(2000);
		
		//Click the register button
		driver.findElement(By.xpath("//a[normalize-space(text())='Register']")).click();
		
		//Find and fill the firstname field
		driver.findElement(By.id("FirstName")).sendKeys("Prapti");
		
		//Find and fill the lastname field
		 driver.findElement(By.id("LastName")).sendKeys("Shah");

		 String s = driver.findElement(By.id("username")).getDomProperty("value");
		 String s1 = driver.findElement(By.id("password")).getDomProperty("value");
		 System.out.println(s);
		 System.out.println(s1);
		 
		 
		 driver.findElement(By.id("login")).click();*/
		
		driver.get("https://testautomationpractice.blogspot.com/");
		//select check box
		WebElement checkbox=driver.findElement(By.xpath("//input[@id='sunday']"));
		
		//capturing all the checkboxs
		
		List<WebElement> checkboxes = (List<WebElement>) driver.findElement(By.xpath("//input[@class='form-check-input' and type= 'checkbox']"));
//unselect the selected chedckbox

		for(int i=0;i<3;i++)
		{
			checkboxes.get(i).click();
		}
		Thread.sleep(5000);

		for(int i=0;i<checkboxes.size();i++)
		{
			if(checkboxes.get(i).isSelected())
			{
				checkboxes.get(i).click();
			}
		}

		 
	}

}
