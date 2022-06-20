package Elements;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) throws IOException, InterruptedException {

		
		
		System.setProperty("webdriver.chrome.driver", ".\\chrome\\chromedriver.exe");
		WebDriver w = new ChromeDriver();

		JavascriptExecutor js = (JavascriptExecutor)w;
		w.get("http://demo.guru99.com/test/web-table-element.php");

		WebElement body = w.findElement(By.tagName("tbody"));
		
		js.executeScript("arguments[0].scrollIntoView(true)", body);
		List<WebElement> rows = body.findElements(By.tagName("tr"));
		for(int i = 0; i<rows.size();i++) {
			List<WebElement> columns = rows.get(i).findElements(By.tagName("td"));
			for(int j = 0;j<columns.size();j++) {
				String datas = columns.get(j).getText();
				if(datas.contains("Jet Airways")) {
					System.out.println(columns.get(3).getText());
				}
			
			}
			
		}
		TakesScreenshot sc = (TakesScreenshot)w;	
		File s = sc.getScreenshotAs(OutputType.FILE);
		File d = new File(".//report//report.png");
		FileUtils.copyFile(s, d);
		
		js.executeScript("window.scrollBy("+ 0 +"," + 300 + ");");
		
		Thread.sleep(2000);
		
		File s1 = sc.getScreenshotAs(OutputType.FILE);
		File d1 = new File(".//report//report1.png");
		FileUtils.copyFile(s1, d1);
		w.quit();
	}
}
