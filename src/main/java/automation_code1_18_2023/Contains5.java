package automation_code1_18_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Contains5 {

	public static void main(String[] args) {


		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("http://tutorialsninja.com/demo/index.php?route=account/register");
		driver.findElement(By.xpath("//input[contains(@id,'input-firstname')]")).sendKeys("chouaib");
		driver.findElement(By.xpath("//input[contains(@id,'input-lastname')]")).sendKeys("rabii");
		driver.findElement(By.xpath("//input[contains(@id,'input-email')]")).sendKeys("chouaibrabii178@gmail.com");
		driver.findElement(By.xpath("//input[contains(@id,'input-telephone')]")).sendKeys("2025696360");
		driver.findElement(By.xpath("//input[contains(@id,'input-password')]")).sendKeys("casablanca17");
		driver.findElement(By.xpath("//input[contains(@id,'input-confirm')]")).sendKeys("casablanca17");
		
		driver.findElement(By.xpath("//input[contains(@name,'agree')]")).click();
		driver.findElement(By.xpath("//input[contains(@class,'btn btn-primary')]")).click();
		
		

	}

}
