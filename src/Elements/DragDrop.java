package Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\chrome\\chromedriver.exe");
		WebDriver w = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor)w; 



		w.get("http://demo.guru99.com/test/drag_drop.html");

		WebElement sourcem = w.findElement(By.xpath("(//a[@class='button button-orange'])[1]"));
		WebElement sourcep = w.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
		WebElement sourcem1 = w.findElement(By.xpath("(//a[@class='button button-orange'])[3]"));
		WebElement sourcep1 = w.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
		WebElement sourceb = w.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
		WebElement sources = w.findElement(By.xpath("(//a[@class='button button-orange'])[6]"));
		WebElement sourceo = w.findElement(By.xpath("(//a[@class='button button-orange'])[7]"));
		WebElement sourcel = w.findElement(By.xpath("(//a[@class='button button-orange'])[8]"));


		WebElement target1 = w.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		WebElement target2 = w.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		WebElement target3 = w.findElement(By.xpath("(//li[@class='placeholder'])[3]"));
		WebElement target4 = w.findElement(By.xpath("(//li[@class='placeholder'])[4]"));

		Actions a = new Actions(w);
		js.executeScript("arguments[0].scrollIntoView(true)", target1);

		a.dragAndDrop(sourceb, target1).build().perform();
		a.dragAndDrop(sourcep1, target2).build().perform();
		a.dragAndDrop(sources, target3).build().perform();
		a.dragAndDrop(sourcep, target4).build().perform();
		
		WebElement result = w.findElement(By.xpath("(//a[@class='button button-green'])"));
		String text = result.getText();
		String f = "Perfect!";
		if(text.equals(f)) {
			System.out.println("got the expected result");
		}
	}
	
	
}
