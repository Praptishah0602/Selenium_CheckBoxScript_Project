package alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;


public class handlealert {

        public static void main(String[] args) throws InterruptedException {
            // TODO Auto-generated method stub

            System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver-win64\\chromedriver.exe");
//		WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            // Handel alert
            driver.get("https://the-internet.herokuapp.com/javascript_alerts");
            driver.manage().window().maximize();
            driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
            Thread.sleep(5000);
           Alert myalert= driver.switchTo().alert();
           System.out.println(myalert.getText());
           myalert.accept();

           //confirmation alert
            driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
            Thread.sleep(5000);
            driver.switchTo().alert().accept();//close using ok button
            driver.switchTo().alert().dismiss();//close using cancel button

        }

    }

