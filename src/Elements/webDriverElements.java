package Elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webDriverElements {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\chrome\\chromedriver.exe");
		WebDriver w = new ChromeDriver();
		
		w.get("http://www.flipkart.com");
		
		WebElement close = w.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		close.click();
		
		WebElement search = w.findElement(By.className("_3704LK"));
		search.sendKeys("realme 9");
		
		WebElement glass = w.findElement(By.className("_34RNph"));
		glass.click();
		Thread.sleep(5000);
		List<WebElement> realme9 = w.findElements(By.xpath("(//div[contains(text(),'realme 9')])"));
		for (int i = 1; i<realme9.size();i++) {
			WebElement g = realme9.get(i);
			String text = g.getText();
			System.out.println(text);
		}
		WebElement one = realme9.get(4);
		one.click();
		
		
		
	}
}
