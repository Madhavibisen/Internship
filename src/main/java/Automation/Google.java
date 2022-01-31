package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\Assignment_1\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();  
		driver.get("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys("Techdome Solutions Private Limited");
		Thread.sleep(400);
		driver.findElement(By.className("gNO89b")).click();
		driver.findElement(By.className("ab_button")).click();
		driver.findElement(By.linkText("Contact")).click();
		driver.findElement(By.className("img-fluid")).click();
	}
}

