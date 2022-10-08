package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {
	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		//to open the browser
		EdgeDriver driver = new EdgeDriver();
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
		//Click on Create Lead 
		WebElement elementCreateLead = driver.findElement(By.linkText("Create Lead"));
		elementCreateLead.click();
		//Enter CompanyName Field Using id Locator
		WebElement CompanyName = driver.findElement(By.id("createLeadForm_companyName"));
		CompanyName.sendKeys("CTS");
		//Enter FirstName Field Using id Locator
		WebElement FirstName = driver.findElement(By.id("createLeadForm_firstName"));
		FirstName.sendKeys("Naveen");
		//Enter LastName Field Using id Locator
		WebElement LastName = driver.findElement(By.id("createLeadForm_lastName"));
		LastName.sendKeys("Kumar");
		//Enter FirstName(Local) Field Using id Locator
		WebElement LastNameLocal = driver.findElement(By.id("createLeadForm_lastNameLocal"));
		LastNameLocal.sendKeys("Thangamuthu");
		//Enter Department Field Using any Locator of Your Choice
		WebElement Department = driver.findElement(By.id("createLeadForm_departmentName"));
		Department.sendKeys("BSC CS");
		//Enter Description Field Using any Locator of your choice 
		WebElement Description = driver.findElement(By.id("createLeadForm_description"));
		Description.sendKeys("I am working in Cognizant last 2 years");
		//Enter your email in the E-mail address Field using the locator of your choice
		WebElement EmailAddress = driver.findElement(By.id("createLeadForm_primaryEmail"));
		EmailAddress.sendKeys("22naveen94@gmail.com");
		//Click on Create Button
		WebElement CreateButton = driver.findElement(By.className("smallSubmit"));
		CreateButton.click();
		//Get the Title of Resulting Page. refer the video  using driver.getTitle()
		System.out.println("The Title of this web Application is "+ driver.getTitle());
	}

}
