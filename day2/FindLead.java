package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindLead {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		//to open the browser
		ChromeDriver driver = new ChromeDriver();
		//Load the URL
		driver.get("http://leaftaps.com/opentaps/control/main");
		//to maximize the browser
		driver.manage().window().maximize();
		//Enter UserName and Password Using Id Locator
		WebElement elementUserName = driver.findElement(By.id("username"));
		elementUserName.sendKeys("Demosalesmanager");
		WebElement elementPassword = driver.findElement(By.id("password"));
		elementPassword.sendKeys("crmsfa");
		//Click on Login Button using Class Locator
		WebElement elementLogin = driver.findElement(By.className("decorativeSubmit"));
		elementLogin.click();
		//Click on CRM/SFA Link
		WebElement elementCRMSFA = driver.findElement(By.linkText("CRM/SFA"));
		elementCRMSFA.click();
		//Click on Leads Button
		WebElement elementLeads = driver.findElement(By.linkText("Leads"));
		elementLeads.click();
		//Click Find leads
		WebElement FindLead = driver.findElement(By.linkText("Find Leads"));
		FindLead.click();
		//Enter first name
		WebElement NameID = driver.findElement(By.linkText("Name and ID"));
		NameID.click();
		WebElement FirtName = driver.findElement(By.xpath("(//input[@name='firstName'])[3]"));
		FirtName.sendKeys("Naveen");
		//Click Find leads button
		WebElement FindLeads = driver.findElement(By.xpath("//button[text()='Find Leads']"));
		FindLeads.click();
		//Click on first resulting lead
		Thread.sleep(5000);
	    WebElement FirstLead = driver.findElement(By.xpath("//a[@href='/crmsfa/control/viewLead?partyId=10084']"));
		FirstLead.click();
		//Verify title of the page
		System.out.println("This page title is "+driver.getTitle());
		//Click Edit
		WebElement Edit = driver.findElement(By.linkText("Edit"));
		Edit.click();
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("TCS");
		//Click Update
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		//Confirm the changed name appears
		System.out.println(driver.findElement(By.id("viewLead_companyName_sp")).getText());		
		//Close the browser (Do not log out)
		driver.close();
	
	}

}
