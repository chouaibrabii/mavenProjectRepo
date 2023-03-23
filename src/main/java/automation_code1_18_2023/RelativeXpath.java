package automation_code1_18_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpath {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("http://tutorialsninja.com/demo/index.php?route=account/register");
		driver.findElement(By.xpath("//input[@id ='input-firstname']")).sendKeys("chouaib");
		driver.findElement(By.xpath("//input[@id = 'input-lastname']")).sendKeys("rabii");
		driver.findElement(By.xpath("//input[@id = 'input-email']")).sendKeys("chouaibrabii1@gmail.com");
		driver.findElement(By.xpath("//input[@id ='input-telephone']")).sendKeys("2025696360");
		driver.findElement(By.xpath("//input[@id ='input-password']")).sendKeys("casablanca17");
		driver.findElement(By.xpath("//input[@id ='input-confirm']")).sendKeys("casablanca17");
		
		driver.findElement(By.xpath("//input[@name='agree']")).click();
		driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
			

	}

}
