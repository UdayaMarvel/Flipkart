package Elements;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\chrome\\chromedriver.exe");
		WebDriver w = new ChromeDriver();
		
		w.get("https://demoqa.com/alerts");
		WebElement prompt = w.findElement(By.id("promtButton"));
		JavascriptExecutor js = (JavascriptExecutor)w;
		js.executeScript("arguments[0].scrollIntoView(true)", prompt);
		
		Thread.sleep(2000);
		
		
		prompt.click();
		Thread.sleep(5000);
		Alert prompta = w.switchTo().alert();
		prompta.sendKeys("carryme@gmail.com");
		prompta.accept();

		
	}
}
