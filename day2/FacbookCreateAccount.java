package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacbookCreateAccount {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		//to open the browser
		ChromeDriver driver = new ChromeDriver();
		//Load the URL
		driver.get("http://www.facebook.com/");
		//to maximize the browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement CreateAccount = driver.findElement(By.linkText("Create New Account"));
		CreateAccount.click();
		WebElement Firstname = driver.findElement(By.name("firstname"));
		Firstname.sendKeys("Naveen");
		WebElement LastName = driver.findElement(By.name("lastname"));
		LastName.sendKeys("Kumar");
		
	}

}
