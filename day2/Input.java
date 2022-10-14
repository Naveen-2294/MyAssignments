package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.graphbuilder.curve.Point;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Input {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		//to open the browser
		ChromeDriver driver = new ChromeDriver();
		//Load the URL
		driver.get("https://www.leafground.com/input.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//input[@class='ui-inputfield ui-inputtext ui-widget ui-state-default ui-corner-all']")).sendKeys("Naveenkumar");
		driver.findElement(By.xpath("//input[@class='ui-inputfield ui-inputtext ui-widget ui-state-default ui-corner-all city ui-state-filled']")).sendKeys("  India");
		boolean enabled = driver.findElement(By.xpath("//div//input[@class='ui-inputfield ui-inputtext ui-widget ui-state-default ui-corner-all ui-state-disabled']")).isEnabled();
		System.out.println(enabled);
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@class='ui-inputfield ui-inputtext ui-widget ui-state-default ui-corner-all ui-state-filled'])[2]")).clear();
		String text=driver.findElement(By.xpath("(//input[@class='ui-inputfield ui-inputtext ui-widget ui-state-default ui-corner-all ui-state-filled'])[2]")).getAttribute("value");
		System.out.println(text);
		
		driver.findElement(By.xpath("(//input[@class='ui-inputfield ui-inputtext ui-widget ui-state-default ui-corner-all'])[2]")).sendKeys("22naveen94@gmail.com",Keys.TAB);
		Thread.sleep(3000);
	
		driver.findElement(By.xpath("//textarea[contains(@class,'ui-inputfield ui-inputtextarea ui-widget ui-state-default ui-corner-all ui-inputtextarea-resizable')]")).sendKeys("Hi Myself naveen");
		driver.findElement(By.xpath("//div[@class='ql-editor ql-blank']")).sendKeys("Hi Myself naveen");
		 driver.findElement(By.xpath("//div[@class='ql-editor ql-blank']")).getLocation();
		 driver.findElement(By.xpath("//input[@name='j_idt106:thisform:age']")).sendKeys(Keys.ENTER);
		 String Age = driver.findElement(By.xpath("//span[text()='Age is mandatory']")).getText();
		 System.out.println("The Error Message  "+Age);
		 driver.findElement(By.xpath("//input[@id='j_idt106:float-input']")).click();
	
		
}
}
