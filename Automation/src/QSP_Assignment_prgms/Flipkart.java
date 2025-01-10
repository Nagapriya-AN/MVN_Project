package QSP_Assignment_prgms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

			public static void main(String[] args) throws Exception {
				WebDriver driver = new ChromeDriver();
				driver.get("https://www.flipkart.com/");
				driver.findElement(By.name("q")).sendKeys("iphone 16");
				Thread.sleep(3000);
				 List<WebElement> allSugg = driver.findElements(By.xpath("//input[@name='q']/../../../ul/li"));
				int count = allSugg.size();
				System.out.println(count);
				for(int i=0;i<count;i++)
				{
					String text = allSugg.get(i).getText();
					System.out.println(text);
				}
				allSugg.get(7).click();
				Thread.sleep(2000);
				driver.quit();
				
			}


	}
