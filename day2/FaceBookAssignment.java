package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v101.input.Input;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBookAssignment {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		//to open the browser
		ChromeDriver driver = new ChromeDriver();
		//Load the URL
		driver.get("http://www.facebook.com/");
		//to maximize the browser
		driver.manage().window().maximize();
		//Maximise the window
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Click on Create New Account button
		WebElement CreateAccount = driver.findElement(By.linkText("Create New Account"));
		CreateAccount.click();
		//Enter the first name
		WebElement Firstname = driver.findElement(By.name("firstname"));
		Firstname.sendKeys("Naveen");
		//Enter the last name
		WebElement LastName = driver.findElement(By.name("lastname"));
		LastName.sendKeys("Kumar");
		//Enter the mobile number
		WebElement MobileNumber = driver.findElement(By.name("reg_email__"));
		MobileNumber.sendKeys("8012044074");
		//Enterthe password
		WebElement Password = driver.findElement(By.id("password_step_input"));
		Password.sendKeys("Naveen@123");
		//Handle all the three drop downs
		WebElement Day = driver.findElement(By.id("day"));
		Select Day1 = new Select(Day);
		Day1.selectByVisibleText("22");
		WebElement Month = driver.findElement(By.id("month"));
		Select Day2 = new Select(Month);
		Day2.selectByIndex(4);
		WebElement year = driver.findElement(By.id("year"));
		Select Day3 = new Select(year);
		Day3.selectByVisibleText("1994");
		//Select the radio button "Female" 
		WebElement Radio = driver.findElement(By.name("sex"));
		Radio.click();
		
		
	}


}
