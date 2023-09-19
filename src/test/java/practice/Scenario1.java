package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scenario1 {

	public static void main(String[] args) throws Throwable {

		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8888");
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//input[@type='submit']")).click();
	    driver.findElement(By.xpath("//a[text()='Contacts']")).click();
	    driver.findElement(By.xpath("//img[@title='Create Contact...']")).click();
	    driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Thilip");
	    driver.findElement(By.xpath("//input[@accesskey='S']")).click();
	   WebElement Admin = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
	   Actions a=new Actions(driver);
       a.moveToElement(Admin).perform();
       driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
	    
	    
	}

}
