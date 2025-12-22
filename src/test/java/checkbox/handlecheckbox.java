package checkbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class handlecheckbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver-win64\\chromedriver.exe");
//		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		//select specific checkbox
		//driver.findElement(By.xpath("//input[@id='sunday']")).click();
		//select all checkbox
		List<WebElement> checkboxes= driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		/*for(int i=0;i<checkboxes.size();i++)
		{
			checkboxes.get(i).click();
		}*/
		
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
