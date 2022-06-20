package Elements;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsJsExe {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", ".\\chrome\\chromedriver.exe");
		WebDriver w = new ChromeDriver();
		
		w.get("http://www.flipkart.com");
		
		WebElement close = w.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		close.click();
		
		
		Actions a = new Actions(w);
		WebElement searchb = w.findElement(By.xpath("//input[@name='q']"));
		a.sendKeys(searchb, "realme 9").build().perform();
		
		WebElement glass = w.findElement(By.className("L0Z3Pu"));
		a.click(glass).build().perform();
		
		WebElement mouseover = w.findElement(By.xpath("//a[starts-with(text(),'Login')]"));
		a.moveToElement(mouseover).build().perform();
		
		Thread.sleep(2000);
		//WebElement doublec = w.findElement(By.xpath("(//span[@class='_2I9KP_'])[6]"));
		//a.doubleClick(doublec).build().perform();
		
		//a.contextClick(doublec).build().perform();
		
//		searchb.clear();
//		
//		Robot r = new Robot();
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_DOWN);
//		
//		
//		
//		
//		
//		Thread.sleep(5000);
//		a.contextClick(searchb).build().perform();
//		Thread.sleep(1000);
//		r.keyPress(KeyEvent.VK_DOWN);
//		Thread.sleep(1000);
//		r.keyPress(KeyEvent.VK_DOWN);
//		Thread.sleep(1000);
//		r.keyPress(KeyEvent.VK_DOWN);
//		Thread.sleep(1000);
//		r.keyPress(KeyEvent.VK_ENTER);
//		Thread.sleep(1000);
//		r.keyRelease(KeyEvent.VK_ENTER);
//		Thread.sleep(1000);
//		r.keyRelease(KeyEvent.VK_DOWN);
//		Thread.sleep(1000);
//		r.keyRelease(KeyEvent.VK_DOWN);

		
		searchb.clear();
		Thread.sleep(3000);


		
		WebElement end = w.findElement(By.xpath("//a[contains(text(),'Corporate Information')]"));
		JavascriptExecutor js = (JavascriptExecutor)w;
		js.executeScript("arguments[0].scrollIntoView(true)",end);
		Thread.sleep(5000);
		js.executeScript("arguments[0].click()", end);
		
		
		
		Thread.sleep(5000);
		js.executeScript("arguments[0].setAttribute('value','Nothing phone')", searchb);
	}
}
