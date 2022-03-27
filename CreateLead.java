package week2.day1.assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("democsr");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("YYY");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Mangai");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("PL");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Manual Testing");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("mangaisree03@gmail.com");
	WebElement webele	= driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
	Select statepro = new Select(webele);
	statepro.selectByVisibleText("New York");
	
	driver.findElement(By.name("submitButton")).click();
	
	String text = driver.findElement(By.className("tabletext")).getText();
	System.out.println(text);
	
	
	
	String title = driver.getTitle();
	System.out.println(title);
	
		

	}

}
