package Elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", ".\\chrome\\chromedriver.exe");
		WebDriver w = new ChromeDriver();

		JavascriptExecutor js = (JavascriptExecutor)w;

		w.get("http://demo.guru99.com/test/guru99home/");

		WebElement frame = w.findElement(By.id("a077aa5e"));
		w.switchTo().frame(frame);


		WebElement img = w.findElement(By.xpath("//img[@src='Jmeter720.png']"));


		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView(true)", img);
		Thread.sleep(2000);
		img.click();
		w.switchTo().parentFrame();


		Thread.sleep(3000);		
		List<WebElement> frames = w.findElements(By.xpath("(//iframe)"));
		for (WebElement lists : frames) {
			String text = lists.getText();
			System.out.println(text);

		}
	}
}
