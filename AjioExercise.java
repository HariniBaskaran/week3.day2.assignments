package week3.day2.assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AjioExercise {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement ele = driver.findElement(By.xpath("//input"));
		ele.sendKeys("bags");
		ele.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		System.out.println(driver.findElement(By.xpath("//div[@class='length']")).getText());
		List<WebElement> elements = driver.findElements(By.xpath("//div[@class='brand']"));
		Thread.sleep(3000);
		for(WebElement e:elements)
		{
			System.out.println(e.getText());
		}
		List<WebElement> elements1 = driver.findElements(By.xpath("//div[@class='nameCls']"));
		Thread.sleep(3000);
		for(WebElement e:elements1)
		{
			System.out.println(e.getText());
		}
	}

}
