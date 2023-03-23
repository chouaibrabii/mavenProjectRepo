package automation_code1_18_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absolut_Xpath {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https:http://tutorialsninja.com/demo/");
		driver.findElement(By.xpath("http://tutorialsninja.com/demo/index.php?route=account/register"));
		driver.findElement(By.xpath("//"));

	}

}
